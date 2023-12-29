package com.study.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


//@Entity : DB 테이블과 1:1로 매칭
@Entity
@Table(name="member")
@Builder
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
    @Column(name = "user_id") //DB컬럼이름과 변수이름이 다르면 맞춰준다.
    private String userId;
    @Column(name = "user_pw")
    private String userPw;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_role")
    private String userRole; //권한 "admin" "user"
    // DB Table date 포맷을 형식화 해줌.
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate joindate; //가입일 "2023-10-12"
}







