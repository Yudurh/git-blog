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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_pw")
    private String userPw;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_role")
    private String userRole;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate joindate; //가입일 "2023-10-12"
}







