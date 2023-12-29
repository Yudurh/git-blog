package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    List<Member> memberList = new ArrayList<>();

    @GetMapping("/")
    public String main(Model model){


        return "index";
    }

    @GetMapping("/addP")
    public String addP(Model model){

        return "addP";
    }

    @PostMapping("/addP")
    @ResponseBody
    public String addP1(@RequestParam String pName,
                       @RequestParam String pPrice,
                       @RequestParam String pDate,
                        Model model){

    Member member = new Member();
    member.setPName(pName);
    member.setPPrice(pPrice);
    member.setPDate(pDate);

    memberList.add(member);

    return "<script>alert('상품이 추가되었습니다'); location.href='list';</script>";
    }

    @GetMapping("/list")
    public String list(Model model){
        int a = memberList.size();
        model.addAttribute("aSize",a);
        model.addAttribute("memberList",memberList);
        return "index";
    }
    @GetMapping("/upP")
    public String upP(@RequestParam String index, Model model){
        model.addAttribute("member", memberList.get(Integer.parseInt(index)));
        System.out.println(Integer.parseInt(index));

        return "upP";
    }
    @RequestMapping("/upP1")
    @ResponseBody
    public String upP1( @RequestParam(required = false, defaultValue = "0") int index,
                        @RequestParam String pName,
                        @RequestParam String pPrice,
                        @RequestParam String pDate,
                        Model model){

        Member member = new Member();
        member.setPName(pName);
        member.setPPrice(pPrice);
        member.setPDate(pDate);
        memberList.set(index ,member);
        model.addAttribute("member",memberList.get(index));

        return "<script>alert('상품이 수정되었습니다'); location.href='list';</script>";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam(required = false, defaultValue = "0") int index, Model model){
        memberList.remove( index );

        return "<script>alert('삭제되었습니다');location.href='/list';</script>";
    }




}
