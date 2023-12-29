public class ex06 {
    public static void main(String[] args) {
        //형변환 (타입캐스팅)
        //정수형 변수 4개 (byte 1 short 2 int 4 long 8)

        //byte byteNum1 = 10;
        //int intNum1 = byteNum1;
        //System.out.println( intNum1 );


        //int intNum2 = 1000;
        //byte byteNum2 = (byte)intNum2;
        //System.out.println( byteNum2 );

        //형변화 공식
        //1. 작은거에서 큰거는 문제 없음
        //2. 큰거에서 작은거는 표현범위 벗어나면 값짤림
        //3. 정수형 에서 실수형 문제없음 3>3.0
        //4. 실수형 에서 정수형 강제형변환 값짤림 소수점 날라감

        //int double 형변환
        //int intNum3 = 10;
       // double doubleNum1 = intNum3;
        //System.out.println( doubleNum1 );


        //double doubleNum2 = 3.14d;
        //int intNum4 = (int)doubleNum2;
        //System.out.println( intNum4 );

        //자동 형변환 : 연산후에 자동 형변환 됨
        //강제 형변환 : 형변환연산자를 통해서 형변환 됨

        //자동형변환 예
        //1. 작은타입에서 큰타입으로 대입연산 될 때
        //2. 다른크기의 타입과 산술연산(사칙연산) 될 때
        //   int * int = ?
        //   int * long = ?
        //   short * int = ?
        //   float * int = ?
        //   double * float = ?
        // 값의 표현이 높은 쪽으로 표현됨

        //강제 형변환의 예
        // 형변환 연산자 이용
        // 작은크기타입 = (작은크기타입) 큰크기타입
        // short = (short)int
        // int = (int)float

        //연습문제
        //1. short형 변수 num1을 선언하고 10 값으로 초기화 한다.
        //  int형 변수 num2을 선언하고 20값으로 초기화 한다.
        // num1을 float형 변수 num3에 대입 자동형변환 시키고 결과값 출력
        //2. num2 를 num1에 대입해서 강제형변환 시키고 값 출력
        //3. num3과 num2 를 곱하기 연산한 후 자동형변환 된 값을 출력

        short num1 = 10;
        int num2 = 20;
        float num3 = num1;
        System.out.println( num3 );

        num1 = (short)num2;
        System.out.println( num1 );

        System.out.println(num3*num2);















    }
}
