package com.study.springboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MainController {

    boolean isTakeOut = true; //테이크아웃인가?

    @GetMapping("/")
    public String index(){
        return "redirect:/main";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }
    @GetMapping("/MenuSelect")
    public String menuSelect(){
        return "MenuSelect";
    }
    @GetMapping("/OrderSelect")
    public String orderSelect(){
        return "OrderSelect";
    }
    @GetMapping("/Payment")
    public String payment(){
        return "Payment";
    }
    @GetMapping("/Cart")
    public String cart(){
        return "Cart";
    }
    @GetMapping("/Add_Item")
    public String add_Item(){
        return "Add_Item";
    }
    @GetMapping("/Thanks")
    public String thanks(){
        return "Thanks";
    }
    @GetMapping("/takeOut/{isTakeOut}")
    public String takeOut(@PathVariable int isTakeOut){
        if( isTakeOut == 1 ){
            this.isTakeOut = true;
            System.out.println("테이크아웃");
        }else{
            this.isTakeOut = false;
            System.out.println("인스토어");
        }
        return "redirect:/MenuSelect";
    }
}
