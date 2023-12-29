package com.study.springboot.controller;

import com.study.springboot.dto.CartDto;
import com.study.springboot.dto.ItemDto;
import com.study.springboot.entity.CartEntity;
import com.study.springboot.entity.CartRepository;
import com.study.springboot.entity.ItemEntity;
import com.study.springboot.entity.ItemRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ApiController {

    @Autowired
    ItemRepository itemRepository;
    CartRepository cartRepository;
    //엔티티(리스트)는 절대 외부에 직접 반환하지말것
    //앤티티를 직접 수정이 가해지면, DB도 함께 수정이 되어버림

//    @GetMapping("/itemlist-recommand")
//    @GetMapping("/itemlist-burgerset")
//    @GetMapping("/itemlist-happymeal")
//    @GetMapping("/itemlist-coffee")
//    @GetMapping("/itemlist-desert")
//    @GetMapping("/itemlist-drink")

//    @GetMapping("/itemlist")
//
//
//    public List<ItemDto> itemList(){
//
//
//
//    }

    @GetMapping("/itemlistAll")
    public Map<String, List<ItemDto>> itemlistAll(){
        Map<String, List<ItemDto>> map = new HashMap<>();

        List<ItemEntity> listEntity = itemRepository.findAll();

        List<ItemDto> listDto = listEntity
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistAll", listDto);



        List<ItemEntity> listRecommend = itemRepository.findByItemRecommend(1);
        List<ItemDto> listDtoRecommend = listRecommend
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistRecommand", listDtoRecommend);

        List<ItemEntity> listCate1 = itemRepository.findByItemCate("버거&세트");
        List<ItemDto> listDto1 = listCate1
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistBurgerset", listDto1);

        List<ItemEntity> listCate2 = itemRepository.findByItemCate("해피밀");
        List<ItemDto> listDto2 = listCate2
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistHappymeal", listDto2);

        List<ItemEntity> listCate3 = itemRepository.findByItemCate("커피");
        List<ItemDto> listDto3 = listCate3
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistCoffee", listDto3);

        List<ItemEntity> listCate4 = itemRepository.findByItemCate("디저트");
        List<ItemDto> listDto4 = listCate4
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistDesert", listDto4);

        List<ItemEntity> listCate5 = itemRepository.findByItemCate("음료");
        List<ItemDto> listDto5 = listCate5
                .stream()
                .map(ItemDto::toDto)
                .collect(Collectors.toList());
        map.put("itemlistDrink", listDto5);

        return map; //json 문자열로 리턴이 된다.
    }



    @GetMapping("/cart")
    public List<CartDto> cartList(){
//        List<ItemEntity> listEntity = itemRepository.findAll();
        List<CartEntity> listEntity2 = cartRepository.findAll();

        List<CartDto>cartDtoList = listEntity2
                .stream()
                .map(CartDto::toDtoC)
                .collect(Collectors.toList());


        return cartDtoList;
    }


}