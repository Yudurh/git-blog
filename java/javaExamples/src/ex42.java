import java.util.Arrays;
import java.util.Random;
public class ex42 {
    public static void main(String[] args) {
        //배열의 선언방법
        //1. 선언과 초기화를 동시에 하는 방법
        int[] nums = { 10,30,20,40,50 };
        //2. 선언후 초기화를 나중에 하는 방법
        int[] nums2 = new int[5]; //길이가 5인 정수배열 선언
        nums2[0] = 10;
        nums2[1] = 30;
        nums2[2] = 20;
        nums2[3] = 40;
        nums2[4] = 50;

        //로또번호 6개를 추첨해서 배열에 넣어보자
        int[] lotto = new int[6];
        Random ra = new Random();

        for (int i=0; i<lotto.length; i++){
            lotto[i] = ra.nextInt(45)+1;
            for (int j=0;j<i;j++){
               if (lotto[i]==lotto[j]){
                   i--;
                   break;
               }
            }


        }
        Arrays.sort(lotto);


        for (int i=0; i<6;i++){
            System.out.println(lotto[i]);
            if (i==0){
                System.out.println("제일 작은 값" + lotto[i]);
            }
            if (i==5){
                System.out.println("제일 큰 값" + lotto[i]);
            }
        }

        //연습
        //1. 로또 번호를 오름차순으로 정렬 출력
        //2. 로또번호 중 가장 작은 수와 가장 큰 수를 출력
        //  정렬후 0번째-가장 작은수5번째-큰수
        //3. 로또번호 추첨시 중복된 번호가 뽑히멵 재추첨
        // 중복이 안되도록 로또번호를 오름차순으로 출력
        // 힌트) 재추첨시 반복변수 i-- 하나 빼고 break하면 됨




    }
}
