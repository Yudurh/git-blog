public class ex38 {

    enum SRP{ Sissors, Rock, Paper }//0, 1, 2

    public static void main(String[] args) {

        //열겨형 enum
        //열거형 숫자대신 문자로 의미를 부여하기 위해
        //예) 가위바위보 게임(SRP)
        //  가위:0 바위:1 보:2
        //  가위:Sissors 바위:Rock 보:Paper
        //main 함수 밖에서 선언해야함
        System.out.println( SRP.Sissors );
        System.out.println( SRP.Rock );
        System.out.println( SRP.Paper );
        //열거형 변수 선언
        SRP myTurn = SRP.Sissors;
        if ( myTurn == SRP.Sissors ){
            System.out.println("가위입니다.");
        }
        int myTurn2 = Some.SISSIORS;
    }
}//class

class Some {
    public static final int SISSIORS = 0;
    public static final int ROCK = 1;
    public static final int PAPER = 2;
}
