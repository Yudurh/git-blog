package com.study.springboot;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Component
public class Member {
    private String pName;
    private String pPrice;
    private String pDate;
}
