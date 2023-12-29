package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Request Mapping : HTTP 요청에 대한 경로와 응답 메소드를 정의한다.
//@GetMapping : 사용자의 HTTP Get요청에 대한 응답 경로와 메서드를 정의합니다.
//@PostMapping : Post요청에 대한 응답 경로와 메서드를 정의합니다.
// * HTML Form태그 submit은 GET/POST 요청밖에 없음.
// * jQuery의 Ajaxs나 JS의 fetch함수, JS모듈(node모듈)의 axios함수
//   RESTful API로 호출할때 GET/POST/PUT/DELETE 요청이 사용됨.
//                      select/insert/update/delete
//@PutMapping : Put요청에 대한 응답 경로와 메서드를 정의합니다.
//@DeleteMapping : Delete요청에 대한 응답 경로와 메서드를 정의합니다.
//@PatchMapping : Patch요청에 대한 응답 경로와 메서드를 정의합니다.
//   업데이트 작업시 사용.

//PUT 과 PATCH의 차이점
//PUT : 자원의 전체 교체
//PATCH : 자원의 부분 교체

//@RequestMapping : 모든 타입의 요청을 처리할 수 있습니다.
//@RequestMapping(value = "/", method = RequestMethod.GET)
//@RequestMapping(value = "/", method = RequestMethod.POST)

//REST API : HTTP 요청과 응답에 대한 표준화된 규약(약속)
//공공 API가 등장하면서 HTTP 요청과 응답에 대한 통일된 규칙이 필요하게 됨.


@Controller
public class MainController {
    @GetMapping("/")
    //@ResponseBody : 문자열로 응답이기 때문에 사용안함
    public String main(){
        return "index.html"; //index.html을 응답으로 내려준다
    }
}
