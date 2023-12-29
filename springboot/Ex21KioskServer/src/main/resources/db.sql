-- db.sql
DROP DATABASE IF EXISTS kiosk;
CREATE DATABASE kiosk;
USE kiosk;

-- 상품정보
DROP TABLE if EXISTS item;
CREATE TABLE item(
    item_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
   item_code VARCHAR(255) NOT NULL UNIQUE, -- 상품 코드(UUID포맷-32자리)
   item_name VARCHAR(255) NOT NULL, -- 상품이름
    item_cate VARCHAR(255) NOT NULL, -- 카테고리
    item_recommend INT DEFAULT(0) NOT NULL, -- 추천메뉴 1 추천 0 추천아님
    item_price INT(255) NOT NULL, -- 가격
    item_image_url TEXT NOT NULL, -- 이미지
    item_update_datetime DATETIME DEFAULT NOW() -- 작성/수정 시간
);
INSERT INTO item VALUES(null, '123e4567-e89b-12d3-a456-556642440000', '베이컨버거', '단품', 0 , '35000', 'buger1.jpg', default);
INSERT INTO item VALUES(NULL, '456e4567-e89b-12d3-a456-556642440000', '토마토버거', '단품', 1 , '15000', 'buger2.jpg', DEFAULT);
SELECT * FROM item;

-- 장바구니
DROP TABLE if EXISTS cart;
CREATE TABLE cart (
    cart_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
   cart_code VARCHAR(255) NOT NULL UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
   item_code VARCHAR(255) NOT NULL UNIQUE, -- 상품 코드(UUID포맷-32자리)
    item_name TEXT NOT NULL, -- 상품이름
    item_image_url TEXT NOT NULL, -- 이미지
    item_price INT(255) NOT NULL, -- 가격
    cart_item_amount INT(255) NOT NULL, -- 구매갯수
    cart_date DATETIME DEFAULT NOW() -- 장바구니에 담긴 시간/날짜
);
INSERT INTO cart VALUES(null, '123e4567-e89b-12d3-a456-556642440000','123e4567-e89b-12d3-a456-556642440001', '베이컨버거', 'berger1.jpg','35000', '1', default);
SELECT * FROM cart;
-- 결제정보
DROP TABLE if EXISTS `order`;
CREATE TABLE `order` (
    order_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
      -- 구매상품 정보
    cart_item_code_1 VARCHAR(255) NOT NULL UNIQUE, -- 상품코드1(UUID포맷-32자리)
   cart_item_code_2 VARCHAR(255) UNIQUE, -- 상품코드2(UUID포맷-32자리)
   cart_item_code_3 VARCHAR(255) UNIQUE, -- 상품코드3(UUID포맷-32자리)
   cart_item_code_4 VARCHAR(255) UNIQUE, -- 상품코드4(UUID포맷-32자리)
     cart_item_code_5 VARCHAR(255) UNIQUE, -- 상품코드5(UUID포맷-32자리)
     order_total_price INT NOT NULL, -- 주문 총금액
     order_total_count TINYINT NOT NULL, -- 주문 상품 개수(최대 5개)
    -- 주문자/수령자 정보
    order_number INT NOT NULL, -- 주문자 임시번호(0 ~ 999)
    -- 결제방법
    order_pay_type INT DEFAULT(01) NOT NULL, -- 01 신용카드 또는 02 간편결제
  -- 주문상태
  -- 결제완료 -> 상품 준비중 -> 상품 준비완료 -> 수령 완료 or 기한후 폐기
    order_state VARCHAR(255) NOT NULL DEFAULT '결제완료',
    order_datetime DATETIME DEFAULT NOW() -- 결제시간
);
INSERT INTO `order` VALUES(null, '123e4567-e89b-12d3-a456-556642440000',null,null,null,NULL, '35000',1,123, DEFAULT,'결제완료',DEFAULT);
SELECT * FROM `order`
-- 영수증 정보
DROP TABLE if EXISTS receipt;
CREATE TABLE receipt (
    receipt_no INT AUTO_INCREMENT PRIMARY KEY, -- 고유키
    receipt_number INT NOT NULL UNIQUE, -- 영수증 번호
    receipt_machine_no INT NOT NULL UNIQUE, -- 키오스크 기기 번호(01,02...)
    receipt_company_name VARCHAR(255) NOT NULL, -- 회사 이름
    receipt_company_number VARCHAR(255) NOT NULL, -- 사업자 번호
    receipt_company_owner VARCHAR(255) NOT NULL, -- 대표자 이름
    receipt_company_phone VARCHAR(255) NOT NULL, -- 회사 전화번호
    receipt_datetime DATETIME DEFAULT NOW() -- 결제 시간
);

INSERT INTO receipt VALUES(NULL, 123, 01, '맥도날드 의정부점', 123-00-00000, '홍길동', '010-1234-5678', default);
SELECT * FROM receipt