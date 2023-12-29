package com.study.springboot;

import org.springframework.stereotype.Controller;
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
    //html의 name속성을 지정, 변수이름을 다르게 설정가능.
    //@RequestParam("inputName")
    //@RequestParam(name="inputName") String nickname;
    //@RequestParam(defaultValue = "홍길동") //기본값 (값이 없을때)
    //              required = true //NonNull이 기본값(null일때 오류)
    //              required = false //null을 허용함.
    @PostMapping("/join")
    public String join(@RequestParam(defaultValue = "홍길동", required = false) String inputName,
                       @RequestParam String inputEmail,
                       @RequestParam String inputPw,
                       @RequestParam String inputPw2){
        System.out.println("inputName:"+inputName);
        System.out.println("inputEmail:"+inputEmail);
        System.out.println("inputPw:"+inputPw);
        System.out.println("inputPw2:"+inputPw2);

        //DB에 저장한다.
        //ArrayList에 add한다.
        Member member = new Member();
        member.setName(inputName);
        member.setEmail(inputEmail);
        member.setPassword(inputPw);

        memberList.add(member);

        //model에 데이터 실어서 타임리프로 회원가입 되었음을 html표시한다.

        return "index";
    }

    //JS 객체(KV) <=====> Java 클래스객체와 연결된다.
    @PostMapping("/dupl")
    @ResponseBody
    public SendData dupl(@RequestBody ReceiveData data){

        System.out.println(data.getInputName());

        //inputName이 ArrayList내에 중복되는지 확인

        SendData sendData = new SendData();
        //중복된 이름이 있으면
        if( false ){
            sendData.setStatus("ok");
            sendData.setMessage("중복된 아이디가 있습니다.");
        }else {//중복된 이름이 없으면
            sendData.setStatus("ok");
            sendData.setMessage("중복된 아이디가 없습니다.");
        }

        return sendData;
    }
}
