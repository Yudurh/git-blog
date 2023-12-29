package com.study.springboot.controller;

import com.study.springboot.entity.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor //Lombok 에서 final이나 null인 멤버변수만 생성자 함수로 생성.
public class MainController {
    //생성자 주입 : 1. final 재할당 안함. 2. 객체생성 우선순위가 높다.(안정성)
    private final MemberRepository memberRepository;
    
    boolean isTakeOut = true;
    
    @GetMapping("/takeOut/{isTakeOut}")
    public String takeout(@PathVariable int isTakeOut){
        
        if ( isTakeOut == 1 ){
            this.isTakeOut = true;
            System.out.println("테이크아웃");
        }else {
            this.isTakeOut = false;
            System.out.println("먹고가기");
        }
        

        return "MenuSelect";
    }
    
    @GetMapping("/main")
    public String hamber1(){

        return "main";
    }
    @GetMapping("/OrderSelect")
    public String OrderSelect(){

        return "OrderSelect";
    }
    @GetMapping("/MenuSelect")
    public String MenuSelect(){

        return "MenuSelect";
    }
    @GetMapping("/Cart")
    public String Cart(){

        return "Cart";
    }
    @GetMapping("/Add_Item")
    public String Add_item(){

        return "Add_Item";
    }
    @GetMapping("/Payment")
    public String Payment(){

        return "Payment";
    }
    @GetMapping("/Thanks")
    public String Thanks(){

        return "Thanks";
    }



}
