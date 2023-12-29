package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex02SpringDiApplication {
//	자바 빈을 생성하는 두 가지 방법
//	1. @Confiration + @Bean
//	2. @Component + @Autowired
//	1) 필드(field,맴버변수) 주입
//	2) 수정자(setter) 주입
//	3) 생성자(constructor) 주입 : 추천하는 방법
	public static void main(String[] args) {
		SpringApplication.run(Ex02SpringDiApplication.class, args);
	}

}
