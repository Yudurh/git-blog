package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller : HTTP 요청을 처리하는 클래스에 지정한다



@Controller


public class MainController {
//    HTTP 요청 URL : http://localhost:8080
//    localhost : 자기 pc IP주소(127.0.0.1)
//    8080 : 내장 WAS(Web App Server) 톰캣 9.x의 기본 포트
//    @GetMapping : HTTP Get 요청에 대한 URL을 정의한다
//    "/" : 루트경로를 의미
//    @ResponseBody : HTTP응답을 정의한다 문자열로 응답함

    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "스프링부트 웹 어플리케이션";
    }
    @GetMapping("/test")
    @ResponseBody
   public String test(){
        return "테스트";
   }

//    1. 필드 주입
//    @Autowired : 스프링 빈을 주입해주는 어노테이션
//               : Member member1 = new Member();

    @Autowired
    private Member member1;
    @Autowired // 매번 필드위에 기입해야 됨
    private Member member2;
    @GetMapping("/field")
    @ResponseBody
    public String field(){
        System.out.println(member1.getName());
        return "field()호출됨";
    }


//    2. 수정자 주입

    private Member member3;
    @Autowired
    public void setMember(Member member){
        this.member3 = member;
    }
    @GetMapping("/setter")
    @ResponseBody
    public String setter(){
        System.out.println(member3.getName());
        return "setter() 호출됨";
    }

//    3. 생성자주입 : - final 사용 가능(객체 재할당 방지)
//                  - 생성자로서 미리 주입을 받는다. null safety를 제공
    private final Member member4;
    @Autowired
    public MainController(Member member){
        System.out.println("생성자 주입");
        this.member4 = member;
    }

    @GetMapping("/constructor")
    @ResponseBody
    public String constructor(){
        System.out.println(member4.getName());
        return "constructor() 호출됨";
    }
}
