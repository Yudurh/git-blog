public class ex11 {
    public static void main(String[] args) {

        //진수 표현법
        //십진수 : 열개가되면 자릿수가 증가하는 표기법
        //    0 1 2 3 4 5 6 7 8 9
        //이진수 : 2개가 되면 자릿수 증가
        //       0 1 10 11 100 101 111 1000 ...
        //팔진수 : 8개가 되면 자릿수 오름
        //
        //16진수 : 16,,
        //                                  16 17
        //     0 1 2 3 .. 9 A B C D E F ... 10 11


        //2진수 출력
        int i = 10;
        String binaryString = Integer.toBinaryString( i );
        System.out.println( binaryString );
        //8진수 출력
        String octaString = Integer. toOctalString( i );
        System.out.println( octaString );
        //16진수
        String haxString = Integer.toHexString( i );
        System.out.println( haxString );







    }
}
