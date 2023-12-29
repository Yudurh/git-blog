package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@Controller
public class MainController {
    @RequestMapping()
    public String main(){
        return "redirect:loginForm";
    }

    @RequestMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @RequestMapping("loginAction1")
    public String loginAction1(Member member, // form태그의 Input name들이 매핑됨.
                               Model model){
        System.out.println(member.getUsername());
        System.out.println(member.getPassword());

        model.addAttribute("username",member.getUsername());
        model.addAttribute("password",member.getPassword());

        return "loginForm";
    }
    //URL 호출 경로를 파라미터값을 가져온다.
    // 예) /posts/1 여기서 1은 ID값이다
    //요청 URL : http://localhost:8080/loginAction2/hong/1234
    //요청 URL : http://localhost:8080/loginAction2?id=hong&pw=1234
    @GetMapping("loginAction2/{username}/{password}")
    public String loginAction2(@PathVariable String username,
                               @PathVariable String password,
                               Model model){
        System.out.println(username);
        System.out.println(password);

        model.addAttribute("username", username);
        model.addAttribute("password", password);


        return "loginForm";
    }
    //@RequestParam : request.getParameter()함수를 자동화해준다
    // value 속성: 매칭되는 name값 (생략 가능) @RequestParam("username")
    // defaultValue 속성 : null일때의 기본값
    // required 속성 : true가 기본값이고, null허용 안함, false로 지정시 null허용한다
    @PostMapping("/loginAction3")
    public String loginAction3(@RequestParam(value = "username") String userid,
                               @RequestParam(required = false, defaultValue = "3333") String password,
                               Model model){
        System.out.println("userid:"+userid);
        System.out.println("password:"+password);

        model.addAttribute("username", userid);
        model.addAttribute("password", password);


        return "loginForm";
    }


    //Key-Value 데이타를 담는 데이타 구조
    //1. JSON/XML 형식의 데이타
    //2. Form태그의 Input태드 name/value
    //3. JAVA : Class (필드변수), Map(Key-Value)
    //4. JS : { key: value } 객체

    // input태그 name/value와 Java Map을 매핑한다
    @PostMapping("loginAction4")
    public String loginAction4(@RequestParam Map<String , Objects> map,
                                Model model){
        System.out.println("username"+map.get("username"));
        System.out.println("password"+map.get("password"));

        model.addAttribute("username",map.get("username"));
        model.addAttribute("password",map.get("password"));


        return "loginForm";
    }

}
