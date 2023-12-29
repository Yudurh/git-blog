import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ex88 {
    public static void main(String[] args) {
        //ArrayList 선언 예
        //1. 타입 명시
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        //2. 타입 생략
        ArrayList<Integer> nums2 = new ArrayList<>();
        //3. 크기 선언
        ArrayList<Integer> nums3 = new ArrayList<>(10);
        System.out.println(nums3);
        //4. 선언과 동시에 초기화
        ArrayList<Integer> nums4 = new ArrayList<>(
                Arrays.asList( 10, 20, 30, 40, 50)
        );
        System.out.println( nums4 );
        System.out.println( nums4.get(0) );
        System.out.println( nums4.get(1) );

        //전체 리스트 순환
        for (int i=0; i<nums4.size();i++){
            System.out.println( nums4.get(i) );
        }
        //향상된 for문
        for (Integer num : nums4){
            System.out.println( num );
        }

        //이터레이터(Iterator) : 열거자
        //  : 콜렉션(리스트,맵,셋)의 순차적인 처리를 도와주는 클래스
        // hasNext() : 다음 요소를 가지고 있는지 true/false로 반환
        // next() : 다음 요소값을 반환함(값을 반환하고 인덱스++)
        Iterator<Integer> it = nums4.iterator();
        while ( it.hasNext() ){
            System.out.println( it.next() );
        }

        System.out.println( nums4.contains(30) );//true

        System.out.println( nums4.indexOf(40));//3

    }
}
