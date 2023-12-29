package com.study.springboot.controller;

import com.study.springboot.dto.*;
import com.study.springboot.entity.*;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ApiController {
    @Autowired
    private ItemRepository itemRepository;


//    @GetMapping("/itemlist-recommand")
//    @GetMapping("/itemlist-burgerset")
//    @GetMapping("/itemlist-happymeal")
//    @GetMapping("/itemlist-coffee")
//    @GetMapping("/itemlist-desert")
//    @GetMapping("/itemlist-drink")

    @GetMapping("/itemlist")
    public List<ItemDto> itemList(){

        //엔티티(리스트)는 절대 외부에 직접 반환하지 말 것.
        //엔티티를 직접 수정(setter)이 가해지면, DB도 함께 수정이 되어 버림.
        //엔티티는 직접 DB에 제어할 때만 사용하고, 데이타 전달이나 UI처리는
        //  DTO를 사용해야 된다.

        List<ItemEntity> listEntity = itemRepository.findAll();

        List<ItemDto> listDto = listEntity
                        .stream()
                        .map(ItemDto::toDto)
                        .collect(Collectors.toList());

        return listDto; //json 문자열로 리턴이 된다.
    }
    @GetMapping("/itemlistAll")
    public Map<String, List<ItemDto>> itemlistAll(){
        Map<String, List<ItemDto>> map = new HashMap<>();

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

    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/getCartItems")
    public List<CartDto> getCartItems(){

        List<CartEntity> listEntity = cartRepository.findAll();

        List<CartDto> listDto = listEntity
                .stream()
                .map(CartDto::toDto)
                .collect(Collectors.toList());


        return listDto;
    }
    @PostMapping("/setCartItems")
    public ResultDto setCartItems(@RequestBody List<CartDto> cartItems){

        for(CartDto cartDto : cartItems){
            CartEntity entity = CartEntity.toEntity(cartDto);
            cartRepository.save(entity);
        }

        ResultDto resultDto = ResultDto.builder()
                .status("ok")
                .result(1)
                .build();



        return resultDto;
    }

    @Autowired
    private OrderRepository orderRepository;
    @PostMapping("/orderCart")
    public ResultDto setOrder(@RequestBody List<CartDto> cartItems,
                              @RequestParam int cartNo,
                              @RequestBody OrderDto orderDto,
                              OrderEntity orderEntity,
                              CartEntity cartEntity,
                              Model model){

        orderDto = new OrderDto();
        int totalP = 0;
        int totalA = 0;
        for (int i=0; i<5; i++){


            if (i==0 && cartItems.get(i)!=null){
            orderDto.setCartItemCode1(cartItems.get(0).getItemCode());
            totalP = totalP+(cartItems.get(i).getItemPrice()*cartItems.get(i).getCartItemAmount());
            totalA++;
            }
            if (i==1 && cartItems.get(i)!=null) {
                orderDto.setCartItemCode2(cartItems.get(1).getItemCode());
                totalP=totalP+(cartItems.get(i).getItemPrice()*cartItems.get(i).getCartItemAmount());
                totalA++;
            }else {
                break;
            }
            if (i==2 && cartItems.get(i)!=null) {
                orderDto.setCartItemCode3(cartItems.get(2).getItemCode());
                totalP=totalP+(cartItems.get(i).getItemPrice()*cartItems.get(i).getCartItemAmount());
                totalA++;
            }else {
                break;
            }
            if (i==3 && cartItems.get(i)!=null) {
                orderDto.setCartItemCode4(cartItems.get(3).getItemCode());
                totalP=totalP+(cartItems.get(i).getItemPrice()*cartItems.get(i).getCartItemAmount());
                totalA++;
            }else {
                break;
            }
            if (i==4 && cartItems.get(i)!=null) {
                orderDto.setCartItemCode5(cartItems.get(4).getItemCode());
                totalP=totalP+(cartItems.get(i).getItemPrice()*cartItems.get(i).getCartItemAmount());
                totalA++;
            }else {
                break;
            }


        }

        orderDto.setOrderNumber(cartNo);
        orderDto.setOrderTotalPrice(totalP);
        orderDto.setOrderTotalCount(totalA);

        OrderEntity oEntity = orderEntity.toEntity1(orderDto);

        orderRepository.save(oEntity);

        ResultDto resultDto = ResultDto.builder()
                .status("ok")
                .result(1)
                .build();


        return resultDto;
    }






}
