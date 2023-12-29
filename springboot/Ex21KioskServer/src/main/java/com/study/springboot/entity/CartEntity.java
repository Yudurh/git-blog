package com.study.springboot.entity;


import com.study.springboot.dto.CartDto;
import com.study.springboot.dto.ItemDto;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name="cart")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_no")
    private Long cartNo;
    @Column(name="cart_code")
    private String cartCode;
    @Column(name="item_code")
    private String itemCode;
    @Column(name="item_name")
    private String itemName;
    @Column(name="cart_item_amount")
    private Integer cartAmount;
    @Column(name="item_price")
    private Integer itemPrice;
    @Column(name="item_image_url")
    private String itemImageUrl;
    @Column(name="item_update_datetime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime itemUpdateDatetime;



    public static CartEntity toEntity1(CartDto dto){
        return CartEntity.builder()
                .cartNo(dto.getCartNo())
                .itemName(dto.getItemName())
                .cartCode(dto.getCartCode())
                .cartAmount(dto.getCartAmount())
                .itemPrice(dto.getItemPrice())
                .itemImageUrl(dto.getItemImageUrl())
                .itemUpdateDatetime(dto.getItemUpdateDatetime())
                .itemCode(dto.getItemCode())
                .build();
    }

}
