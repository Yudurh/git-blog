package com.study.springboot;

import org.springframework.stereotype.Component;
//빈의 기본이름은 "bCCard"
@Component("cardBC")
public class BCCard implements ICard{
    @Override
    public void buy(String itemName) {
        System.out.println("BC카드로 " + itemName + "샀다.");
    }
}
