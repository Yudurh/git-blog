import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        //소수점 버림, 올림, 반올림
        // 소수점 아래 첫자리 버림 : 3.14 -> 3.0
        //       ''        올림 : 3.14 -> 4.0
        //       ''        반올림 : 3.14 -> 3.0

        // 소수점 버림 연산자 : 형변환 연산자 , Math.floor함수
        double d1 = 3.5;
        int i1 = (int)d1; // 3.5 -> 3
        System.out.println( i1 );
        System.out.println( Math.floor(d1) ); //결과값 3.0
        // 소수점 올림 연산자 : (변수 + 0.9) 형변환연산 , Math.ceil 함수
        //                  (int)(3.0+1.0)
        d1 = 3.0;
        System.out.println( Math.ceil(d1));  //3.0
        System.out.println( Math.ceil(3.1)); //4.0

        // 소수점 반올림 연산자 : (변수+0.5) 형변환 연산, Math.round함수
        System.out.println( Math.round(d1));
        System.out.println( Math.round(3.5));


        //연습
        //1. 콘솔에부터 3.141592를 입력받고,
        //2. 소수점 첫째자리에서 반올림한 값을 출력
        //3.      ''           올림한 값을 출력
        //4.      ''           내림한 값을 출력
        //5. 콘솔로부터 3.561을 입력 받고,
        //   소수점 둘째자리에서 반올림, 올림, 내림한 값을 출력

        Scanner scan = new Scanner(System.in);

     /*   System.out.println("수를 입력");
        double a1 = scan.nextDouble();
        System.out.println( Math.round(a1) );
        System.out.println( Math.ceil(a1) );
        System.out.println( Math.floor(a1) );

        System.out.println( "수를 입력" );
        double a2 = scan.nextDouble();
        System.out.println( (double)Math.round(a2*10)/10);
        System.out.println( Math.ceil(a2*10)/10);
        System.out.println( Math.floor(a2*10)/10);*/


        //연습
        //1. 콘솔로부터 123.567를 입력
        //2. 백의 자릿수 1을 출력
        //3. 십의 자릿수 2를 출력
        //4. 일의 자릿수 3을 출력

        System.out.println( "수를 입력" );
        double a3 = scan.nextDouble();
        System.out.println( "백의 자릿수는" + (int)Math.floor( a3/100 )%10 + "입니다" );
        System.out.println( "십의 자릿수는" + (int)Math.floor( a3/10 )%10 + "입니다." );
        System.out.println( "일의 자릿수는" + (int)Math.floor( a3 )%10 + "입니다.");
        System.out.println( "소수점 첫째자리는" + (int)Math.floor( a3*10 )%10 + "입니다" );
        System.out.println( "소수점 둘째자리는" + (int)Math.floor( a3*100 )%10 + "입니다");
        System.out.println( "소수점 셋째자리는" + (int)Math.floor( a3*1000 )%10 + "입니다");






    }
}
