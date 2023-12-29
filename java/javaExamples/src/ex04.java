public class ex04 {
    public static void main(String[] args) {
        //변수와 상수
        //변수 : 데이터를 저장하는 메모리 공간(4바이트,8바이트)
        //상수 : 한번만 값을 저장할수있는 변수 (변하지 않는 값을 저장할때, 예-파이값)
        //비트 : 0 또는 1
        //바이트 : 8비트
        //1키로바이트 : 1024 바이트
        //1메가바이트 : 1024 키로바이트
        //1기가바이트 : 1024 메가바이트
        //1테라바이트 : 1024 기가바이트

        //변수 선언
        //형식1)변수타입 변수이름;
        //     변수이름 = 초기값;
        int age; //4byte 메모리공간을 만들고(int), 이름을 age로 명명함
        age = 20;
        System.out.println( age );
        //형식2) 변수타입 변수이름 = 초기값;
        int price = 1000;
        System.out.println( price );
        //주의 변수를 초기화하지 않고 사용시 에러
        //int number;
        //System.out.println( number );

        //상수
        final double PI = 3.14; //PI 파이값은 원주율을 의미한다. 고정값
        //한 번 값이 초기화되면, 다시 값을 변경시킬수 없다.
        //PI = 5.14;
        System.out.println( PI );




    }
}
