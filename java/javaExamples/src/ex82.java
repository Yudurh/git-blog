public class ex82 {
    public static void main(String[] args) {

        MyImpl obj = new MyImpl();
        System.out.println(obj.calc(10,20));


        //익명객체(이름없는 인터페이스 구현 객체)
        //한번쓰고 버릴 객체는 궅이 클래스로 정의할 필요성이 없다
        //MyFunc1 인터페이스 구현 객체
        MyFunc1 myFunc1 = new MyFunc1() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };
        System.out.println(myFunc1.calc(10,20));


        //람다식으로 익명객체를 간결하게 할 수 있다
        //형식
        //인터페이스이름 객체명 = 이름없음( 매개변수1,매개변수2 ) -> { 코드 };

        MyFunc1 lambda1 = ( x, y) -> {return x + y; };
        System.out.println( lambda1.calc(10,20));

        //익명객체와 람다식은 코드를 담는 변수이다.
        //코드를 함수의 매개변수로 전달 할 수 있다.

        execFunc( lambda1 );
        execFunc( myFunc1 );


        //매개변수가 1개인 람다식
        //MyFunc2 myFunc2 = ( x ) -> {return x*x;};
       // System.out.println(myFunc2.calc(10));
        //매개변수와 반환갓이 없는 람다식
       // MyFunc3 myFunc3 =  () -> {
          //  System.out.println("hello");
      //  };
       // myFunc3.calc();

    }
    static void execFunc( MyFunc1 f1 ){
        System.out.println( f1.calc(10,20) );

    }
        //람다식 Lambda Expression
        //   : JDK 1.8부터 지원
        //   : 함수형 변수를 구현하기 위해서 만든 것
        //   함수형 변수란? 일반변수는 값을 담는다 반면 함수형변수는 코드를 담는다
        //   : 3세대 언어 JS, 코틀린 , 스위프트 언어들에서 함수형 변수를 사용한다.
        //   : 코드를 변수로 담아서 함수의 매개변수로 전달하기 쉽다.
        // 사용하는이유
        // 1. 코드를 변수로 담아서 함수의 매개변수로 전달하기 쉽다
        // 2. 비동기 처리에 유리함. 통신, 사용자 UI/UX에 주로 사용
        //  비동기: 코드의 선언 시점과 실행 시점이 다른 것
        //  : 구현하기 위해서 기존에 잇던 인터페이스를 차용한다.

        //람다식 선언부
        //      구현/실행부 따로 존재
        //@FunctionalInterface : 람다식 선언시에만 사용하는 어노테이션(컴파일지시어)


    }
    @FunctionalInterface
    interface MyFunc1 {
        int calc(int x,int y);
    }
    class MyImpl implements MyFunc1{

        @Override
        public int calc(int x, int y) {
            return x + y;
        }


    }

        @FunctionalInterface
        interface MyFunc2 {
            void calc();
        }



