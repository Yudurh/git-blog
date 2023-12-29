package com.study.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationShutdownHandlers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor //Lombok 에서 final이나 null인 멤버변수만 생성자 함수로 생성.
public class MainController {
    //생성자 주입 : 1. final 재할당 안함. 2. 객체생성 우선순위가 높다.(안정성)
    private final MemberRepository memberRepository;
    @GetMapping("/")
    public String main(Model model){


        List<MemberEntity> list = memberRepository.findAll();
        model.addAttribute("list", list);
        return "index";
    }
}
