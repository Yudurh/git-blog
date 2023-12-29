package com.study.springboot.dto;

import com.study.springboot.entity.ItemEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {


    private Long itemNo;

    private String itemCode;

    private String itemName;

    private String itemCate;

    private Integer itemRecommend;

    private Integer itemPrice;

    private String itemImageUrl;

    private LocalDateTime itemUpdateDatetime;




    public static ItemDto toDto(ItemEntity entity){
        return ItemDto.builder()
                .itemNo(entity.getItemNo())
                .itemName(entity.getItemName())
                .itemCate(entity.getItemCate())
                .itemRecommend(entity.getItemRecommend())
                .itemPrice(entity.getItemPrice())
                .itemImageUrl(entity.getItemImageUrl())
                .itemUpdateDatetime(entity.getItemUpdateDatetime())
                .itemCode(entity.getItemCode())
                .build();


    }
}
