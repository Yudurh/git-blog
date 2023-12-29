public class ex90 {
    public static void main(String[] args) {

        //래퍼 클래스(Wrapper Class)
        //1. 기본자료형 8개를 감싸서 클래스로 만든 것
        //2. 기본자료형 8개를 클래스 객체로 전달하기 위해서 필요함
        //  Object의 다형성을 이용한 데이타를 전달이 용이함

        //기본자료형 8개 : int long short byte char float double boolean
        //래퍼클래스 8개 : Integer Long Short Byte Character Float Double Boolean
        // 숫자형 클래스 Number <=> int,long,short,byte,float,double

        //지원중단-Deprecated : 최신버전에서는 지원하지 않는다. 하위호환은 됨
        Integer intValue = new Integer (10);
        System.out.println( intValue );


        Integer intValue2 = 10;
        System.out.println( intValue2 );
        System.out.println( intValue2.intValue() );//int
        System.out.println( intValue2.doubleValue());//double

        Number num1 = 20;
        System.out.println( num1.intValue() );
        System.out.println( num1.doubleValue() );

    }
}
