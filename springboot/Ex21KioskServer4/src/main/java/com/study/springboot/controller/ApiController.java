package com.study.springboot.controller;

import com.study.springboot.dto.*;
import com.study.springboot.entity.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
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
    @DeleteMapping("deleteCartItems")
    public ResultDto deleteCartItems(){

        cartRepository.deleteAll();

        ResultDto resultDto = ResultDto.builder()
                .status("ok")
                .result(1)
                .build();

        return resultDto;
    }

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/setOrder")
    public ResultDto setOrder(@RequestBody OrderDto orderDto){

        OrderEntity entity = OrderEntity.toEntity(orderDto);
        orderRepository.save(entity);

        ResultDto resultDto = ResultDto.builder()
                .status("ok")
                .result(1)
                .build();

        return resultDto;
    }

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/loginAction")
    public ResultDto loginAction(@RequestBody LoginDto loginDto, HttpServletRequest request) {
        System.out.println("loginId:"+loginDto.getLoginId());
        System.out.println("loginPw:"+loginDto.getLoginPw());

        //로그인 액션 : 아이디, 암호가 DB에 있으면 로그인 성공, 아니면 실패
        List<MemberEntity> list = memberRepository.findByMemberIdAndMemberPw(
                loginDto.getLoginId(),
                loginDto.getLoginPw()
        );

        ResultDto resultDto = null;

        if( list.size() > 0 ) {
            //로그인 성공
            resultDto = ResultDto.builder()
                    .status("ok")
                    .result(1)
                    .build();
            request.getSession().setAttribute("loginId", loginDto.getLoginId());
            //request.getSession().invalidate(); //로그아웃처리
        }else{
            //로그인 실패
            resultDto = ResultDto.builder()
                    .status("ok")
                    .result(0)
                    .build();
        }

        return resultDto;
    }

    @PostMapping("/joinAction")
    public ResultDto loginAction(@RequestBody JoinDto joinDto) {
        System.out.println("loginId:"+joinDto.getLoginId());
        System.out.println("loginPw:"+joinDto.getLoginPw());
        System.out.println("loginNickname:"+joinDto.getLoginNickname());

        MemberEntity memberJoinEntity = MemberEntity.toJoinEntity( joinDto );

        //로그인 액션 : 아이디, 암호가 DB에 있으면 로그인 성공, 아니면 실패
        MemberEntity newEntity = memberRepository.save(memberJoinEntity);

        ResultDto resultDto = null;

        if( newEntity != null  ) {
            //회원가입 성공
            resultDto = ResultDto.builder()
                .status("ok")
                .result(1)
                .build();
        }else{
            //회원가입 실패
            resultDto = ResultDto.builder()
                .status("ok")
                .result(0)
                .build();
        }

        return resultDto;
    }
    @PostMapping("/update_point")
    public ResultDto upPoint(HttpServletRequest request){



        String loginId = (String)request.getSession().getAttribute("loginId");


        MemberEntity newEntity1 = (MemberEntity) memberRepository.findByMemberId(loginId);
        List<OrderEntity> orderEntity = orderRepository.findByOrderNo(1L);
        int a = orderEntity.get(0).getOrderTotalPrice();

        MemberEntity newEntity2 = MemberEntity.toPointEntity(orderEntity.get(0));


        newEntity1.setMemberPoint(a);


        MemberEntity newEntity = memberRepository.save(newEntity1);



        ResultDto resultDto = null;

        if( newEntity != null  ) {
            //회원가입 성공
            resultDto = ResultDto.builder()
                    .status("ok")
                    .result(1)
                    .build();
        }else{
            //회원가입 실패
            resultDto = ResultDto.builder()
                    .status("ok")
                    .result(0)
                    .build();
        }

        return resultDto;
    }


}


