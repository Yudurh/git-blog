package com.study.springboot.controller;

import com.study.springboot.entity.MemberEntity;
import com.study.springboot.entity.MemberRepository;
import com.study.springboot.entity.OrderEntity;
import com.study.springboot.entity.OrderRepository;
import jakarta.servlet.http.HttpServletRequest;
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
    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "join";
    }
    @GetMapping("/OrderSelect")
    public String orderSelect(){
        return "OrderSelect";
    }

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/MenuSelect")
    public String menuSelect(Model model, HttpServletRequest request){
        String loginId = (String)request.getSession().getAttribute("loginId");
        if( loginId != null ){
            List<MemberEntity> list = memberRepository.findByMemberId(loginId);
            if( list.size() > 0 ){
                MemberEntity memberEntity = list.get(0);
                model.addAttribute("loginNickname", memberEntity.getMemberName());
            }
        }

        return "MenuSelect";
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
    private OrderRepository orderRepository;
    @GetMapping("/Thanks")
    public String thanks(Model model, HttpServletRequest request){

//
//        String loginId = (String)request.getSession().getAttribute("loginId");
//
//
//        MemberEntity newEntity1 = (MemberEntity) memberRepository.findByMemberId(loginId);
//        List<OrderEntity> orderEntity = orderRepository.findByOrderNo(0L);
//        int a = orderEntity.get(0).getOrderTotalPrice();
//
//        MemberEntity newEntity2 = MemberEntity.toPointEntity(orderEntity.get(0));
//
//
//        newEntity1.setMemberPoint(a);
//
//
//        MemberEntity newEntity = memberRepository.save(newEntity1);


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
