public class ex21 {
    public static void main(String[] args) {

        //대입 연산자 =
        // A = B : B의 값을 복사해서 A에 덮어쓰기함
        //1. B의 값 그대로 유지
        //2. A가 가지고 있던 값은 날라감

        //값초기화시 대입연산자 여러개 사용
        int i = 10, j = 20, k = 30;
        i = j = k = 40;
        System.out.println( i );
        System.out.println( j );
        System.out.println( k );

        //복합대입연산자
        // A += B : A = A + B
        // A -= B : A = A - B
        // A *= B : A = A * B
        // A /= B : A = A / B


        i = 0;
        i += 10; // i = i+10
        System.out.println( i );

        i -= 5;
        System.out.println( i );// i = 5

        i *= 2;
        System.out.println( i );

        i /= 5;
        System.out.println( i );




    }
}
