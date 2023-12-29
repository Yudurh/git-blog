package com.study.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    //URI : localhost:8080
    @GetMapping("/")
    public String main(){
        //return "redirect:index1"; // "/index1" 재호출하도록 WB에게 알려줌
         return "forward:index1"; //서버 내부에서 경로를 넘긴다 (WB X)
        // redirect : 내부 변수값을 버리고 페이지 이동 ( a태그와 동작이 같음 )
        // forward : 내부 변수값을 가지고 페이지 이동
    }
    //URI : localhost:8080/index1
    @GetMapping("/index1")
    public String index1(Model model){
        //Model 클래스 : 데이타를 담아 전달하는 용도의 스프링 클래스(객체)
        //매개변수로 선언하면 스프링 컨텍스트에서 자동 주입이됨
        model.addAttribute("name_text","홍길동");
        model.addAttribute("name_html","<ins>홍길동</ins>");
        model.addAttribute("server_value","HONG");
        return "index1";
    }


    //URI : localhost:8080/index1-param?id=hong&pw=1234
    // id : hong
    // pw : 1234
    // @RequestParam : HTTP 요청 파라미터의 테이타와 변수를 매칭한다. 키와 변수이름 동일해야됨
    // POST방식에서는 input 태그의 name값과 동일해야됨
    // <input type="text" name="id" value=""/>
    @GetMapping("/index1-param")
    public String index1Param(@RequestParam String id,
                              @RequestParam String pw,
                              Model model){

        System.out.println( "id: " + id);
        System.out.println( "pw: " + pw);
        return "index1"; //index1-param.html로 응답
    }

}
