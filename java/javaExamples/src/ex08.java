public class ex08 {
    public static void main(String[] args) {

        //문자형 char 2바이트
        //문자열형 string 길이제한 없음

        char myChar = 'A';
        System.out.println( myChar );
        System.out.println((int)myChar);
        //char -> int 강제형변환
        int k = myChar;
        System.out.println( k );

        //아스키코드표 : 컴퓨터 초창기 설계 영문자 숫자 특수문자(백스페이스 탭 엔터) 코드값으로 정한 값


        //연습문제
        //1. 대문자 'X'를 정수형 숫자값으로
        //2. 97값을 가진 정수형 변수를 이용하여 'a'를 출력
        //3. 71 79 79 68 숫자를 이용하여 GOOD문자열 출력
        char 로 = 'X';
        System.out.println( (int)로);

        System.out.println( (char)97 );

         int MYA = 71;
        int MYB = 79;
        int MYC = 68;
        char MG = (char) MYA;
        char MO = (char) MYB;
        char MD = (char) MYC;

        System.out.print(MG);
        System.out.print(MO);
        System.out.print(MO);
        System.out.print(MD);

        System.out.print((char)71);
        System.out.print((char)79);
        System.out.print((char)79);
        System.out.print((char)68);

        //문자열형 string
        String str = "Java is good!";
        //문자열형에서 문자 하나만 가져오기
        //charAt 함수 사용
        char c = str.charAt( 0 );// 인덱스 0 : 첫번째 문자
        System.out.println( c );

        //1. 문자열 "Java coding is good!"을 문자열형 myStr에 저장하고
        //2. 콘솔에 출력
        //3. charAt함수를 이용해 'c'와'g'출력

        String mystr = "Java coding is good!";
        System.out.println(mystr);
        char ㅊ = mystr.charAt(5);
        char ㅎ = mystr.charAt(10);
        System.out.println( ㅊ );
        System.out.println( ㅎ );






    }
}
