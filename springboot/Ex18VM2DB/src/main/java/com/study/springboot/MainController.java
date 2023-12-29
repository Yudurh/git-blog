package com.study.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MainController {
    List<Member> memberList = new ArrayList<>();
    List<MemberEntity> list = new ArrayList<>();
    private final MemberRepository memberRepository;
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

//    Member member = new Member();
//    member.setPName(pName);
//    member.setPPrice(pPrice);
//    member.setPDate(pDate);
//    memberList.add(member);


        MemberEntity memberEntity1 = new MemberEntity();
        memberEntity1.setUser_id(pName);
        memberEntity1.setUser_pw(pPrice);
        memberEntity1.setUser_role("ROLE_USER");
        memberEntity1.setJoindate(pDate);
        memberRepository.save(memberEntity1);




    return "<script>alert('상품이 추가되었습니다'); location.href='list';</script>";
    }

    @GetMapping("/list")
    public String list(Model model){
//        int a = memberList.size();
//        model.addAttribute("aSize",a);
//        model.addAttribute("memberList",memberList);
        List<MemberEntity> list = memberRepository.findAll();
        int b = list.size();
        model.addAttribute("bSize",b);
        model.addAttribute("list", list);
        return "index";
    }
    @GetMapping("/upP")
    public String upP(@RequestParam(required = false, defaultValue = "0") long index,
                      MemberEntity memberEntity,
                      Model model){
        List<MemberEntity> list = memberRepository.findAll();
//        model.addAttribute("member", memberList.get(Integer.parseInt(index)));
        model.addAttribute("list",list.get((int)index-1));



        return "upP";
    }
    @RequestMapping("/upP1")
    @ResponseBody
    public String upP1( MemberEntity memberEntity,
            @RequestParam(required = false, defaultValue = "0") long index,
                        @RequestParam String pName,
                        @RequestParam String pPrice,
                        @RequestParam String pDate,
                        Model model){


        memberEntity.setId(index+1);
        memberEntity.setUser_id(pName);
        memberEntity.setUser_pw(pPrice);
        memberEntity.setJoindate(pDate);
        memberRepository.save(memberEntity);





        return "<script>alert('상품이 수정되었습니다'); location.href='list';</script>";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam(required = false, defaultValue = "0") long index,
                         MemberEntity memberEntity,
                         Model model){
//        memberList.remove( index );
        memberRepository.deleteById(index);
        return "<script>alert('삭제되었습니다');location.href='/list';</script>";
    }




}
