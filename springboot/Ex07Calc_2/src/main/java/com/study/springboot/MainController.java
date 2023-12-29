package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(){
        return "index";
    }
    @GetMapping("/calc")
    public String calc( @RequestParam String num1,
                        @RequestParam String num2,
                        @RequestParam String calType,
                        Model model ){
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        System.out.println("calType:"+calType);

        if(calType != null){
            int intNum1 = Integer.parseInt(num1);
            int intNum2 = Integer.parseInt(num2);
            if(calType.equals("add")){
                model.addAttribute("num1", intNum1);
                model.addAttribute("num2", intNum2);
                model.addAttribute("result", intNum1+intNum2);
            }
        }

        return "index";
    }

    List<ReceiveData> list = new ArrayList<ReceiveData>();

    @PostMapping("/calc_post")
    @ResponseBody
    public SendData calc_post(@RequestBody ReceiveData data){

        list.add(data);

        System.out.println(data.getNum1());
        System.out.println(data.getNum2());
        System.out.println(data.getCalType());
        String num1 = data.getNum1();
        String num2 = data.getNum2();
        String calType = data.getCalType();

        if( data != null ){
            if( calType.equals("add")){
                int intNum1 = Integer.parseInt(num1);
                int intNum2 = Integer.parseInt(num2);
                int result = intNum1 + intNum2;

                SendData sendData = new SendData();
                sendData.setStatus("ok");
                sendData.setResult( result );

                return sendData;
            }
        }

        return null;
    }


}











