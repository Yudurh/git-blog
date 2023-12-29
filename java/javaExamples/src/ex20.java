import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {

        //삼항연산자 ?
        //형식 : 조건식 ? A값 : B값
        //조건식이 true이면 A값을 반환하고, false이면 B값을 반환한다.
        //조건식 : 비교논리연산자로 구성된 식 예) i>10 && i<30
        int n = (true) ? 10 : 20;
        System.out.println( n );
        int m = (false) ? 10 : 20;
        System.out.println( m );

        int k = ( 10< 20 && 10%2 !=0) ? 10 : 20;
        System.out.println( k );

        //연습
        int i = 20;
        //1. i값이 2의 배수이면, "2의 배수입니다." 아니면
        //   "2의 배수가 아닙니다." 문자열을 출력하시오

        System.out.println( (i%2==0) ? "2의 배수입니다." : "2의 배수가 아닙니다." );

        //2. Scanner로 오늘 섭씨온도를 입력받고,
        //   30도 미만이면 "선선해요~"
        //   30도 이상이면 "더워요~"
        //   35도 이상이면 "뜨거워요~" 라고 출력


        Scanner scan = new Scanner(System.in);
        System.out.println("섭씨 입력");
        int c = scan.nextInt();
        System.out.println( (c<30) ? "선선해요~" : (c>=35) ? "뜨거워요~" : "더워요~" );





    }
}
