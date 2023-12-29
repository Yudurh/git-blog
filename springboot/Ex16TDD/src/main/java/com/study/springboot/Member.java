package com.study.springboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//@Builder : Lombok 어노테이션으로서 객체의 생성과 get/set을 연결하여 호출가능
@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private String loginId;
    private String loginPw;

}
