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
        // insert문
        MemberEntity memberEntity1 = new MemberEntity(Long.valueOf(1),"hong","1234",
                "홍길동","ROLE_USER", LocalDate.now());
        MemberEntity memberEntity2 = new MemberEntity(Long.valueOf(2),"hong","1234",
                "홍길동","ROLE_USER", LocalDate.now());
        memberRepository.save(memberEntity1);
        memberRepository.save(memberEntity2);

        // update문
        MemberEntity memberEntity3 = new MemberEntity(Long.valueOf(2),"lee","1234",
                "이순신","ROLE_USER", LocalDate.now());
        memberRepository.save(memberEntity3);

        // delete문
//        memberRepository.delete(memberEntity3);

        // select문 : findAll,findBy컬럼명
        memberRepository.save(memberEntity3);
        List<MemberEntity> list = new ArrayList<>();
        //Optional : null일지 아닐지 모르는 상황에서 사용하는 래퍼클래스
        Optional<MemberEntity> optinal = memberRepository.findById(Long.valueOf(2));
        Optional<MemberEntity> optinal2 = memberRepository.findById(Long.valueOf(1));
        if ( optinal.isPresent() ){
            MemberEntity memberEntity = optinal.get();
            MemberEntity memberEntity10 = optinal2.get();

            list.add(memberEntity);
            list.add(memberEntity10);

        }else {
            System.out.println("널입니다");
        }


//        List<MemberEntity> list = memberRepository.findAll();
        model.addAttribute("list", list);
        return "index";
    }
}
