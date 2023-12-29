-- test1
CREATE DATABASE exam;
USE exam;
CREATE TABLE g_group(
	g_group_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	g_name VARCHAR(10) NOT NULL,
	debut DATE NOT NULL,
	hit_song_id INT(3) NULL
);

INSERT INTO g_group VALUES (NULL, '원더걸스', '2007-09-12', 101);
INSERT INTO g_group VALUES (NULL, '소녀시대', '2009-06-03', 102);
INSERT INTO g_group VALUES (NULL, '카라', '2009-07-30', 103);
INSERT INTO g_group VALUES (NULL, '브라운아이드걸스', '2008-01-17', 104);
INSERT INTO g_group VALUES (NULL, '다비치', '2009-02-27', 105);
INSERT INTO g_group VALUES (NULL, '2NE1', '2009-07-08', 107);
INSERT INTO g_group VALUES (NULL, 'f(x)', '2011-04-20', 109);
INSERT INTO g_group VALUES (NULL, '시크릿', '2011-01-06', 110);
INSERT INTO g_group VALUES (NULL, '레인보우', '2010-08-12', 111);
INSERT INTO g_group VALUES (NULL, '에프터 스쿨', '2009-11-25', null);
INSERT INTO g_group VALUES (NULL, '포미닛', '2009-08-28', NULL);

SELECT * FROM g_group 

SELECT * FROM hit_song

SELECT g.g_name,g.hit_song_id,h.title,h.lyrics
FROM g_group g, hit_song h
WHERE g.hit_song_id = h.hit_song_id
ORDER by g.hit_song_id ASC;

SELECT DISTINCT g.g_group_id,g.g_name,g.hit_song_id,h.title,h.lyrics
FROM g_group g
 		LEFT OUTER JOIN hit_song h
 		ON g.hit_song_id = h.hit_song_id
 		WHERE  h.hit_song_id IS NOT NULL
 	ORDER BY  g.g_group_id ASC;

SELECT * FROM g_group 
ORDER BY debut ASC;

SELECT * FROM g_group 
WHERE g_name = '소녀시대'

SELECT * FROM g_group
WHERE  hit_song_id >100 AND hit_song_id<105
ORDER BY debut ASC;

SELECT g.g_group_id,g.g_name,g.hit_song_id
FROM g_group g
INNER JOIN hit_song h
ON g.hit_song_id = h.hit_song_id
WHERE h.title ='미스터'
GROUP BY g_group_id;


DROP TABLE hit_song 
DROP TABLE g_group
CREATE TABLE hit_song(
	hit_song_id INT(3) NOT NULL  AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	lyrics VARCHAR(100) NULL
);
ALTER TABLE hit_song AUTO_INCREMENT = 101;

INSERT INTO hit_song VALUES (NULL, 'Tell Me', 'tell me tell me tetetete tel me');
INSERT INTO hit_song VALUES (NULL, 'Gee', 'GEE GEE GEE GEE GEE BABY BABY');
INSERT INTO hit_song VALUES (NULL, '미스터', '이름이 뭐야 미스터');
INSERT INTO hit_song VALUES (NULL, 'Abracadabra', '이러다 미쳐 내가 여리여리');
INSERT INTO hit_song VALUES (NULL, '8282', 'Give me a call Baby baby');
INSERT INTO hit_song VALUES (NULL, '기대해', '기대해');
INSERT INTO hit_song VALUES (NULL, 'I Dont car', '다른여자들의다리를');
INSERT INTO hit_song VALUES (NULL, 'Bad Girl Good Girl', '앞에선한마디말도');
INSERT INTO hit_song VALUES (NULL, '피노키오', '뉴예삐오');
INSERT INTO hit_song VALUES (NULL, '별빛달빛', '너는내별빛내마음의별빛');
INSERT INTO hit_song VALUES (NULL, 'A', 'A워오우워오우워우우우');
INSERT INTO hit_song VALUES (NULL, '나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고');
INSERT INTO hit_song VALUES (NULL, 'LUV', '설레이나요');
INSERT INTO hit_song VALUES (NULL, '짧은치마', '짧은 치마를 입고 내가 길을 걸으면');
INSERT INTO hit_song VALUES (NULL, '위아래', '위 아래 위위 아래');
INSERT INTO hit_song VALUES (NULL, 'Dumb Dumb' , '너 땜에 하루종일'); 




membermember