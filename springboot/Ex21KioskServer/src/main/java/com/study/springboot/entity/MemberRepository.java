package com.study.springboot.entity;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

//Repository : 저장소, DB테이블과 1:1 매칭됨.
//http://localhost:8080/h2-console
//JpaRepository 인터페이스 : 스프링 JPA에서 Entity(테이블)에 대한
//           기본적인 조회, 삽입, 수정, 삭제가 가능하도록 만든 인터페이스이다.
//제네릭 <엔티티 클래스, PK 타입 >
// 클래스 implements 인터페이스 : 일반클래스에서 인터페이스 구현
// 인터페이스 extends 인터페이스 : 인터페이스 기능 확장
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    //JpaRepository의 기본함수
    //1. findAll() : SQL "select * from 테이블" 실행해줌.
    //2. findBy컬럼이름() : SQL "select * from 테이블 where 컬럼이름=값" 실행
    //    예) findById(2) : select * from member where id = 2
    //        findByUser_id("hong") : select * from member where user_id="hong"
    //3. save() : SQL insert문과 update문을 실행
    //          : id값을 보고 없으면 insert, 있으면 update한다.
    //4. delete() : SQL Delelte문을 실행
    //5. count() : 데이타 행의 갯수를 가져온다. select count(*) from table

    //1.확장함수 : 기본적인 함수만 쓰고 복잡하면 NativeSQL을 사용하는게 좋다
    //2.JPQL : Java Persistence Query language, JPA에서 지원하는 쿼리
    //3.Native SQL : 표준 SQL을 지원한다

    //1)find
    //private String user_id; 언더바는 생략된다. 단어와 단어사이는 대문자를 사용
    //SQL : select * from member where user_id = "param1"
    //확장함수
    List<MemberEntity> findByUserId(String param1);
    //JPQL
    @Query(value = "SELECT m FROM MemberEntity m WHERE m.userId = :userid")
    List<MemberEntity> findByUserId_JPQL(String userid);
    //Native SQL

    @Query(nativeQuery = true,value = "SELECT * FROM member WHERE user_id =:userid")
    List<MemberEntity> findByUserId_nativeQuery(String userid);


    // insert, update, delete
    //1. 확장함수 없음. 기본함수 save, delete 사용하면됨
    //2. JPQL
    //3. Native SQL(Query) : insert, update, delete문은
    //   @Modifyng, @Transactional을 써줘야 됨
    // @Modifying : 수정하는 쿼리라는 것을 알려줌
    // @Transaction : DB 트랜잭션(하나의 동작)에서 자동 commit(물리적 저장)을 의미함
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE member SET user_id =:userid WHERE id =:id")
    int updateByUserId_NativeQuery(String userid,Long id);




    //문제1
    //user_id가 "hong"이고, user_pw가 "1234"인 행의 갯수를 출력하시오. 출력:1
    List<MemberEntity> findByUserIdAndUserPw(String userid, String userpw);
    //문제2
    //user_id에 "h"가 들어간 행의 갯수를 출력하시오. 출력:2
    List<MemberEntity> findByUserIdContaining(String keyword);
    //문제3
    //member 테이블의 모든 행에서 처음 2개만 출력하시오. 정렬방식은 joindate의 내림차순이다.
    List<MemberEntity> findFirst2ByOrderByJoindateDesc();
    //문제4
    //오늘날짜(2023-10-17)보다 더 이후에 가입한 회원의 아이디만 출력하시오.
    List<MemberEntity> findByJoindateGreaterThanEqual(LocalDate date);


//    @Query(nativeQuery = true,value = "SELECT * FROM member WHERE user_id =:userid AND user_pw =:userpw")
//    List<MemberEntity> findByUserId_nativeQuery1(String userid,int userpw);
//
//    @Query(nativeQuery = true,value = " SELECT * FROM member WHERE user_id LIKE '%h%' ")
//    List<MemberEntity> findByUserId_nativeQuery2(String userid);
//
//    @Query(nativeQuery = true,value = " SELECT * FROM member LIMIT2 ORDER BY joindate DESC ")
//    List<MemberEntity> findByUserId_nativeQuery3(String userid);

}
