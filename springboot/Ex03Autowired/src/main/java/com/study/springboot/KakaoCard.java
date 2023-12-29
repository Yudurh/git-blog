package com.study.springboot;

import org.springframework.stereotype.Component;

@Component("cardKakao")
public class KakaoCard implements ICard {
    @Override
    public void buy(String itemName) {
        System.out.println("카카오카드로 " + itemName + "샀다.");
    }
}
