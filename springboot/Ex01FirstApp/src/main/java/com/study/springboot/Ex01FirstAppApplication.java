package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@SpringBootApplication : 3가지의 어노테이션을 합쳐놓은 것
//	: 기본적인 스프링부트 앱 개발 환경과 설정을 다 해준다
//1. @ComponentScan : @Component가 붙은 클래스를 찾아서 Bean으로 등록한다.
//2. @EnableAutoConfiguration : 스프링 프레임워크의 기본적인 기능을 활성화할 때
//3. @SpringBootConfiguration : @Configuration이 붙은 클래스를 스프링 프레임워크의
//								설정 클래스로 등록한다

//@Bean와 @Component의 차이
//1.@Bean은 Config클래스 안에서 사용되고, 주로 외부 라이브러리 사용시(개발자 제어불가) 사용
//2.@Component는 주로 개발자가 직접 작성한 클래스에 사용


@Configuration
class MyConfig{ //웹어플리케이션의 설정정보(과거 xml)를 담는 클래스이다
	//보안, URL 패턴 등등의 설정
	//@Bean : Config클래스 안에서 반환되는 객체를 스프링 빈으로 등록해 준다
	@Bean
	public Student student(){
		System.out.println("Bean gen");
		return new Student();
	}
}




//@Component
class Student {
	String name = "Hong";
}
// A objA = new A(); => IoC 컨테이너, 스프링 컨테이너에 저장하고 관리한다
//어노테이션이란? 일종의 컴파일 지시어, 사용자 정의에 따라서 필요한 액션을 수행함
//				일종의 메크로
@SpringBootApplication
public class Ex01FirstAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello Springboot");

		// 스프링 컨테이너에 등록되어 있는 빈(객체)을 사용해 보자
		ApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);
		Student obj = (Student) context.getBean("student");
		System.out.println(obj.name);

		SpringApplication.run(Ex01FirstAppApplication.class, args);
	}

}
