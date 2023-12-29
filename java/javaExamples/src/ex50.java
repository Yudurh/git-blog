public class ex50 {
    //연습 - 함수의 선언과 호출
    //1. 함수이름 : sum
    //   매개변수 : int형 2개(int a, int b)
    //   반환값 : 두 매개변수의 합
    // 입력예) 10, 20
    // 출력예) 총합 : 30

    static void sum( int a, int b ){
        int c = a+b;
        System.out.println(a + "," + b);
        System.out.println( "총합: "+ c );
        return;
    }
    static int sum1(int a, int b){
        System.out.println( a + "," + b );
        return a+b;
    }
    static double avr( int a, int b, int c ){
        System.out.println( "함수이름" + "(" + a + ", " + b + ", " + c + ")");
        return (a+b+c)/3.0;
    }
    static String vendingmachine(int a ) {
        //null : 선언은 되었지만 주소값은 없다.
        //empty : 선언은 되고 주소값은 있다 하지만 값없음
        String item ="";
        System.out.println( item.length());

        if (a == 1000) {
            item = "포카리스웨트";
            return "포카리스웨트";
        } else if (a == 2000) {
            item = "콜라";
            return "콜라";
        } else if (a == 3000) {
            item = "오렌지쥬스";
            return "오렌지쥬스";
        } else {
           return "해당 음료가 없습니다";
        }

    }


    //2.함수이름 : avr
    //  매개변수 : int형 3개
    //  반환값 : 세 매개변수의 평균값
    // 입력예) 함수이름( 10, 20, 30);
    // 출력예) 평균값: 20

    //3. 함수이름 : vendingmachine 자판기
    //매개변수 : 금액 정수값 예)1000
    //반환값 : 상품이름 예) "포카리스웨트"
    // 입력예: vendingmachine(1000)
    // 출력예: "포카리 스웨트"


    public static void main(String[] args) {

        sum(10,20);
        int re = sum1(10,20);
            System.out.println("총합 : " + re);


            double re1 = avr(12,13,50);
        System.out.println( "평균값: " + re1);

        String re2 = vendingmachine(3000);{
            System.out.println(re2);
        }


    }
}
