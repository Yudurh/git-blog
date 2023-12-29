public class ex05 {
    public static void main(String[] args) {
        //데이터 타입 (type), 형
        //기본타입 Primitive 8개
        //정수형 5개 : int(4) long(8) short(2) byte(1) char(2)
        //실수형 2개 : double(8) float(4)
        //논리형 1개 : boolean(1)

        //정수형 변수 int
        int myint = 10; //리터럴 순수한값
        System.out.println( myint );
        //long 8
        long mylong = 20L; // 리터럴 8바이트 Long데이타로 초기화 되어 들어감
        System.out.println( mylong );
        //short 2
        short myShort = 30;
        System.out.println( myShort );
        //byte 1
        byte mybyte = 40;
        System.out.println( mybyte );
        //char 2
        char myChar = 10;
        System.out.println( (int)myChar ); //타입변경
        //문자형리터럴은 단따옴표를 사용
        myChar = '가';
        System.out.println( (int)myChar );
        System.out.printf("%x\n",(int)myChar);
        // 유니코드 표에서 한글시작점 0xAC00

        //실수형 double 9
        double myDouble = 6.24d;
        System.out.println( myDouble );
        //float 4
        float myFloat =3.14f;
        System.out.println( myFloat );

        //논리형
        boolean myBoolean = true;
        System.out.println( myBoolean );

        //문자열형 string : 가변형
        String myString = "문자열입니다"; //리터럴 : 쌍따옴표 이용
        System.out.println( myString );





        //문자한자(유니코드) char : 2바이트
        //문자열 string : 가변형 (길이제한없음)
        //함수형 : 익명함수(람다식)을 담는 타입
        //객체형 : 클래스객체를 담는 타입
    }
}
