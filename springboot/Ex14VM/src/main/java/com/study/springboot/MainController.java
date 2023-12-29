package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {



    @RequestMapping("/")
    public String main(Member member,Model model){

        model.addAttribute("total",member.getTotal());
        return "VM";
    }


    private int coin=0;



    @RequestMapping("/VM1")
    public String VM1(@RequestParam(required = false, defaultValue = "0") int total,
                          Member member,Model model){

        coin=coin+1000;

        member.setTotal(coin);

        model.addAttribute("total",member.getTotal());




                return "VM";

    }
    @RequestMapping("/VM2")
    public String VM2(@RequestParam(required = false, defaultValue = "0") int total,
                      Member member,Model model){

        coin=coin+500;

        member.setTotal(coin);

        model.addAttribute("total",member.getTotal());




        return "VM";

    }
    @RequestMapping("/VM3")
    public String VM3(@RequestParam(required = false, defaultValue = "0") int total,
                      Member member,Model model){


        if (coin<2000) {
            System.out.println("돈 모자름");


        }else {
            coin = coin - 2000;

            member.setTotal(coin);

            model.addAttribute("total", member.getTotal());
        }



        return "VM";

    }

}
