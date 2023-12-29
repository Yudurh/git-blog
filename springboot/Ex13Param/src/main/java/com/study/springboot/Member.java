package com.study.springboot;

//클래스 매핑(Mapping) : 오브젝트 매핑
//1. DB 테이블과 맴버변수(필드)와 매핑
//2. form태그 Input들과 멤버변수(필드)와 매핑

import lombok.Data;
import org.springframework.stereotype.Component;

@Component //클래스를 스프링 빈으로 등록한다.
@Data
public class Member {

    private String username;
    private String password;



}
