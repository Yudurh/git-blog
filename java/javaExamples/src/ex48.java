//import가 들어가는 자리


public class ex48 {//클래스

    //컴파일 타임 : 미리 분석/변환해 놓음 -> .class파일로 변환
    //런타임(실행시) : .class을 실행함 main함수부터 실행

    //함수 선언부가 들어가는 자리

    //void 반환형이 없을때 사용
    static void printString(){
        System.out.println("Hello Java!");
        //return;//생략 가능
    }
    //static/dynmic 변수/함수/클래스
    //static 정정(고정된) : 프로그램시작시 고정된 번지(주소값)에 위치시키고
    //                    프로그램 종료시까지 변경되지 않는 변수/함수/클래스-객체에 사용
    //static에서는 static만 호출가능

    //매개변수랑? 함수의 입력값으로 호출시에 변수나 리터럴로 값을 전달
    //반환값이란? 함수의 출력값으로 함수 종료시 호출부에 전달해주는 값을 의미
    public static void main(String[] args) { //main함수

        System.out.println("함수 호출 시작");
        //함수의 호출부
        printString();
        System.out.println("함수 호출 끝");


    }
}


//다른 class 선언부가 들어가는 자리