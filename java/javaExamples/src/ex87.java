import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class ex87 {
    public static void main(String[] args) {
        //데이타를 담는 그릇 - 데이타 구조
        //1. 변수 : 단 하나의 값
        //2. 배열 : 인덱스가 있는 연속된 공간에 담음. 단점 크기가 고정됨
        //3. 리스트 : 인덱스가 있는 연속된 공간
        //         : 추가/삭제가 간편하다. 크기가 가변적임
        //         : 제네릭을 지원한다. (선언시에 타입이 확정)
        //4. 맵 : Key-Value 형태의 데이타 순서가 없음
        //5. 세트 : 집합구조의 데이터 (중복없음) 순서가 없음



        //콜렉션 프레임워크 : list, map, set
        //1. list
        //  list 인터페이스 구현체로 ArrayList(일반적), LinkedList(알고리즘기반) 클래스 사용
        //                          근접한 데이터 접근, 산재해있는 데이터 접급
        //2. map
        //  map 인터페이스 구현체로 HashMap 클래스 사용
        //3. set
        //  Set 인터체이스 구현체로 HashSet 클래스 사용
        //해쉬(HashCode) : 내부 데이타간의 연결을 위한 유일한 키값(정수)

        //ArrayList
        ArrayList<String> fruits = new ArrayList<String>();
        System.out.println(fruits);//[]
        //아이템을 추가 add()
        fruits.add("수박");
        fruits.add("망고");
        fruits.add("복숭아");

        System.out.println(fruits);

        //맨앞에 추가
        fruits.add(0,"바나나");
        System.out.println(fruits);
        //중간에 추가
        fruits.add(1,"레몬");
        System.out.println(fruits);
        //지우기
        fruits.remove(1);
        System.out.println(fruits);
        // 오름차순 정렬
        Collections.sort(fruits);
        System.out.println(fruits);
        //내림차순 정렬
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println(fruits);
        //리스트 길이
        System.out.println(fruits.size());
        //데이타의 변경과 치환
        fruits.set(1,"애플망고");
        System.out.println(fruits);
        //전체지우기
        fruits.clear();
        System.out.println(fruits);

        //연습문제
        //1.names라는 arrayList를 만들고
        //2."홍길동", "사임당", "이순신", "변사또" 추가하고,
        //3.맨앞에 "춘향이" 추가하고
        //4."사임당"삭제하고
        //5.arrayList 갯수 size()함수를 이용하여 출력하고
        //6."홍길동"을 "제임스"로 변경하시오. set함수
        //7.오름차순 정렬하시오.
        //8.내림차순 정렬하시오.
        ArrayList<String> names = new ArrayList<String>();
        names.add("홍길동");
        names.add("사임당");
        names.add("이순신");
        names.add("변사또");
        System.out.println(names);
        names.add(0,"춘향이");
        System.out.println(names);
        names.remove("사임당");
        System.out.println(names);
        System.out.println(names.size());
        names.set(0,"제임스");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);








    }
}
