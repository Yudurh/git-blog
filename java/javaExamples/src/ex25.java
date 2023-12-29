import java.util.Random;

public class ex25 {
    public static void main(String[] args) {

        // 랜덤수(임의의 정수)를 밸생시키는 법
        //뽑기/추첨/마구잡이
        //예) 주사위, 로또, 추첨제, 아이템 발생
        //방법1 - Ramdom 클래스
        //1.import java.util.Random;
        //2.Random rand = new Random(); //객체생성
        //3.0부터 9사이의 랜덤수 발생
        Random rand = new Random();
        // int rai1 = rand.nextInt(10 );
        //System.out.println( rai1 );


        //방법2 - Math 클래스
        //1. random()함수는 0.0 ~ 0.99999999... 사이의 실수발생
/*        System.out.println( randD );
        int rai2 = (int)(randD*10);
        System.out.println( rai2 );
        */

        //연습
        //1. 로또번호 6개를 발생
        // 1~45 임의의 정수 추첨
        // 이번주 로또번호 출력
        //2. 주사위 1~6 값을 하나 발생시켜보자
/*
        int ro1 = rand.nextInt(45);
        System.out.println( "이번주 로또 번호는 " + ro1+1 );
        int ro2 = rand.nextInt(45);
        System.out.println( ro2+1 );
        int ro3 = rand.nextInt(45);
        System.out.println( ro3+1 );
        int ro4 = rand.nextInt(45);
        System.out.println( ro4+1 );
        int ro5 = rand.nextInt(45);
        System.out.println( ro5+1 );
        int ro6 = rand.nextInt(45);
        System.out.println( ro6+1 + " 입니다.");

        int ranD = rand.nextInt(7);
        if (ranD>0){
            System.out.println("주사위 눈의 값은 " + ranD + "입니다.");
        }
*/
        //3. 철수와 영희가 주사위 2개로 놀이를 하고있다
        //  게임의 규칙은 아래와 같다
        //1. 주사위 2개 다 짝수가 나오면 철수 승
        //2. 주사위 2개 다 홀수가 나오면 영희 승
        //3. 그외의 수가 나오면 무승부 이다


        //4. 규칙을 바꿔서 다시 게임
        // 게임규칙
        // 주사위를 2번 던져서
        // 첫번째 주사위는 철수의 점수 이고
        // 두번째 주사위는 영희의 점수 이다.
        // 철수의 점수가 더 높으면 "철수 승"
        // 영희가 더 높으면 "영희 승"
        // 점수가 같으면 "무승부" 라고 출력


        int ranD1 = rand.nextInt(6) + 1;
        int ranD2 = rand.nextInt(6) + 1;/*
        System.out.println(ranD1 + ":" + ranD2);
        if ((ranD1 % 2) == 0 && (ranD2 % 2) == 0) {
            System.out.println("철수 승");
        } else if ((ranD1 % 2) == 1 && (ranD2 % 2) == 1) {
            System.out.println("영희 승");
        } else {
            System.out.println("무승부");
        }
*/
        int ranD3 = rand.nextInt(6) + 1;
        int ranD4 = rand.nextInt(6) + 1;
       /* System.out.println(ranD3 + ":" + ranD4);
        if ((ranD3 % 2) == 0 && (ranD4 % 2) == 0) {
            System.out.println("철수 승");
        } else if ((ranD3 % 2) == 1 && (ranD4 % 2) == 1) {
            System.out.println("영희 승");
        } else {
            System.out.println("무승부");
        }
*/

/*        int ranD5 = rand.nextInt(6) + 1;
        int ranD6 = rand.nextInt(6) + 1;
        System.out.println(ranD5 + ":" + ranD6);
        if (ranD5 > ranD6) {
            System.out.println("철수가 승");
        } else if (ranD5 < ranD6) {
            System.out.println("영희가 승");
        } else {
            System.out.println("무승부");
        }
    */
        //5. 규칙을 바꿔서 다시 게임을 라고 있다.
        // 철수가 주사위를 2개 던져서
        // 첫번째 주사위는 10의 자릿수로
        // 두번째 주사위는 1의 자릿수로 사용
        // 영희도 동일
        // 더 점수가 높은 사람 승

        System.out.println( "철수 주사위");
        System.out.println( ranD1 + "," + ranD2);
        System.out.println( "영희 주사위" );
        System.out.println( ranD3 + "," + ranD4);

        if((ranD1*10 + ranD2) > (ranD3*10 + ranD4)){
            System.out.println( "철수 승" );
        } else if ((ranD1*10 + ranD2) < (ranD3*10 + ranD4)) {
            System.out.println( "영희 승");
        } else {
            System.out.println("무승부");
        }


    }
}
