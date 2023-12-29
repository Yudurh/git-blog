--코멘트
-- SQL은 대소문자 구분없음

-- database 선택
USE mydb;

-- 테이블 지우기
DROP TABLE member;

-- 테이블 생성
CREATE TABLE member (
-- NOT NULL : null아님
-- AUTO_INCREMENT : 1씩 자동증가
-- PRIMARY KEY : 기본키, 대부분 테이블에는 PK 1개 있어야됨
    memberno INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,membermember
    id VARCHAR(50),
    name VARCHAR(50)
);
-- 세션뷰를 새로고침 해야된다mydb

-- SQL 에서 따옴표 크기 구분 없음
-- 데이타(ROW 행) 추가하기
INSERT INTO MEMBER ( memberno, id , NAME ) VALUES(1,'hong','홍길동');

-- 데이타 검색(조회) 하기
-- * : 모든 컬럼의 데이타를 출력한다
SELECT * FROM member;
SELECT id, NAME FROM member;


-- 데이터 추가하기 - 컬럼이름 생략(단 모든 컬럼의 데이타를 넣을때)
INSERT INTO MEMBER VALUES(2,'tom','톰아저씨');
INSERT INTO MEMBER VALUES(3,'son','손흥민');
INSERT INTO MEMBER VALUES(4,'mask','머스크');
-- PK가 자동증가이므로 0으로 설정해도 된다
INSERT INTO MEMBER VALUES(0,'john','존');

SELECT * FROM member;


-- 데이터를 수정하기
-- MYSQL에서 예약어를 사용자 정의명으로 사용하고 싶을때
-- 	엑센트 문자로 좌우를 묶는다. 예) `select`
UPDATE member SET id='lee',`name`='미스터 리' WHERE memberno=1;

SELECT * FROM member;


-- 데이타 삭제하기

DELETE FROM member WHERE memberno=1;

SELECT * FROM member;

-- SQL CRUD
-- Create : insert
-- Read : select
-- Update : update
-- Delete : delete



