package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
@GetMapping("/")
    public String main(){
    return "forward:index1";
}

@GetMapping("/index1")
    public String index1( Model model ){
    model.addAttribute("address","한양");
    model.addAttribute("address_null",null);
    model.addAttribute("address_empty","");



    return "index1";
}
@GetMapping("/index2")
    public String index2(Model model){
    model.addAttribute("standardDate", new Date());
    model.addAttribute("localDate", LocalDate.now());
    model.addAttribute("localDateTime", LocalDateTime.now());
    model.addAttribute("number1",12345678);
    model.addAttribute("number2",123456.789);
    return "index2";
}
    @GetMapping("/index3")
    public String index3(Model model){
    model.addAttribute("role","admin");-
    return "index3";
    }




    @GetMapping("/index4")
    public String index4(Model model){
    Member member = new Member("hong", "1234");
        model.addAttribute("member", member);

        List<Member> list = new ArrayList<>();
        list.add(new Member("lee","2222"));
        list.add(new Member("han","3333"));
        list.add(new Member("tom","4444"));
        model.addAttribute("list",list);

        return "index4";
    }
    @GetMapping("/index5")
    public String index5(Model model){
        return "index5";
    }
    @GetMapping("/index6")
    public String index6(Model model){
        return "index6";
    }


}
