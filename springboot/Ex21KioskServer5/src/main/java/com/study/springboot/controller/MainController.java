package com.study.springboot.controller;

import com.study.springboot.dto.FileDto;
import com.study.springboot.dto.MemberDto;
import com.study.springboot.entity.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class MainController {

    boolean isTakeOut = true; //테이크아웃인가?

    @GetMapping("/")
    public String index(){
        return "redirect:/main";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }
    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "join";
    }
    @GetMapping("/OrderSelect")
    public String orderSelect(){
        return "OrderSelect";
    }

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/MenuSelect")
    public String menuSelect(Model model, HttpServletRequest request){
        String loginId = (String)request.getSession().getAttribute("loginId");
        if( loginId != null ){
            List<MemberEntity> list = memberRepository.findByMemberId(loginId);
            if( list.size() > 0 ){
                MemberEntity memberEntity = list.get(0);
                model.addAttribute("loginNickname", memberEntity.getMemberName());
            }
        }

        return "MenuSelect";
    }
    @GetMapping("/Payment")
    public String payment(){
        return "Payment";
    }
    @GetMapping("/Cart")
    public String cart(){
        return "Cart";
    }
    @GetMapping("/Add_Item")
    public String add_Item(){
        return "Add_Item";
    }
    @GetMapping("/Thanks")
    public String thanks(Model model, HttpServletRequest request){

        String loginId = (String)request.getSession().getAttribute("loginId");
        if( loginId != null ){
            List<MemberEntity> list = memberRepository.findByMemberId(loginId);
            if( list.size() > 0 ){
                MemberEntity memberEntity = list.get(0);
                model.addAttribute("point", memberEntity.getMemberPoint());
            }
        }

        return "Thanks";
    }
    @GetMapping("/takeOut/{isTakeOut}")
    public String takeOut(@PathVariable int isTakeOut){
        if( isTakeOut == 1 ){
            this.isTakeOut = true;
            System.out.println("테이크아웃");
        }else{
            this.isTakeOut = false;
            System.out.println("인스토어");
        }
        return "redirect:/MenuSelect";
    }

    @GetMapping("/admin")
    public String admin(Model model){
        List<MemberEntity> memberlist = memberRepository.findAll();
        model.addAttribute("memberlist",memberlist);



        return "admin";
    }
    @GetMapping("update")
    public String update(@RequestParam(required = false, defaultValue = "0") long memberNo,Model model){

        List<MemberEntity> memberlist = memberRepository.findAll();

        model.addAttribute("memberlist",memberlist.get((int)memberNo-1));
        return "update";
    }

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/admin_p")
    public String product(Model model){
        List<ItemEntity>itemList = itemRepository.findAll();
        model.addAttribute("itemlist",itemList);
        return "admin_p";
    }

    @GetMapping("update_p")
    public String update_p(@RequestParam(required = false,defaultValue ="0") long itemNo,
                           @RequestParam(required = false,defaultValue ="0") long index,
                           Model model){

        List<ItemEntity> itemList = itemRepository.findAll();

        model.addAttribute("itemlist",itemList.get((int)itemNo-1));
        return "update_p";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile[] uploadfile,
                         @RequestParam(required = false, defaultValue = "0") long itemNo,
                         Model model) throws IOException {

        List<FileDto> filelist = new ArrayList<>();
        List<ItemEntity> itemList = itemRepository.findAll();

        for (MultipartFile file : uploadfile){
            if ( !file.isEmpty() ){
                //전송된 파일 데이터를 서버 파일로 저장하는 함수
                //중복되지 않는 랜덤한 파일이름 만들기
                //1.UUID
                //2.yyyyMMddHHmmss랜덤수(0000~9999)

                FileDto dto = new FileDto(UUID.randomUUID().toString(),
                        file.getOriginalFilename(),
                        file.getContentType());
                filelist.add(dto);

                File newFileName = new File(
                        dto.getUuid()+ "_" +
                                dto.getFileName());
                file.transferTo( newFileName );



            }
        }

        model.addAttribute("files",filelist);


        return "redirect:/update_p1";
    }

    @Autowired
    private OrderRepository orderRepository;
    @GetMapping("/admin_o")
    public String order(Model model){
        List<OrderEntity>orderList = orderRepository.findAll();
        model.addAttribute("orderlist",orderList);
        return "admin_o";
    }

    @GetMapping("update_o")
    public String update_o(@RequestParam(required = false,defaultValue ="0") long orderNo,
                           @RequestParam(required = false,defaultValue ="0") long index,
                           Model model){

        List<OrderEntity> orderList = orderRepository.findAll();

        model.addAttribute("orderlist",orderList.get((int)orderNo-1));
        return "update_o";
    }

}


