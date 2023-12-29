package com.study.springboot;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//자바스프링 프레임워크에서 UI템플릿(타임리프,JSP)에 데이타 전달하는 방법
//1. model 객체
//2. request 객체
//3. session 객체
//4. ModelAndView 객체

//객체별 수명주기
// application : 웹브라우저 닫을 때까지 데이타가 유효함
// session : 로그인해서 로그아웃 할 때까지 (세션 소멸시까지 session.invalidate()호출시까지)
// request : 요청에 대한 응답하기까지(단 forward는 제외 응답한게 아님)
// model : request와 같음



@Controller
public class MainController {
    @GetMapping("/")
    public String main(){
        return "redirect:model1";
        }



        //인텔리제이에서 컨트롤 + 알트 + O 키로 auto import가 가능
        //@Requestmapping : GET/POST/PUT/PATCH/DELETE 모든 요청을 받을 수 있음
        @GetMapping("/model1")
        public String model1(HttpServletRequest request){
        //request 객체 사용

        request.setAttribute("name","홍길동");
        request.setAttribute("age",30);

        //session 객체 사용
        request.getSession().setAttribute("isLogin",true);
        //세션을 초기화한다. 로그아웃 처리한다
//        request.getSession().invalidate();


        return "index";
        }
        //쿠키 Cookie : 웹브라우저(프론트)에서 저장하는 간단한 데이타(비회원 장바구니 처리)
        //새션을 사용하는 이유: 1. HTTP통신에는 연결성이 없음.
        //                   2. 로그인하고나서 페이지이동시 또 다시 로그인을 하지 않는다
        //세션 처리 흐름도
        //          웹브라우저                               자바서버(WAS,톰캣)
        //1.  localhost:8080으로 요청
        //2.                                             응답으로 JSESSIONID값을 쿠키값으로 전달
        //3.  쿠키값으로 JSESSIONID을 저장한다
        //4.  localhost:8080/login 재요청
        //    + JSESSIONID 포함해서 보냄
        //5.                                            JSESSIONID 리스트에서 찾아서 연결성 유지
        @RequestMapping("/post-form")
        public String postForm(){

                return "postForm";
        }

        @RequestMapping("/model2")
        public String model2(HttpServletRequest request){

            //request 객체에서 파라미터값을 받을 수 있다.
            String param_name = request.getParameter("name");
            String param_age = request.getParameter("age");
            request.setAttribute("name", param_name);
            request.setAttribute("age", param_age);

        return "index";
        }
        @RequestMapping("/model3")
    public String model3(HttpServletRequest request, Model model){
            model.addAttribute("name","변사또");
            model.addAttribute("age",40);

            request.getSession().setAttribute("isLogin",false);

            return "index";
        }
    @RequestMapping("/model4")
    public ModelAndView model4(HttpServletRequest request, ModelAndView mv){
        //ModelAndView : 모델(데이타)과 뷰(HTML)을 동시에 저장/응답하는 객체
        //모델 설정
        mv.addObject("name","사임당");
        mv.addObject("age",20);

        //뷰 설정
        mv.setViewName("index");

        return mv;
    }
    }
