import java.util.Random;
public class ex32 {
    public static void main(String[] args) {
        //반복문 while문


        //while문 형식
        //초기화;
        //while( 조건 ) {
        //  실행문;
        //  증감; //맨마지막줄
        //}

        //for문 형식
        //for(초기화;조건;증감){
        //     실행문;
        //  }

       /* int i=0;
        while ( i<10 ){
            System.out.println(i);
            i++;
        }*/



        //연습
        //1.j값이 10부터 20까지 출력되도록 하시오
        //2.j값이 20부터 -10까지 출력되도록 하시오
        //3. j값이 1부터 100까지 3의 배수만 출력
        //4. j값이 1부터 10까지 합을 출력
        //5. 어떤 터널이 낮아서 최대로 들어갈수있는
        //  차량의 높이가 5미터 이하이다
        //  1~10미터까지 차량이 임의로 10대 들어올때
        //  차량이 들어가면 통과! 못들어가면 후퇴!를 출력
        //6. 이중 while문 사용
        //  랜덤정수 3~10까지 입력받고 그 수 n으로 정한다.
        //  n:3
        //   *
        //  * *
        // *****
        //  n:5
        //    *
        //   * *
        //  *   *
        // *     *
        //*********

        int j=10;
        while ( j<=20 ){
            System.out.println(j);
        j++;
        }

        j=20;

        while(j>=-10){
            System.out.println(j);
            j--;
        }

        j=1;
        while(j<=100){
            if (j%3==0){
                System.out.println(j);
            }
            j++;
        }
        j=1;
        int c=0;
        while (j<11){
            c=c+j;;
        j++;
        }
        System.out.println(c);


        Random ra = new Random();

        j=1;
        while(j<11){
            int a = ra.nextInt(10)+1;
            if (a<=5){
                System.out.println("통과!");
            }else {
                System.out.println("후퇴!");
            }
            j++;
        }

        int n = 5;
        System.out.println(n);
        j=0;

        while(j<n){
            int i = 0;
            while (i<n-j){
                System.out.print(" ");
                i++;
           }
            i = 0;
            while (i<j*2+1){

            }


            System.out.println();
            j++;
        }


















    }
}
