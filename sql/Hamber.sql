
  
  
  
  DROP DATABASE IF EXISTS kiosk;
CREATE DATABASE kiosk;
USE kiosk;

-- 상품정보
DROP TABLE if EXISTS item;
CREATE TABLE item(
    item_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
      item_code VARCHAR(255) NOT NULL UNIQUE, -- 상품 코드(UUID포맷-32자리)
      item_name VARCHAR(255) NOT NULL, -- 상품이름
    item_option VARCHAR(255) NULL, -- 단품, 세트
    item_price INT(255) NOT NULL, -- 가격
    item_image_url TEXT NOT NULL, -- 이미지
    item_update_datetime DATETIME DEFAULT NOW() -- 작성/수정 시간
);
INSERT INTO item VALUES(null, '123e4567-e89b-12d3-a456-556642440000', '베이컨버거', '단품', '35000', 'buger1.jpg', default);

SELECT * FROM item;
SELECT * FROM item where item_name LIKE "%베이컨%";

-- 장바구니
DROP TABLE if EXISTS cart;
CREATE TABLE cart (
    cart_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
      cart_code VARCHAR(255) NOT NULL UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
      item_code VARCHAR(255) NOT NULL UNIQUE, -- 상품 코드(UUID포맷-32자리)
    item_name TEXT NOT NULL, -- 상품이름
    item_option VARCHAR(255) NULL, -- 단품, 세트
    cart_item_amount INT(255) NOT NULL, -- 구매갯수
    cart_date DATETIME DEFAULT NOW() -- 장바구니에 담긴 시간/날짜
);

-- 결제정보
DROP TABLE if EXISTS order_1;
CREATE TABLE order_1 (
    order_no INT AUTO_INCREMENT PRIMARY KEY, -- 고유키
      -- 구매상품 정보
      cart_code_1 VARCHAR(255) NOT NULL UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
      cart_code_2 VARCHAR(255) UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
      cart_code_3 VARCHAR(255) UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
      cart_code_4 VARCHAR(255) UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
      cart_code_5 VARCHAR(255) UNIQUE, -- 장바구니 코드(UUID포맷-32자리)
      order_total_price INT NOT NULL, -- 주문 총금액
      order_total_count TINYINT NOT NULL, -- 주문 상품 개수
    -- 주문자/수령자 정보
      order_number INT NOT NULL, -- 주문자 번호
    -- 결제방법
      order_pay_type INT DEFAULT(01) NOT NULL, -- 01 신용카드 또는 02 간편결제
  -- 주문상태
  -- 결제완료 -> 상품 준비중 -> 상품 준비완료 -> 수령 완료( 기한후 폐기 )
      order_state VARCHAR(255) NOT NULL DEFAULT '결제완료',
      order_datetime DATETIME DEFAULT NOW() -- 결제시간
);

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