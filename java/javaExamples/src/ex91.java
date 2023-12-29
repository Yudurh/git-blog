import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ex91 {
    public static void main(String[] args) {
        //세트 Set 집합
        //  : 인덱스(순서)없음. 중복된 데이타를 허용하지 않음
        //  : 집합 연산 - 교집합,합집합,차집합
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("변사또");
        set.add("사임당");
        System.out.println( set );

        //중복데이타 추가안됨
        boolean isAdded = set.add("홍길동");
        System.out.println( isAdded );
        System.out.println( set );

        //전체 순환
        for (String name: set){
            System.out.println( name );
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //집합연산 - 교집합,합집합,차집합
       Set<Integer> setA = new HashSet<>();
       Set<Integer> setB = new HashSet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);
        setB.add(30);
        setB.add(40);
        setB.add(50);
        System.out.println(setA);//[10, 20, 30]
        System.out.println(setB);//[50, 40, 30]
        //교집합
        //setA.retainAll(setB);//setA가 교집합으로 변경됨
        //System.out.println(setA);//[30]

        //차집합
        setA.retainAll(setB);
        System.out.println(setA);//[20,10]

        //합집합
        setA.addAll(setB);
        System.out.println(setA);//[50,20,40,10,30]

        //setA가 setB를 포함하는가?
        System.out.println(setA.containsAll(setB));


    }
}




