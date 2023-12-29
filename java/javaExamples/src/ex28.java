import java.util.Random;
public class ex28 {
    public static void main(String[] args) {

        //런타임 디버거 사용
        //1.브레이크 포인트(중단점)를 걸어서 확인
        //2.문장(Step)별로 현재 값을 알 수 있음
        //3.프로그램 분기점을 알 수있음










        //     초기화 조건 증감
    /*    for (int i=0;i<10;i++){
            System.out.println( i );

        }
        //중첩반복문
        //
        //
        // for(){
        //       for( ){}
        // }

        for (int i=0;i<10; i++ ){
            for (int j=0; j<10; j++){
                System.out.println( i + "*" + j + "=" + (i*j) );
            }
        } //i:0일때 j: 01234*/
          // i:1일때 j: 01234
          //i:2일때 j: 01234
          //i:3일때 j: 01234
          //i:4일때 j: 01234


        Random ra = new Random();

        //연습
        //1. 랜덤정수값 2~9사이의 한 값을 발생
        // 그 정수에 해당하는 구구단을 출력
       /*
        int i = ra.nextInt(8)+2;
        System.out.println("구구단" + i);
        for (int j=1;j<10;j++){
            System.out.println(i + " * " + j +" = " + i*j);
        }*/
        //2. 랜덤값으로 2~8사이의 값을 발생시키고
        // 다시 랜덤값으로 3~9사이의 값을 발생시키되
        // 두번째 랜덤값은 첫번째 랜덤값보다 커야 합니다.
        // 첫번째 값을 첫번째 단수로, 두번째 값을 두번째 단수로
        // 설정하여 구구단을 출력하시오

        int a = ra.nextInt(7)+2;
        int b = 0;
        for ( int i=1;i<100000;i++){
            b = ra.nextInt(7)+3;

            if (b>a){
                break;
            }

        }

        System.out.println( "첫째 단수 : " + a + "둘째 단수 : " + b);
        for (int i=a;i<=b;i++) {

            for (int j=1;j<10;j++){
                System.out.println(i + " * " + j + " = " + j * i);
            }
                }






















    }
}
