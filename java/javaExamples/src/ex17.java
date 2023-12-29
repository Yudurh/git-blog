import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {

        //약수와 소수
        //divisior prime
        //약수 : 어떤 수를 나누어 떨어지게 하는 수의 모임
        // 예) 10의 약수 : 1 2 5 10
        //     3의 약수 : 1 3
        //     9 ''    : 1 3 9
        //소수 : 1과 자기자신으로만 나누어 떨어지는 자연수


        //연습
        //1. 은행계좌의 잔액을 출력해주는 프로그램을 작성
        //2. long정수에 12,300이 있을 때
        //3. "고객님의 계좌에 12,300원이 있습니다." 라고 출력해주자
        //4. "만원짜리는 1개 있습니다."
        //5. "천원짜리는 2개 있습니다."
        //6. "백원짜리는 3개 있습니다."
        //7. 500원 짜리로만 줄때 500원짜리 갯수와 나머지 금액

        Scanner scan = new Scanner(System.in);

        long l1 = 12300;

        System.out.println("고객님의 계좌에" + l1 + "원이" + " 있습니다");

        System.out.println( "만원짜리는 " + (int)(l1/10000)%10 + "개 있습니다");
        System.out.println( "천원짜리는 " + (int)(l1/1000)%10 + "개 있습니다");
        System.out.println( "백원짜리는 " + (int)(l1/100)%10 + "개 있습니다");
        System.out.println( "500원 짜리는 " + (int)l1/500 + "개 나머지 금액은 " + (int)l1%500 + "원 입니다");


        //10의 약수 : 1 2 5 10
        //10의 약수를 구해보자/ /연산자
        System.out.println( 10/1 );
        System.out.println( 10/10 );
        System.out.println( 10/2 );
        System.out.println( 10/5 );

        //%연산자의 결과값
        System.out.println( 3%1 );






    }
}
