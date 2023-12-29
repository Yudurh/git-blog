import java.util.Random;
public class ex39 {
    enum SRP{ Sissors, Rock, Paper }//0, 1, 2

    public static void main(String[] args) {
        //철수와 알파고가 가위바위보 게임을 한다.
        //철수가 가위를 낼 확률 : 1/10
        // ''   바위를   ''   : 5/10
        // ''    보를   ''   : 4/10
        //알파고도 동일한 확률
        //철수가 이길때까지 게임을 한다
        // 과정과 결과를 출력
        //출력예) 철수:가위
        //      알파고:가위
        //        무승부!
        //힌트 총 9가지 경우의 수

        Random ra = new Random();



        //enum 걍 0,1,2로 표현 해도 문제 없음 문자를 숫자값으로 지정
        for (;;){

            int ch = ra.nextInt(10);
            int alp = ra.nextInt(10);

            if (ch==0){
                ch=SRP.Sissors.ordinal();
                System.out.println("철수:가위");
            } else if (ch>=1&&ch<6) {
                ch=SRP.Rock.ordinal();
                System.out.println("철수:바위");
            }else {
                ch=SRP.Paper.ordinal();
                System.out.println("철수:보");
            }
            if (alp==0){
                alp=SRP.Sissors.ordinal();
                System.out.println("알파고:가위");
            } else if (alp>=1&&alp<6) {
                alp=SRP.Rock.ordinal();
                System.out.println("알파고:바위");
            }else {
                alp=SRP.Paper.ordinal();
                System.out.println("알파고:보");
            }
            if (ch==SRP.Sissors.ordinal()) {
                if (alp==SRP.Sissors.ordinal()){
                    System.out.println("무승부");
                } else if (alp==SRP.Rock.ordinal()) {
                    System.out.println("알파고 승");
                }else {
                    System.out.println("철수 승");
                    break;
                }
            }
            if (ch==SRP.Rock.ordinal()) {
                if (alp==SRP.Sissors.ordinal()){
                    System.out.println("철수 승");
                    break;
                } else if (alp==SRP.Rock.ordinal()) {
                    System.out.println("무승부");
                }else {
                    System.out.println("알파고 승");

                }
            }
            if (ch==SRP.Paper.ordinal()) {
                if (alp==SRP.Sissors.ordinal()){
                    System.out.println("알파고 승");
                } else if (alp==SRP.Rock.ordinal()) {
                    System.out.println("철수 승");
                    break;
                }else {
                    System.out.println("무승부");

                }
            }


        }





    }
}
