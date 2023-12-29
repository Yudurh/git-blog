package com.study.springboot;

import com.sun.source.tree.MemberSelectTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController : @Controller + @ResponseBody
//@Controller
//@ResponseBody //클래스의 모든 응답이 JSON문자열로 된다
@RestController
public class ApiController {
    @Autowired
    MemberService memberService;

    @PostMapping("/loginAction1")
    public ResultDto loginAction1(@RequestParam String loginId,
                                  @RequestParam String loginPw){
        //memberService를 이용해서 로그인 액션을 처리한다
        Member member = Member.builder()
                        .loginId(loginId)
                        .loginPw(loginPw)
                        .build();
        int result = memberService.loginAction(member);
        ResultDto resultDto = new ResultDto();
        if (result == 1){
            resultDto.setStatus("ok");
            resultDto.setMessage("로그인 성공");
        }else {
            resultDto.setStatus("fail");
            resultDto.setMessage("로그인 실패");
        }


        return resultDto; //json문자열로 HTTP 응답 Body에 실려 내려간다.
    }

    //JS : KV객체 {"loginId":"hong","loginPw":"1234"
    @PostMapping("/loginAction2")
    public ResultDto loginAction2(@RequestBody Member member){
        ResultDto resultDto = new ResultDto();
        return resultDto; //json문자열로 HTTP 응답 Body에 실려 내려간다.
    }


}
