public class ex12 {
    public static void main(String[] args) {
        //연산자
        //연산자 우선순위
        int i = 3 * 2 + 10 / 5;
        System.out.println( i );
        //소괄호를 통해서 연산자 우선순위를 지정할 수 있다.
        int j = (3 * 2) + (10 / 5);
        System.out.println( j );

        //단항 연산자 (타입변경,++,--)            - 높음
        //이항   ''  (산술,비교,논리)
        //삼항   ''  (?연산자)
        //대입   ''  (=)                       - 낮음


        //연산의 방향
        //1. 오른쪽 -> 왼쪽 : 단항연산자, 대입연산자
        //                   형변화연산자,++,-- =
        double num = (double)((int)3.14);
        //2. 왼쪽 -> 오른쪽 : 이항연산자(산비논대),삼항연산자

        //이항 : 산비논대
        //단항 : ++ -- ! (타입)
        //산술 : + - * / %
        //비교 : == != < > <= >=
        //논리 : && ||
        //삼항 : ?:
        //대입 : = += -= *= /=

        //단항연산자 ++ -- !
        // ++ 연산자 : 자신에게 1을 추가하는 연산자
        int k = 10;
        k++;//k = k+1
        System.out.println( k );
        // -- 연산자 : 자신에게 1을 감소하는 연산자
        k--;//k = k-1
        System.out.println( k );


        // 논리 반전 연산자 !
        // true -> false, false -> true
        boolean myBool = true;
        System.out.println( !myBool );
        System.out.println( !!myBool );

        //연습
        //1. 정수형 변수 num1을 선언하고 10을 초기화 한 다음
        //  ++연산자만을 사용하여 12로 만들어 출력
        //2. num1을 -- 연산자만을 이용하여 8로 만들고 출력 하시오

        int num1 = 10;
        num1++;
        num1++;
        System.out.println( num1 );
        num1--;num1--;num1--;
        System.out.println( --num1 );









    }
}
