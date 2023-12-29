import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ex41 {
    public static void main(String[] args) {
        //문자열 배열
        String[] names = { "장미", "수선화", "들국화" };

        //배열의 정렬
        //오름차순 ABC 123 가나다
        //내림차순 CBA 321 다나가
        Arrays.sort( names );//오름차순
        for (String name: names){
            System.out.println(name);
        }
        Arrays.sort( names, Collections.reverseOrder());//내림차순
        for (String name: names){
            System.out.println(name);
        }

        //연습
        //1. for문으로 모든 요소를 출력
        //2. 향상된for문으로 모든 요소 출력
        //3. 문자열의 길이가 3이상인 요소만 출력
        //4. 모든 문자열의 길이의 합을 출력하시오
        //5. 요소(꽃이름)안에 '화'라는 단어가 들어가는 꽃이름만 출력
        //  charAt(index)함수 이용
        //  contains(문자열)함수 이용
        //  indexOf(문자열)함수 이용
        //1
        for (int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }
        //2
        for (String aaa:names){
            System.out.println(aaa);
        }
        //3
        for (int i=0;i< names.length;i++){

            if (names[i].length()>2){
                System.out.println(names[i]);
            }
        }
        //4
        int sum = 0;
        for (int i=0;i< names.length;i++){

            sum = sum+ names[i].length();


        }
        System.out.println(sum);

        for (int i=0;i< names.length;i++){

            if (names[i].indexOf("화")>0){
                System.out.println(names[i]);
            }
            if (names[i].contains("화")){
                System.out.println(names[i]);
            }
            for (int j=0;j< names[i].length();j++){
                if (names[i].charAt(j)=='화'){
                    System.out.println(names[i]);
                }
            }
        }











    }
}
