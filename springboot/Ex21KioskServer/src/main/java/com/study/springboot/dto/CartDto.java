package com.study.springboot.dto;

import com.study.springboot.entity.CartEntity;
import com.study.springboot.entity.ItemEntity;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private Long cartNo;
    private String cartCode;
    private String itemCode;
    private String itemName;
    private Integer cartAmount;
    private Integer itemPrice;
    private String itemImageUrl;
    private LocalDateTime itemUpdateDatetime;

    public static CartDto toDtoC(CartEntity entity) {
        return CartDto.builder()
                .cartNo(entity.getCartNo())
                .itemName(entity.getItemName())
                .cartCode(entity.getCartCode())
                .cartAmount(entity.getCartAmount())
                .itemPrice(entity.getItemPrice())
                .itemImageUrl(entity.getItemImageUrl())
                .itemUpdateDatetime(entity.getItemUpdateDatetime())
                .itemCode(entity.getItemCode())
                .build();

    }
}