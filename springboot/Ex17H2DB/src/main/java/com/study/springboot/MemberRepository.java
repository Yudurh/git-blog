package com.study.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

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
}
