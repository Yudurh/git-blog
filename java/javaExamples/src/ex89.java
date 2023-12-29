import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex89 {
    public static void main(String[] args) {

        //맵 Map
        // : Key-Value(키-값)로 된 데이타 구조
        // : JSON,XML에 데이터 연결에 사용됨
        // : 인덱스나 순서가 없음

        // JSON/XML은 통신을 통해서 정보를 보내는 형식
        //https://www.utilities-online.info/xmltojson


      /*
      <student>

<name>홍길동</name>
<age>30</age>
<job>worker</job>
<phone>01012345678</phone>
</student>



        {
           "student": {
            "name": "홍길동",
                    "age": "30",
                    "job": "worker",
                    "phone": "01012345678"
        },
            "#omit-xml-declaration": "yes"
        }*/

        //웹/앱에서의 통신 규약
        //1. TCP/IP 소켓 통신 : 게임, 채팅
        //2. HTTP 통신 : 대부분의 웹앱에서 사용

        //                      HTTP통신
        //클라이언트(웹브라우저) <--------> 서버(웹서버)
        //                   요청------>
        //                   <------응답
        //                   (HTML,XML,JSON,FILE)

        //HashMap의 구현 인터페이스인 map의 타입을 가진다. 다형성 - 업캐스팅
        Map<String, String> map = new HashMap<>();
        map.put("username", "hong"); //아이디
        map.put("password","1234"); //암호
        System.out.println(map);
        //list는 대괄호로 출력
        //map운 중괄호로 출력

        System.out.println(map.get("username"));
        System.out.println(map.get("password"));

        //전체 순환
        //for문 안됨 - 인덱스 없음

        //향상된 for문
        //set타입으로 키 문자열만 가져옴
        Set<String> keys = map.keySet();
        for ( String key : keys ){
            System.out.println( map.get(key));
        }
        //이터레이터를 이용한 순환
        Iterator<String> it = keys.iterator();
        while(it.hasNext() ){
            String key = it.next();
            System.out.println( map.get(key) );
        }
        //연습문제
        //맵(map) 연습문제
        //철수라는 학생이 데이타를 맵으로 설정해 보자.
        //map의 이름은 student라 하고
        //키값 age : 값 "20"
        //키값 height : 값 "170"
        //키값 name : "배철수" 로 데이타를 설정후
        //모든 Key Value를 출력하시오.
        //1.향상된 for문 사용
        //2.이터레이터 사용

        Map<String, String>student = new HashMap<>();
        student.put("age","20");
        student.put("height","170");
        student.put("name","배철수");
        System.out.println(student.get("age"));
        System.out.println(student.get("height"));
        System.out.println(student.get("name"));



        Set<String> ch = student.keySet();
        for (String chs : ch){
            System.out.println( student.get(chs) );
        }
        Iterator<String> ch1 = ch.iterator();
        while(ch1.hasNext()){
            String chs = ch1.next();
            System.out.println( student.get(chs) );
        }








    }
}
