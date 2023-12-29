package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    //ArrayList 선언
    List<Member> memberList = new ArrayList<>();

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @PostMapping("/join")
    public String join( @RequestParam String input_name,
                        @RequestParam String input_email,
                        @RequestParam String input_pw,
                        @RequestParam String input_pw2, Model model ){
        System.out.println("name:"+input_name);
        System.out.println("email:"+input_email);
        System.out.println("pw:"+input_pw);
        System.out.println("pw2:"+input_pw2);

    Member member = new Member();
    member.setInput_name(input_name);
    member.setPassward(input_pw);
    member.setEmail(input_email);
    memberList.add(member);






    //model에 데이터 실어서 타임리프로
        return "index";
    }
    @PostMapping("/dupl")
    @ResponseBody
    public SendData dupl (@RequestBody ReceiveData data){
        Member member = new Member();
        System.out.println(data.getInput_name());

        SendData sendData = new SendData();

        for (Member name:memberList){
            System.out.println(name.getInput_name().equals(data.getInput_name()));
            if (name.getInput_name().equals(data.getInput_name())) {
                sendData.setStatus("ok");
                sendData.setMessage("중복있음");
            }else {
                sendData.setStatus("ok");
                sendData.setMessage("중복없음");
            }
        }



        
        
        return sendData;
    }

}
