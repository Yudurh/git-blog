package com.study.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "롬복 예제입니다";
    }
    //필드 주입
    @Autowired
    private Member member1;

//    롬복을 이용한 생성자 주입
    private final Member member2;
//    생성자 주입
//    @Autowired
//    public  MainController(Member member){
//        this.member = member;
//    }



}
