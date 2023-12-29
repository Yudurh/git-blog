package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("login")
    public String login(String id,String pw){
        int result = resultFromDB(id,pw);
        return String.valueOf(result);
    }
    @GetMapping("join")
    public String join(String id,String pw){
        int result = resultFromDB(id,pw);
        return String.valueOf(result);
    }
    int resultFromDB(String id,String pw){

        if (id.equals("hong") && pw.equals("1234")){
            return 1;
        }else {
            return 0;
        }
    }







}
