package com.study.springboot;

import org.springframework.stereotype.Component;

@Component("member")
public class Member {
    private String name;
    private ICard iCard;


//      기본생성자

    public Member() {
    }

//      필드가 있는 생성자

    public Member(String name, ICard iCard) {
        this.name = name;
        this.iCard = iCard;
    }


//      getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICard getiCard() {
        return iCard;
    }

    public void setiCard(ICard iCard) {
        this.iCard = iCard;
    }
}
