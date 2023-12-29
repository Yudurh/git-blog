package com.study.springboot;

//데이타 모델링 클래스(데이타를 담는 클래스)
//1. DTO : Date Transfer Object, 계층(Controller,Service,Repo,Entity)간의
//         데이타 전송시 사용
//2. VO : View Object
//3. ENTITY : DB 테이블과 1:1로 매칭
//4. DAO : Data Access Object, DB에 접근하는 클래스를 의미.

//          로직(코드)  데이타변경
//DTO        X           O
//VO         O           X
//ENTITY     X           X

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

//@Entity : DB 테이블과 1:1로 매칭
@Entity
@Table(name="member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {
    @Id  //기본키로 설정
    //@GeneratedValue : 해당 ID값을 어떻게 생성할지 전략을 선언해줌.
    //1. IDENTITY : MySQL, MariaDB, PostgreSQL, H2DB
    //2. SEQUENCE : Oracle, PostgreSQL
    //3. AUTO : 해당 DB에 따라 자동으로 선택.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;           //기본키
    @Column(name = "user_id") //DB컬럼이름과 변수이름이 다르면 맞춰준다..
    private String user_id;
    private String user_pw;
    private String user_name;
    private String user_role; //권한 "admin" "user"
    // DB Table date 포맷을 형식화 해줌.
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate joindate; //가입일 "2023-10-12"
}







