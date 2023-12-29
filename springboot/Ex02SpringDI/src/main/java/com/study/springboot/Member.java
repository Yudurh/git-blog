package com.study.springboot;

import org.springframework.stereotype.Component;

//POJO : 순수한 자바클래스에 getter/setter만 있는 클래스
//     : 스프링이 관리하는 빈 클래스
@Component
public class Member {
    private String name = "이순신";

//    기본생성자
    public Member(){ }
//    필드가 있는 생성자

    public Member(String name) {
        this.name = name;
    }

//    getter/setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
