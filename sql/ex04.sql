-- ex04

-- MySQL / MariaDB 의 테이타 타입
-- 정수형
-- INT : 4바이트 -21억 ~ 21억
-- BIGINT : 8바이트 -900경 ~ 900경
-- TINYINT : 1바이트 -128 ~ 127
-- SMALLINT : 2바이트 -32,768 ~ 32,767
CREATE TABLE `datatype_int`(
	tinyint_col TINYINT,
	small_col SMALLINT,
	int_col INT,
	bigint_col BIGINT 
);
INSERT INTO `datatype_int`datatype_int
	VALUE (127, 32767, 2147483647,9000000000000000000);
SELECT * FROM datatype_int;
-- out of range 오류 발생
INSERT INTO `datatype_int`
	VALUE (128, 32767, 2147483647,9000000000000000000);
SELECT * FROM datatype_int;

-- 실수형
-- float : 4바이트 : -3 * 10^38 ~ 3 * 10^38
-- doble : 8바이트 : +_1.787*10^308 


-- 문자형
-- CHAR(갯수) : 1~255 바이트, 갯수를 생략하면 1임. 자릿수 고정
-- VARCHAR(갯수) : MySQL 1~16383 바이트, MariaDB 1~255 바이트
-- TEXT(갯수) : 1~65535 바이트
-- LONGTEXT : 최대크기 4GB
-- 1. CHAR 는 고정형, VARCHAR는 유동형.
--		예) CHAR(10) = "ABC"  VARCHAR(10) = "ABC"
-- 2. CHAR가 속도가 더 빠르지만, 메모리 낭비가 생긴다
CREATE TABLE datatype_char (
	chal_col CHAR(255),
	varchar_col VARCHAR(255),
	text_col TEXT(65535)
);
INSERT INTO datatype_char VALUES ('문자열1','문자열2','문자열3');
SELECT * FROM datatype_char



-- 날짜형
-- 날짜타입 :  DATE 		<->      LocalDate
-- 			:  표현범위 "1000-01-01" ~ "9999-12-31" : 심볼: yyyy-mm-dd
-- 시간타입 : TIME 		<->   LocalTime 
--				:  표현범위 "00:00:01" UTC ~ "23:59:59" UTC : 심볼 HH:MM:SS
-- 날짜시간타입 : DATETIME <-> LocalDateTime
--					 : 표현범위 "1970-01-01 00:00:01" UTC ~ "999-12-31 23:59:59" UTC



--바이너리 데이터형 : BLOB
-- 그림이나 동영상 데이타를 기록 -> 파일업로드로 대체하는 것이 좋다
--											-> 파일 업로드 경로/이름을 VARCHAR/TEXT로 수록한다
-- BLOB 표현범위 : 65535 바이트
-- LONGBLOB 표현범위 : 4GB


-- 날짜관련 내장함수
SELECT CURRENT_DATE(); -- 현재날짜
SELECT CURRENT_TIME(); -- 현재시간
SELECT NOW(); -- 현재 날짜 시간
-- 회원가입후 몇 일이 지났는가? 
SELECT DATEDIFF ('2023-12-15', CURRENT_DATE()); --날짜간격
