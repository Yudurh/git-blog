-- test
 
  
  DROP DATABASE IF EXISTS kiosk;
CREATE DATABASE kiosk;
USE kiosk;

-- 상품정보
DROP TABLE if EXISTS item;
CREATE TABLE item(
    item_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
    item_uuid VARCHAR(255) NOT NULL,
      item_name VARCHAR(255) NOT NULL, -- 상품이름
    item_price INT(255) NOT NULL -- 가격
);
SELECT UUID();kiosk
INSERT INTO item VALUES(NULL,UUID(), '버거', '5500');
INSERT INTO item VALUES(NULL,UUID(), '버거2', '4500');
INSERT INTO item VALUES(NULL,UUID(), '치킨', '6000');
INSERT INTO item VALUES(NULL,UUID(), '핫도그', '6500');
INSERT INTO item VALUES(NULL,UUID(), '콜라', '6000');
INSERT INTO item VALUES(NULL,UUID(), '아이스티', '6000');
INSERT INTO item VALUES(NULL,UUID(), '커피', '6000');
INSERT INTO item VALUES(NULL,UUID(), '파이', '6000');
INSERT INTO item VALUES(NULL,UUID(), '와플', '6000');
INSERT INTO item VALUES(NULL,UUID(), '세트1', '6000');

SELECT * FROM item;
SELECT * FROM item WHERE item_price>=6000;
kiosk
-- 장바구니
DROP TABLE if EXISTS cart;
CREATE TABLE cart (
    cart_no INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 고유키
    cart_item_no INT NOT NULL, -- item 테이블 pk
    item_name TEXT NOT NULL, -- 상품이름
    cart_item_price INT NOT NULL, -- 가격
    cart_item_amount INT(255) NOT NULL DEFAULT 1  -- 구매갯수
);cart
ALTER TABLE cart
		 ADD CONSTRAINT
		 FOREIGN KEY(cart_item_no) REFERENCES item(item_no);
		 DESC cart
		 
INSERT INTO cart VALUES(NULL, 1, '와퍼주니어', '5000',DEFAULT);
INSERT INTO cart VALUES(NULL, 2, '와퍼', '6000',DEFAULT);
INSERT INTO cart VALUES(NULL, 3, '불고기와퍼', '7000',DEFAULT);

SELECT * FROM cart;
INSERT INTO cart VALUES(NULL, 2, '와퍼', '6000',2);
SELECT item_name, SUM(cart_item_amount),SUM(cart_item_amount)*cart_item_price 
FROM cart 
group by cart_item_no 
ORDER BY SUM(cart_item_amount) DESC
LIMIT 1;

UPDATE cart SET cart_item_amount =  cart_item_amount + 1
WHERE item_name = '와퍼'

SELECT item_name, cart_item_price
FROM cart 

group BY cart_item_no
		 
		 SELECT item_name,cart_item_amount FROM cart group by cart_item_no
