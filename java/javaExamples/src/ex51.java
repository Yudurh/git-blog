public class ex51 {
    public static void main(String[] args) {

        //메소드 오버로딩 : 과적
        //정의 : 매개변수의 타입과 갯수를 다르게 함으로 함수의 기능을 확장
        //      하는것
        //이유 : 함수이름을 새로짓지 않아도 매개변수만 다르게 하면 됨
        //예) println( int param ), println( Srting param )

        System.out.println( 10 );
        System.out.println( 3.14f );
        System.out.println( "하이~" );


        echo();
        echo(10);
        echo("하이");
    }

    //기술면접시 단골질문
    //1. 메소드 오버로딩과 오버라이딩의 차이점은?
    //2. 추상화 클래스와 인터페이스의 차이점은?
    //3. 다형성에 대해서 설명하시오





    static void echo(){//메아리 처럼 콘솔에 출력해주는 함수
        System.out.println("echo");
    }
    static void echo(int param){
        System.out.println( "echo" + param );
    }
    static void echo(String param){
        System.out.println( "echo" + param );
    }






}
