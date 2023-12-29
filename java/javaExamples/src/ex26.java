import java.util.Scanner;
import java.util.Random;
public class ex26 {
    public static void main(String[] args) {

        //조건문 switch문
        // 사용빈도 if문70(조건식) sw문 30(비교대상 정수형일때)
        // switch문 형식
        // switch( 정수형변수) {
        //      case 정수값1:
        //          정수값1과 같을때 수행할 수행문;
        //          break;
        //      case 정수값2:
        //          정수값2과 같을때 수행할 수행문;
        //          break;
        //      default:
        //          그외의 값일때 수행할 수행문
        //          break;
        //}
        int i = 10;
        switch (i) {
            case 10:
                System.out.println( "i가 10임" );
                break;
            case 20:
                System.out.println("i가 20임");
                break;
            default:
                System.out.println("그 외의 수");
                break;
        }

        //연습
        //달을 나타내는 정수 1~12 까지의 임의의 정수를 발생시키고
        //3~5이면 "봄입니다"
        //6~8이면 "여름입니다."
        //9~11이면 "가을입니다."
        //12,1,2이면 "겨울입니다." 출력


        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int ww = ra.nextInt(12)+1;
        System.out.println( ww );
        switch (ww) {
            case 3,4,5: //Java 14버전 이상부터 지원하는 기능 주의
                System.out.println( "봄입니다" );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( "여름입니다." );
                break;
            case 9,10,11:
                System.out.println( "가을입니다." );
                break;
            default:
                System.out.println( "겨울입니다." );
                break;
        }


        //세미콜론 안쓰는 경우
        //중괄호뒤, 소괄호뒤 ,대괄호뒤
        //중괄호 사용하는 경우 : 클래스, 함수, 조건문, 반복문, 배열초기화


        //연습
        //애완견 똘이를 기브게 해줄 애완용로봇 프로그램을 만들어보자
        //임의의 코드값 0~3을 발생시키고 이 코드 값에 따라 동작시켜보자
        // 코드 0: 간식을 준다
        // 코드 1: 주인 목소리를 들려준다.
        // 코드 2: 산책시켜준다.
        // 코드 3: 음악을 들려준다
        // 그외 코드값이 들어오면 "잘못된 코드입니다."
        // 출력 예) 코드값 1
        //          로봇 동작 : "주인 목소리를 들려줍니다."


        int dog = ra.nextInt(4);

        switch (dog) {
            case 0 :
                System.out.println( "로봇 동작: " + "간식을 준다" );

                break;
            case 1 :
                System.out.println( "로봇 동작: " + "주인 목소리를 들려준다." );
                break;

                case 2 :
                System.out.println( "로봇 동작: " + "산책시켜준다." );
                    break;

            case 3 :
                System.out.println( "로봇 동작: " + "간식을 준다" );
                break;

                case 4 :
                System.out.println( "로봇 동작: " + "주인 목소리를 들려줍니다." );
                    break;

            default:
                System.out.println("잘못된 코드 값입니다.");

        }







    }

}
