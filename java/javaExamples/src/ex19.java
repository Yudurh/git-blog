import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {

        //논리연산자
        // && : AND 로직
        // || : OR 로직

        /*System.out.println( true&&true );
        System.out.println( true&&false );
        System.out.println( false&&true );
        System.out.println( false&&false );

        System.out.println( true||true );
        System.out.println( true||false );
        System.out.println( false||true );
        System.out.println( false||false ); */


        //연습
        // AND : ~이고, ~이면서
        // OR : ~이거나, ~또는

        //1. i값이 10보다 큰가? true false로 출력
        //2. i값이 10보다 작은가?
        //3. i값이 10보다 크고 30보다 작은가?
        //4. i값이 10보다 크거나 30보다 작은가?
        //5. i값이 30보다 같거나 작은가?
        //6. i값이 15와 30사이에 있는가?
        //7. i값은 2의 배수인가? %연산의 결과가 0일때 배수임
        //8. i값은 3의 배수인가?
        //9. i값의 약수중 4가 있는지
        //10. i값은 2의 배수이면서 5의 배수인가?

        int i = 20;

       /* System.out.println( i>10 );
        System.out.println( i<10 );
        System.out.println( i>10 && i<30);
        System.out.println( i>10 || i<30);
        System.out.println( i<=30 );
        System.out.println( i>15 && i<30);



        System.out.println( i%2==0 );
        System.out.println( i%3==0 );
        System.out.println( i%4==0 );
        System.out.println( i%2==0 && i%5==0);

        // 이상 : 같거나 큰 것   >=
        // 이하 : 같거나 작은 것  <=
        // 초과 : 같지 않고 큰 것   >
        // 미만 : 같지 않고 작은 것  < */

        // 연습
        //11. i값이 10이상이고 30미만?
        //12. i값이 15초과 30이하?
        //13. 철수가 사과를 한 개 사려는데 사과값이 1000원 단위이면 사고
        //    아니면 안산다
        //    그리고 5000원 이상이면 안살려고 한다
        //    사과값이 3000원 일때 살지 안살지 true/false?


        System.out.println( i>=10 && i<30);
        System.out.println( i>15 && i<=30);


        Scanner scan = new Scanner(System.in);
        System.out.println("사과값 입력");

        int a = scan.nextInt();


        System.out.println( (a%1000)==00 && (a<5000) );












    }
}
