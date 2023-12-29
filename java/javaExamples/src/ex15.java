import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        //이항연산자 : 산비논대 (산술>비교>논리>대입)
        //산술연산자 : = - * / (나눗셈의 몫) % (나눗셈의 나머지)
        //           10/3 때 몫은 3 나머지 1
        //           10/3 = 3 , 10%3 = 1
        //           10/5 떄 몫은 5 나머지 0
        //           10/5 = 2, 10%5 = 0
        /*int i = 10;
        int j = 3;
        System.out.println( i + j );
        System.out.println( i - j );
        System.out.println( i * j );
        System.out.println( i / j );
        System.out.println( i % j );*/

        //연습
        //1. 20을 3으로 나누어 몫과 나머지 출력
        //2. 10에 3을 빼고, 그 결과에 2를 곱하고, 다시 그 결과에
        //   3을 더하여 출력
        //3. Scanner를 이용 , 간단한 사칙연산 프로그램 만들기
        //정수 2개를 입력 사칙연산 자동 수행





        int o = 20; int p = 3;
        System.out.println( o / p );
        System.out.println( o % p );
        System.out.println( (o/2 - p)*2 + p );

        Scanner scan = new Scanner(System.in);

        System.out.println( "숫자 1을 입력하시오");
        int inputint1 = scan.nextInt();
        System.out.println( "숫자 2을 입력하시오");
        int inputint2 = scan.nextInt();

        //nextLine() : 문자열입력, 공백포함 한 줄 모두 받음. 엔터치기 전까지
        //next() : 문자열입력 공백까지만 입력 받음
        //        예) " i am a boy "엔터 -> "i"만 출력

        System.out.println("덧셈의 결과는" + (inputint1+inputint2) + "입니다");
        System.out.println("뺄셈의 결과는" + (inputint1-inputint2) + "입니다");
        System.out.println("곱셈의 결과는" + (inputint1*inputint2) + "입니다");
        System.out.println("나눗셈의 결과는" + (inputint1/inputint2) + "입니다");

        scan.close();









    }
}
