public class ex52 {




    public static void main(String[] args) {

        calc(12);
        calc(16,25);
       calc(19,26,33);

       double re = compute(1,15,3);
        System.out.println(re);

        //String re1 =
                fibonacci(30);
        //System.out.println(re1);
    }

    //연습
    //1. 함수이름 calc

    // 매개변수 정수형  1개일때는 반환형없음. 그냥 변수값만 출력
    //               2개일때는 두 변수의 합
    //               3개일때는 세 변수 중 최대값
    // *메소드 오버로딩 사용
    static void calc( int a ){
        System.out.println( "변수값 "+ a );
    }
    static void calc( int a, int b ){
        System.out.println( a+b );
    }
    static void calc( int a, int b, int c ){

         int Max = Math.max(a, b);
        System.out.println(Math.max(Max, c));
    }

//연습
    //메소드 이름 compute
    //반환형은 double
    //1. 매개변수1 : int type 입력값(  0  )
    //   매개변수2 : int param1
    //   매개변수3 : int param2
    //   반환값 : 사각형의 넓이를 반환함.
    //2. 매개변수1 : int type 입력값(  1  )
    //   매개변수2 : int param1
    //   매개변수3 : int param2
    //   반환값 : 삼각형의 넓이를 반환함
    //3. 매개변수1 : int type 입력값(  2  )
    //   매개변수2 : int param1
    //   반환값 : 원의 넓이
    //4. 매개변수1 : int type 입력값 (  3  )
    //   매개변수2 : int param1
    //   반환값 : 원의 둘래

    static double compute(int type, int param1, int param2){
        if ( type == 0 ){
            return param1*param2;
        }else if ( type == 1 ){
            return param1*param2/2.0;
        }else if ( type == 2 ){
           return Math.PI*param1*param1;
        }else if( type == 3 ){
            return 2*Math.PI*param1;
        }else {
            return 0;
        }
    }

    //연습
    // 정수 n을 입력 받고 정수n의 피보나치수열을 문자열로 반환하는
    // 함수를 만드시오
    // 함수 이름 : fibonacci
    // 매개변수 : int n
    // 입력값 : 5
    // 출력값 : "5*4*3*2*1"

    static void fibonacci(int n){

        for (int i=n;i>0;i--){

            System.out.print(i);

        if (i!=1){
            System.out.print("*");
        }
        }

    }








}
