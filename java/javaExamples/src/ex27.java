import java.util.Random;
public class ex27 {
    public static void main(String[] args) {

        //반복문 for문 while문 do-while문
        //사용빈도 70    30      거의안씀

        //반복문 : 반복적으로 여러번 수행하도록 해주는 명령문

       /* System.out.println("Happy!");
        System.out.println("Happy!");
        System.out.println("Happy!");
        System.out.println("Happy!");
        System.out.println("Happy!");

        for(int i=0; i<5; i++){
            System.out.println("Happy!");
        }

        */



        //for문 형식
        // for(  반복변수 초기화; 반복조건: 증감문  ){
        //      반복되는 수행문;
        //}
        //실행되는 순서 1->2->3->4 ->2->3->4->... false되면 함수를 나감
        // 초기화/조건/증감에 따라서 무한 루프에 빠지기도 함.
        //for( int i=0/*1*/; i<5;/*2*/ i++/*4*/){
        //    System.out.println( i );//3
        //}

      /*  for( int i=0; i<5; i-- ){
            System.out.println( i );//3
무한루프
        }
        */

        //연습
        //1. 반복변수 i값을 1부터 10까지 출력
        // 빈줄 출력 println()
        //2. i값 10부터 1까지 출력
        //빈줄 출력
        //3. i값을 -20부터 10까지 출력하되 2씩 증가하여 출력하시오
        //4. for문 안에서 if문을 사용하여
        //  1부터 100사이의 5의 배수만 출력하시요
        //5. i값 1부터 100까지의 합을 구하기오
        //6. i값 1부터 100사이에 끝자리가 3으로 끝나는 수만 출력하고,
        //  이 수들의 갯수를 구하시오
        //7. 369게임을 하고있다. 1~100까지 박수를 몇번 쳐야 되나요?





        /*for ( int i=1; i<=10; i++ ){
            System.out.println( i );
        }

        System.out.println("");

        for ( int i=10; i>0; i-- ){
            System.out.println( i );
        }
        System.out.println("");

        for ( int i=-20; i<11; i+=2 ){
            System.out.println( i );
        }
        for ( int i=1; i<=100; i++ ){
            if (i%5==0){
                System.out.println(i);
            }
        }*/

        /*
        int sum = 0;
        for( int i = 1; i<=100; i++ )
        {
            sum = sum + i;
        }
        System.out.println( sum );


        int co = 0;
        for( int i = 1; i<=100; i++ ){
            if(i%10 == 3){
                System.out.println(i);}
            co++;
        }
        System.out.println( co );



        int cob = 0;
        for ( int i=1; i<=100; i++ ) {
            int num100 = (int)( i / 100) % 10;
            int num10 = (int) (i / 10 )% 10;
            int num1 = (int) i % 10;

            if (num100 == 3 || num100 == 6 || num100 == 9) {
                System.out.println("박수");
                cob++;
            }
            if (num10 == 3 || num10 == 6 || num10 == 9) {
                System.out.println("박수");
                cob++;
            }
            if (num1 == 3 || num1 == 6 || num1 == 9) {
                System.out.println("박수");
                cob++;
            }
            System.out.println( cob );

        }

         */

        //연습
        //영희가 징검다리돌을 건넘
        //돌에는 1부터 100까지 번호가 있고
        //돌 번호는 3이나 7이 들어가 있으면, 건너뛰려고 한다.
        //예) 13-건너뜀. 71-건너뜀
        //영희가 건너뛰 돌의 갯수와 밟은 갯수를 출력

        //2. 랜덤수 1부터 100까지 수를 100개 발생시키고
        // 그 랜덤수가 3의 배수이거나 2의 배수이면 카운트를 증가시키고
        //그 카운트 갯수를 출력하시오

        //3. 10의 약수의 개수와 그 약수를 출력하시오



       /*
        int ccc = 0;
        for( int i=1; i<101; i++){
            int num100 = i/100%10;
            int num10 = i/10%10;
            int num1 = i%10;

            if(num100==3||num100==7){
                System.out.println( i + " - 건너뜀");
                ccc++;
            }
            else if(num10==3||num10==7){
                System.out.println( i + " - 건너뜀");
                ccc++;
            }
            else (num1==3||num1==7){
                System.out.println( i + " - 건너뜀");
                ccc++;
            }


        }
        System.out.println( ccc );
        System.out.println( 100-ccc );


        */
        Random ra = new Random();

        int cdc = 0;


        for (int i = 1; i<101; i++){
            int rr = ra.nextInt();
            int sum = i+rr;

            if(sum%3==0 || sum%2==0){
                cdc++;
            }
        }
        System.out.println(cdc);


        int asd = 0;
        for (int i = 1; i<=10; i++){

            if(10%i == 0) {
                System.out.println("약수" + i);
                asd++;

            }

        }
        System.out.println( "약수의 갯수" + asd );

















    }
}
