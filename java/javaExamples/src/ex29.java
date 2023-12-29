import java.util.Random;
public class ex29 {
    public static void main(String[] args) {
        //무한반복문
        //무한히 반복하는 반복문
        //1. for문 조건을 입력안하면 무한히 반복함
        //항상대기하는 시스템에 사용함 ex)자판기

        for(;;){
            break;
        }
        //2.while문
        while(true){
            break;//반복문 탈출
        }


        int i =0;
        for (;;){
            System.out.println(i++);
            if( i>10 ){
                break;
            }
        }

        //연습문제
        //1. 철수와 영희가 주사위 놀이를 한다.
        // 철수의 주사위눈이 더 커서 이길때까지
        // 주사위를 반복해서 던진다고 하자
        // 출력예) 철수 주사위 눈 : 2
        //        영희 주사위눈 : 3
        Random ra = new Random();

        for (;;){
            int a = ra.nextInt(5)+1;
            int b = ra.nextInt(5)+1;
            System.out.println("철수: " + a );
            System.out.println("영희: " + b );
            if (a>b){
                System.out.println( "철수가 승");
            } else if (a<b) {
                System.out.println("영희가 승");
            }else {
                System.out.println("무승부");
            }
            break;

        }
        //2. 영희가 주사위 2개를 계속해서 던져서
        //두 주사위 숫자가 똑같을 때 까지 던진다.
        //영희는 몇번만에 성공할지 시도횟수를 출력하시오
        //출력값 : 1:3 2:4 5:6 3:3 stop!
        //          던진 갯수는 4번입니다.

        int c = 0;
        int d = 0;
        int e = 0;
        for (;;){
            c = ra.nextInt(6)+1;
            d = ra.nextInt(6)+1;
            e++;
            if (c>d){
                System.out.println( c + " : " + d);
            } else if (c<d) {
                System.out.println( c + " : " + d);
            }else {
                System.out.println( c + " : " + d);
                System.out.println( "stop!");
                System.out.println("던진 갯수는 " + e + "입니다.");
            break; }

        }

        //3. 패널티킥 게임을 만들어 보자
        //골키퍼와 킥커가 공을 찬다고 하자
        // 각각 가운데/왼쪽/오른쪽 3가지 경우의 수가 있을때
        // 킥커가 공을 넣을때 까지 게임

        int f = 0;
        int g = 0;
       /* for (;;){
            g = ra.nextInt(3);
            f = ra.nextInt(3);

            switch(f) {
                case 0:
                    System.out.println("킥커 : 가운데");
                    break;
                case 1:
                    System.out.println("킥커 : 왼쪽");
                    break;
                case 2:
                    System.out.println("킥커 : 오른쪽");
                    break;
            }
            switch (g) {
                case 0:
                    System.out.println("골키퍼 : 가운데");
                    break;
                case 1:
                    System.out.println("골키퍼 : 왼쪽");
                    break;
                case 2:
                    System.out.println("골키퍼 : 오른쪽");
                    break;
            }
            if ((f-g)!=0){
                System.out.println( "킥커 승 ");
                break;
            }else {
                System.out.println("골키퍼 승");
            }

        }*/

        //4. 게임방 사장님은 승률조작의 명수이다
        // 게임방 사장님이 3번 프로그램을 수정
        // 키커의 승률과 골키퍼의 승률이 1:1인데
        // 키커와 골키퍼의 승률을 50:100으로 조작해 버렸다
        // 코드 작성

        for (;;){
            g = ra.nextInt(3);
            f = ra.nextInt(9);


            switch(f) {
                case 0:
                    System.out.println("킥커 : 가운데");
                    break;
                case 1:
                    System.out.println("킥커 : 왼쪽");
                    break;
                case 2:
                    System.out.println("킥커 : 오른쪽");
                    break;
                case 3:
                    System.out.println("킥커 : 가운데");
                    g=f;
                    break;
                case 4:
                    System.out.println("킥커 : 왼쪽");
                    g=f;
                    break;
                case 5:
                    System.out.println("킥커 : 오른쪽");
                    g=f;
                    break;
                case 6:
                    System.out.println("킥커: 가운데");
                    g=f;
                    break;
                case 7:
                    System.out.println("킥커 : 왼쪽");
                    g=f;
                    break;
                case 8:
                    System.out.println("킥커 : 오른쪽");
                    g=f;
                    break;

            }
            switch (g) {
                case 0:
                    System.out.println("골키퍼 : 가운데");
                    break;
                case 1:
                    System.out.println("골키퍼 : 왼쪽");
                    break;
                case 2:
                    System.out.println("골키퍼 : 오른쪽");
                    break;
                case 3:
                    System.out.println("골키퍼 : 가운데");
                    g=f;
                    break;
                case 4:
                    System.out.println("골키퍼 : 왼쪽");
                    g=f;
                    break;
                case 5:
                    System.out.println("골키퍼 : 오른쪽");
                    g=f;
                    break;
                case 6:
                    System.out.println("골키퍼 : 가운데");
                    g=f;
                    break;
                case 7:
                    System.out.println("골키퍼 : 왼쪽");
                    g=f;
                    break;
                case 8:
                    System.out.println("골키퍼 : 오른쪽");
                    g=f;
                    break;
            }
            if ((f-g)!=0){
                System.out.println( "킥커 승 ");
                break;
            }else {
                System.out.println("골키퍼 승");
            }



        }








    }
}
