package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        //return "redirect:index1"; // "/index1" 재호출하도록 WB에게 알려줌
        return "forward:index1"; //서버 내부에서 경로를 넘긴다 (WB X)
        // redirect : 내부 변수값을 버리고 페이지 이동 ( a태그와 동작이 같음 )
        // forward : 내부 변수값을 가지고 페이지 이동
    }

    @GetMapping("/index1")
    public String index1(Model model) {

        model.addAttribute("name_text", "ㄴㅁㅇㅁㄴ");
        model.addAttribute("name_html", "<ins>홍길동</ins>");
        model.addAttribute("server_value", "HONG");
        return "index1";
    }

    @GetMapping("/index1-param")
    public String index1Param(@RequestParam String id,
                              @RequestParam String pw,
                              Model model) {

        System.out.println("id: " + id);
        System.out.println("pw: " + pw);
        return "index1"; //index1-param.html로 응답
    }
}