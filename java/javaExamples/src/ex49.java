public class ex49 {
    //함수의 선언과 호출 4가지 향식
    //선언부
    //      입력      출력
    //1.  매개변수x   반환형x
    static void func1(){
        System.out.println("func1 호출됨");
        return;
    }
    //2.  매개변수o   반환형x
    static void func2( int param ){
        System.out.println("func2 호출됨");
        System.out.println("매개변수"+param);
        return;
    }
    //3.  매개변수x   반환형o
    static int func3(){
        System.out.println("func3 호출됨");
        return 10;
    }
    //4.  매개변수o   반환형o
    static int func4( int param ){
        System.out.println("func4 호출됨");
        System.out.println("매개변수"+param);
        return 20;
    }

    public static void main(String[] args) {

        //호출부
        //      입력      출력
        //1.  매개변수x   반환형x
        func1();
        //2.  매개변수o   반환형x
        func2(30);
        //3.  매개변수x   반환형o
        int result = func3();
        System.out.println("반환값은 "+ result);
        //4.  매개변수o   반환형o
        result = func4(40);
        System.out.println("반환값은 " + result);


    }
}
