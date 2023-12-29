package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "스프링부트 웹 어플입니다";
    }
//    필드 주입
    
    @Autowired
    private Member member;
    @GetMapping("/member")
    @ResponseBody
    public String member(){
        member.setName("홍길동");
        System.out.println(member.getName());
        return "member() 호출됨";
    }
    //필드 주입
    @Autowired
    @Qualifier("cardBC")//주입될 객체를 직접 지정함        
    ICard iCard; //BCCard, KakaoCard 구현체 중에 어떤 것을 주입? 알수없음
    
    @GetMapping("card")
    @ResponseBody
    public String card(){
        member.setiCard( iCard );
        member.getiCard().buy("아이폰");
        return "card() 호출됨";
    }
    
    
}
