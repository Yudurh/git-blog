-- ex05
-- 조인 JOIN : 두개의 테이블을 서로 묶어서 하나의 결과를 만들어내는 것.

-- 조인의 종류 5가지
-- INNER JOIN : 등가조인 - 특정열의 값을 기준으로 값이 같은 행을 출력
-- LEFT (OUTER) JOIN : 테이블1의 행을 출력
-- RIGHT (OUTER) JOIN : 테이블2의 행을 출력
-- FULL OUTER JOIN : 모든 테이블의 행을 출력
-- CROSS JOIN : 모든 경우의 수의 행을 출력함.


USE market_db;

-- 데카르트 곱(CROSS JOIN) : 각 집합을 이루는 모든 원소의 순서쌍
-- member * buy 의 데카르트 곱 : member 10 * buy 12 = 120개의 행
-- 테이블 이름 별칭 member m


SELECT *
	FROM member m, buy b

SELECT COUNT(*)
	FROM member m, buy b

SELECT m.mem_id, m.mem_name, b.mem_id
	FROM member m, buy b
	ORDER BY m.mem_id;
	
-- INNER JOIN : 등가조인(내부조인)
-- 교집합, 두 테이블의 특정 열의 값이 일치한 행만 검색함
SELECT m.mem_id, m.mem_name, b.prod_name
	FROM member m, buy b
	WHERE m.mem_id = b.mem_id 
	ORDER BY m.mem_id;
	
	
SET @rownum := 0;
SELECT @rownum := @rownum+1 행번호, m.mem_id, m.mem_name 이름, b.prod_name 상품
	FROM member m, buy b
	WHERE m.mem_id = b.mem_id
	ORDER BY @rownum;	
	
-- ANSI(미국 표준협회) SQL : JOIN절을 명시적으로 사용하는 것을 권장
SET @rownum := 0;
SELECT @rownum := @rownum+1 행번호, m.mem_id, m.mem_name 이름, b.prod_name 상품
	FROM buy b
	INNER JOIN member m
	ON m.mem_id = b.mem_id
	ORDER BY @rownum;	

-- 연습문제 - INNER JOIN
-- 1. 지갑을 구매한 걸그룹의 이름과 아이디, 지갑의 가격, 구매 총액을 출력

	SELECT m.mem_id, m.mem_name, b.prod_name, b.price 가격,SUM( b.price * b.amount) 구매총액
	FROM member m, buy b
	WHERE m.mem_id = b.mem_id AND prod_name = '지갑'
	 -- ORDER BY m.mem_id
	GROUP BY m.mem_id;
-- 2. 구매총액이 1000원이 넘어가는 걸그룹이 이름,주소,전화번호1+전화번호2,데뷔일
--    을 출력하시오.
	SELECT m.mem_name 이름, m.addr 주소, CONCAT(m.phone1,m.phone2) 전화번호, m.debut_date 데뷔날짜
	FROM member m, buy b
	WHERE m.mem_id = b.mem_id 
	GROUP BY m.mem_name
	HAVING SUM( b.price * b.amount) > 1000
-- 3. 마마무 걸그룹이 구매한 제품이름 목록과 걸그룹이름과 구매 금액을 출력하시오.

SELECT m.mem_name 이름, b.prod_name, b.price
FROM member m, buy b
WHERE m.mem_id='MMU' AND m.mem_id=b.mem_id
GROUP BY b.prod_name

-- 4. 데뷔일이 2013년도 이상인 걸그룹의 목록과 구매 총액과 주소를 출력하시오.
SELECT m.mem_name 이름, SUM( b.price * b.amount) 구매총액, m.addr 주소
FROM member m, buy b
WHERE DATEDIFF(debut_date, "2013-01-01") >= 0 AND m.mem_id=b.mem_id
GROUP BY m.mem_id

SELECT buy.mem_id, SUM(price * amount) "구매 총액", addr
    FROM member
        INNER JOIN buy
        ON member.mem_id = buy.mem_id
    WHERE DATEDIFF(debut_date, "2013-01-01") >= 0
    GROUP BY buy.mem_id;

-- outer join(외부 조인)
-- LEFT OUTER JOIN : 왼쪽 테이블 행 전체 출력
-- RIGHT OUTER JOIN : 오른쪾 테이블 행 전체 출력
-- FULL OUTER JOIN : 왼쪽+오른쪽 테이블 행 전체 출력


-- LEFT JOIN
-- 전체 회원의 구매 기록(구매 기록이 없는 회원도 출력한다)
 SELECT m.mem_id, m.mem_name, b.prod_name, m.addr
 	FROM member m
 		LEFT OUTER JOIN buy b
 		ON m.mem_id = b.mem_id
 	ORDER BY m.mem_id;
-- 한번도 구매 기록이 없는 회원 정보를 출력
SELECT DISTINCT m.mem_id, m.mem_name, b.prod_name, m.addr
FROM member m
 		LEFT OUTER JOIN buy b
 		ON m.mem_id = b.mem_id
 		WHERE b.prod_name IS NULL
 	ORDER BY m.mem_id;
 	

-- RIGHT JOIN
SELECT m.mem_id, m.mem_name, b.prod_name, b.group_name
	FROM member m
	RIGHT OUTER JOIN buy b
	ON m.mem_id = b.mem_id
	WHERE b.group_name IS NOT NULL
	ORDER BY m.mem_id
	
	
-- FULL OUTER JOIN : A집합 + B집합
--						 : MySQL(MariaDB)에서는 지원안함

-- 다른 방법 : LEFT JOIN + RIGHT JOIN
-- JOIN은 열 + 열의 연결이다
-- UNION은 행 + 행의 연결이다.
-- 결과 행1(SELECT의 결과)
--   +
-- 결과 행2(SELECT의 결과)
	
	
SELECT mem_id, addr FROM member
UNION ALL 
SELECT mem_id, prod_name FROM buy


SELECT m.mem_id, b.prod_name, m.mem_name, m.addr
    FROM member m
        LEFT OUTER JOIN buy b
        ON m.mem_id = b.mem_id
-- 기본값 : UNION DISTINCT 
--        : 행과 행의 결과를 연결하는데, 중복제거한다.
-- UNION ALL 
UNION ALL
SELECT m.mem_id, b.prod_name, m.mem_name, m.addr
    FROM member m
        RIGHT OUTER JOIN buy b
        ON m.mem_id = b.mem_id;
        
        

-- UNION ALL : 중복된 결과도 허용
-- UNION DISTINCT : 중복된 결과는 제거


-- 열의 갯수는 맞춰야 한다




-- CROSS JOIN( 상호 조인 )
-- 모든 행과 행을 연결하는 조합 (데카르트 합)
-- buy 12행 * member 10행 = 120행
SELECT COUNT (*)
	FROM buy
		CROSS JOIN member;
		
SELECT *
	FROM buy
		CROSS JOIN member;
		
SELECT *
	FROM buy
		CROSS JOIN member
		WHERE buy.mem_id = 'BLK' AND member.addr = '서울';
		
-- SELF JOIN( 자체 조인 )
-- 자신의 테이블하고 조인한다.
SELECT m1.mem_id, m1.mem_name
	FROM member m1
		INNER JOIN member m2
		ON m1.mem_id = m2.mem_id
	ORDER BY m1.mem_id;
	
-- member m1 10 * m2 10 = 100
	SELECT COUNT(*)
	FROM member m1
		CROSS JOIN member m2;
		

	SELECT *
	FROM member m1
		CROSS JOIN member m2
	WHERE m1.mem_id = 'MMU' AND m2.addr ='경기';

