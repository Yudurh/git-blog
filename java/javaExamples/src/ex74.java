public class ex74 {
    public static void main(String[] args) {
        //자바의 JDK(자바 개발 킷)
        // : 대량의 클래스와 함수가 존재함
        //기본 API 함수 주로
        //  java.util.*     java.lang.* 에 들어있음.

        //java.lang.Object 클래스 : 자바의 최상위 클래스
        //      : 모든클래스가 object를 상속 받는다
        // 다형성을 이용하면 모든 클래스 객체가 Object타입으로
        // 전환될 수 있다

        receive( new MyClass1());
        receive( new MyClass2());



    }
    static void receive(Object obj){
        if (obj instanceof MyClass1){
            System.out.println(((MyClass1) obj).name);
        }
        if (obj instanceof MyClass2){
            System.out.println(((MyClass2) obj).name);
        }

    }
}
class MyClass1 extends Object  {
    String name = "MyClass1";
}
class MyClass2 extends Object  {
    String name = "MyClass2";

}
