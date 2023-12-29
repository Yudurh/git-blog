package com.study.springboot.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long orderNo;
    private String cartItemCode1;
    private String cartItemCode2;
    private String cartItemCode3;
    private String cartItemCode4;
    private String cartItemCode5;
    private Integer orderTotalPrice;
    private Integer orderTotalCount;
    private Integer orderNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderDateTime;
}
