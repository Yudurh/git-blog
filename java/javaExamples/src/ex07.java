public class ex07 {
    public static void main(String[] args) {

        //연습문제
        //1. 정수형 변수 age를 선언하고 초기값으로 20을 넣어 줍니다.
        //2. 문자열연결 연산자 + 를 이용하여
        // println문으로 "제나이는 20입니다" 문구를 출력
        // 문자열+변수+문자열을 이용하시오
        //3. double형 변수 num을 선언하고 초기값으로 3.14를 넣어준다
        // num을 int형으로 강제 형변환하고, 그값을 출력
        //4. num값에 3.56을 대입하고 반올림한 값을 출력
        //5. num값에 소수점 버리고 출력
        int age = 20;
        System.out.println( "제 나이는" + age + "입니다.");

        double num = 3.14;
        System.out.println( (int)num );

        num = (int)(3.56+0.5);
        System.out.println(num);
        num = 3.56;
        System.out.println( (int)num );








    }
}
