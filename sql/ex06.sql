-- ex06

-- 테이블과 뷰

-- 새로운 데이타베이스 생성하기
DROP DATABASE if EXISTS naver_db;

CREATE DATABASE naver_db;
USE naver_db;

-- 새로운 테이블 생성
DROP TABLE if EXISTS member, buy;
CREATE TABLE MEMBER (
	mem_id CHAR(8) NOT NULL PRIMARY KEY,
	mem_name VARCHAR(10) NOT NULL,
	height TINYINT UNSIGNED NULL 
);mysoho
-- TINYINT UNSIGNED : 표현범위 0~255
-- NOT NULL : 제약조건 null값을 insert시 오류 발생!

-- desc 테이블의 정보를 보여줌
DESC MEMBER;

-- member 테이블 새로 생성
DROP TABLE if EXISTS member;

CREATE TABLE MEMBER (
	mem_id CHAR(8) NOT NULL,
	mem_name VARCHAR(10) NOT NULL,
	height TINYINT UNSIGNED NULL,
	PRIMARY KEY (mem_id)
);
DESC MEMBER;

-- 3번째 케이스
DROP TABLE if EXISTS member;

CREATE TABLE MEMBER (
	mem_id CHAR(8) NOT NULL,
	mem_name VARCHAR(10) NOT NULL,
	height TINYINT UNSIGNED NULL
);
ALTER TABLE MEMBER
	ADD CONSTRAINT 
	PRIMARY KEY (mem_id);
	
DESC MEMBER;



-- 4번째 케이스
DROP TABLE if EXISTS member;

CREATE TABLE MEMBER (
	mem_id CHAR(8) NOT NULL,
	mem_name VARCHAR(10) NOT NULL,
	height TINYINT UNSIGNED NULL,
	CONSTRAINT PRIMARY KEY PK_MEMBER_mem_id (mem_id)
);
-- PK_MEMBER_mem_id : DMBS안에서 사용하는 PK 변수
	
DESC MEMBER;
DESC buy;
-- 외래키 제약조건
-- 외래키 : foreign key - 한 테이블이 다른 테이블의 key 열을 공유하는 것
-- 테이블 삭제 순서 : 외래키가 있는 테이블 -> 참조되는 테이블 순서로 삭제해야됨


DROP TABLE if EXISTS MEMBER, buy;

CREATE TABLE MEMBER (
	mem_id CHAR(8) NOT NULL PRIMARY KEY,
	mem_name VARCHAR(10) NOT NULL,
	height TINYINT UNSIGNED NULL 
);

CREATE TABLE buy (
	num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	mem_id CHAR(8) NOT NULL,
	prod_name CHAR(6) NOT NULL,
	FOREIGN KEY(mem_id) REFERENCES member(mem_id) 
);

-- FOREIGN KEY 제약조건 : 
DESC MEMBER;
DESC buy;

-- member 테이블 재 생성하기
DROP TABLE member;
DROP TABLE buy;

CREATE TABLE buy (
	num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	mem_id CHAR(8) NOT NULL,
	prod_name CHAR(6) NOT NULL
);
ALTER TABLE buy
	ADD CONSTRAINT 
	FOREIGN KEY(mem_id) REFERENCES member(mem_id);
DESC buy;

-- MUL : Multiple Occurences Colum의 약자로서 다중 사용 컬럼이란 뜻
--		 : 한쪽에서는 기본키, 다른 곳에서는 외래키로 사용됨


-- 데이터 추가
INSERT INTO member VALUES ('blk', '블랙핑크', 163);
SELECT * FROM member;
INSERT INTO buy VALUES (NULL, 'blk', '지갑');
-- member 테이블에 없는 PINK 외래키 입력시 오류!
INSERT INTO buy VALUES (NULL, 'PINK', '맥북'); --에러발생
SELECT * FROM buy;


-- buy 테이블에서 참조하는 데이타를 삭제하는 경우
-- 데이타를 지우는 순서 : 참조하는 테이블 -> 참조되는 테이블 데이타 순으로
DELETE from buy WHERE mem_id='blk';
DELETE from member WHERE mem_id='blk';


-- 케이스) member 테이블의 mem_id가 수정되는 경우? buy 테이블의 데이타는?
-- 외래키의 키값이 수정되면, 자동으로 참조하는 키값도 수정되도록 할 수 있다.

INSERT INTO member VALUES ('blk', '블랙핑크', 163);

DROP TABLE buy;
CREATE TABLE buy (
	num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	mem_id CHAR(8) NOT NULL,
	prod_name CHAR(6) NOT NULL
);
ALTER TABLE buy
	ADD CONSTRAINT
	FOREIGN KEY(mem_id) REFERENCES member(mem_id)
	ON UPDATE CASCADE  -- 참조하는 키가 바뀌면 함꼐 바뀐다
	ON DELETE CASCADE; -- 참조하는 키가 지워지면 함꼐 지워진다
-- cascade = 폭포수

INSERT INTO buy VALUES(NULL, 'blk', '지갑');
INSERT INTO buy VALUES(NULL, 'blk', '맥북');
SELECT * FROM buy;

-- member 업데이트
UPDATE member SET mem_id='PINK' WHERE mem_id='blk';
SELECT * FROM member;
SELECT * FROM buy;

-- UNIQUE : 고유값 제약조건 - 중복된 값을 넣으면 오류
DROP TABLE buy;
DROP TABLE member;

CREATE TABLE member (
	mem_id CHAR(8) NOT NULL PRIMARY KEY,
	email CHAR(30) NULL UNIQUE 
);
DESC member;
INSERT INTO member VALUES ( 'blk', 'pink@gmail.com' );
INSERT INTO member VALUES ( 'blk', 'pink@gmail.com' ); -- 중복 오류 발생!


-- check : 입력시 데이타에 조건을 주는 제약조건

DROP TABLE member;
CREATE TABLE member (
	mem_id CHAR(8) NOT NULL PRIMARY KEY,
	height TINYINT UNSIGNED NULL CHECK(height >= 100)
);
INSERT INTO member VALUES ('blk', 163);
INSERT INTO member VALUES ('blk', 83); -- 조건 오류 발생



DROP TABLE member;
CREATE TABLE member (
	mem_id CHAR(8) NOT NULL PRIMARY KEY,
	medal_grade CHAR(10) NULL 
);
ALTER TABLE member
	ADD constraint
	CHECK (medal_grade IN ('금', '은', '동'));
	
INSERT INTO member VALUES ('blk', '금');
INSERT INTO member VALUES ('blk', '구리'); -- check 제약 조건 오류
SELECT * FROM member;


-- DEFAULT : 기본값 지정
DROP TABLE member;
CREATE TABLE member (
	mem_id CHAR(8) NOT NULL PRIMARY KEY,
	medal_grade CHAR(10) NULL DEFAULT '동' -- insert될때 기본값을 '동'으로 설정 
);
INSERT INTO member VALUES ('blk',NULL); -- null도 하나의 값이므로 null로 설정됨
INSERT INTO member VALUES ('apn',    ); -- 입력값이 없으면 오류
INSERT INTO member VALUES ('twc',DEFAULT); -- 기본값으로 설정
INSERT INTO member VALUES ('spc','금');

SELECT * FROM member;

-- 가상의 테이블 : 뷰(View)
-- 사용하는 이유
-- 1. 보안 : view는 기본적으로 Read Only이다.
--			  : DBMS 개발자는 여러명이 될 수 있다.
--			  : 모든 사람에게 최고권한(CRUD)을 주면 보안 문제가 생길 수 있다
-- 2. 복잡한 SQL을 단순화 시킬 수 있다 

USE market_db;
CREATE VIEW v_member
AS 
	SELECT mem_id, mem_name, addr FROM member;
	
SELECT * FROM v_member;
DESC v_member;

-- 복잡한 SQL을 뷰테이블로 만들어 보자
SELECT b.mem_id, m.mem_name, b.prod_name, m.addr,
	CONCAT(m.phone1, m.phone2) '연락처'
	FROM buy b
		INNER JOIN member m
		ON b.mem_id = m.mem_id;
		

-- 검색 결과를 뷰테이블에 저장하고 재사용함으로, SQL을 복잡한 것을 단순하게 한다.
CREATE VIEW v_member_buy
AS
SELECT b.mem_id, m.mem_name, b.prod_name, m.addr,
	CONCAT(m.phone1, m.phone2) '연락처'
	FROM buy b
		INNER JOIN member m
		ON b.mem_id = m.mem_id;

SELECT * FROM v_member_buy;
SELECT * FROM v_member_buy WHERE mem_name = '블랙핑크';


-- 이벤트 감지 : trigger
-- INSERT DELETE UPDATE 문이 작동할 때 자동으로 실행하는 SQL이다
-- 예) 회원탈퇴
-- 	1. member 테이블에서 DELETE문이 작동할 때
-- 	2. exit_member 탈퇴 회원 테이블에 INSERT 해 주도록 한다.
USE market_db;
CREATE TABLE trigger_table (
	id INT,
	txt VARCHAR(10)
);
INSERT INTO trigger_table VALUES(1, '홍길도');
INSERT INTO trigger_table VALUES(2, '변사또');
INSERT INTO trigger_table VALUES(3, '이순신');
SELECT * FROM trigger_table;

-- 트리거 선언 : 테이블에 트리거를 부착한다
DROP TRIGGER exitTigger;
DROP TRIGGER trigger_table;
-- 딜리미터 선언 - 일종의 배치처리이다.
DELIMITER $$
CREATE TRIGGER exitTrigger -- 트리거 이름
	AFTER DELETE   -- 삭제후 작동하도록 지정 (DELETE, UPDATE, INSERT 중 하나)
	ON trigger_table  -- 트리거를 부착할 테이블 이름
	FOR EACH ROW -- 각 행마다 적용함
BEGIN
	SET @msg = '회원이 탈퇴하셨습니다.';
END $$
DELIMITER ;


-- 트리거 사용

SET @msg := '';
DELETE FROM trigger_table WHERE id =1;
SELECT @msg;
SELECT * FROM trigger_table;

-- member 테이블에서 singer 테이블 생성하기
-- singer 테이블 행 삭제시 백업용 테이블 backup_singer 생성하기

CREATE TABLE singer 
AS 
    (SELECT mem_id, mem_name, mem_number, addr FROM member);
SELECT * FROM singer;

DROP TABLE IF EXISTS backup_singer;
CREATE TABLE backup_singer (
    mem_id        CHAR(8) NOT NULL,
    mem_name     VARCHAR(10) NOT NULL,
    mem_number  INT NOT NULL,
    addr             CHAR(2) NOT NULL,
    modType        CHAR(2), -- 변경된 타입. '수정' 또는 '삭제'
    modDate         DATE,    -- 변경된 날짜
    modUser     VARCHAR(30)  -- 변경한 사용자.    '관리자' 'user_id'
);
DESC backup_singer;



DELIMITER $$
CREATE TRIGGER singer_updateTrigger -- 트리거 이름
	AFTER UPDATE    -- 삭제후 작동하도록 지정 (DELETE, UPDATE, INSERT 중 하나)
	ON singer  -- 트리거를 부착할 테이블 이름
	FOR EACH ROW -- 각 행마다 적용함
BEGIN
	INSERT INTO backup_singer VALUES ( OLD.mem_id, OLD.mem_name,OLD.mem_number,OLD.addr,'수정', CURDATE(),CURRENT_USER()  );
END $$
DELIMITER ;

UPDATE singer SET addr = '영국' WHERE mem_id = 'blk'
SELECT * FROM singer;
SELECT * FROM backup_singer;


-- 삭제 트리거 생성하기
DELIMITER $$
CREATE TRIGGER singer_deleteTrigger 
	AFTER DELETE    
	ON singer  
	FOR EACH ROW 
BEGIN
	INSERT INTO backup_singer VALUES ( OLD.mem_id, OLD.mem_name,OLD.mem_number,OLD.addr,'삭제', CURDATE(),CURRENT_USER()  );
END $$
DELIMITER ;

DELETE FROM singer WHERE mem_number >=7;
SELECT * FROM singer;
SELECT * FROM backup_singer;
