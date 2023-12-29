public class ex03 {

    public static void main(String[] args) {
        //형식화된 출력문 printf
        // f : formatted
        //심볼과 대이타를 연결해서 출력한다
        //심볼의 종류
        //%d : decimal 10진수 정수의 약자 십진수로 표현해줘
        System.out.printf("%d\n", 10);
        // \n : 줄바꿈 특수문자
        System.out.printf("%o\n", 10);
        System.out.printf("%x\n", 10);
        //%o : octal 8진수 정수
        //%x : hexa 16진수 정수
        //%e : 지수형 실수로 출력 (예를 들면 10의 3승은 10^3)
        System.out.printf("%e\n", 1234567f);
        // 숫자뒤에 f : float 실수형이라고 알려줌
        // e+06 의미 : 뒤로 6자리 이동하면 정확한 값이 나온다. 실수단위면 수가 커서 근사치로 결과가 나옴
        System.out.printf("%d\n", 123);
        System.out.printf("%o\n",123);
        System.out.printf("%x\n",123);
        System.out.printf("%e\n", 3525125f);

        //연습문제 - 디스코드 dm으로 출력결과 보내기
        //1. 123을 %d 10진 정수로 출력하시오
        //2. 123을 %o 8진 정수로 출력
        //3. 123을 %x 16진 정수로 출력
        //4. 3525125f을 %e 지수형으로로 출력


        //%s : string 문자열 출력
        System.out.printf("%s\n", "ABC");
        //%[자릿수][타입] : 자릿수 출력
        System.out.printf("%05d\n", 10);
        System.out.printf("%5d\n", 100);
        System.out.printf("%5d\n", 1000);

        //실수형 출력 %f float
        System.out.printf("%f\n", 3.14f);
        //소수점 자릿수 표현 : %.[소수점뒤 자릿수]f
        System.out.printf("%.3f\n",3.14f);

        //연습문제
        //다음과 같이 출력하시오
        //1. "cooding is good"
        //2. "java"문자열과 "programming"문자열을 연결하여 출력하시오.
        //3. 123을 5자리로 출력하되 앞자리를 0으로 채우시오
        //4. 실수형 123.456을 소수점 2째 자리까지만 출력하시오

        System.out.println("Coding is good");
        System.out.println("Java"+"programming");
        System.out.printf("%05d\n", 123);
        System.out.printf("%.2f\n",123.456f);
        //escape 문자(특수문자)
        // \"쌍따옴표
        // \'단따옴표
        // \n 줄바꿈
        // \t 탭문자
        // \\ 역슬래시 문자

}

}
