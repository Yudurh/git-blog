import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //연습문제
        //1. Scanner클래스를 이용하여 사용자로부터 "java coding!"이라는
        // 문구를 입력받고, 입력받은 값을 그대로 출려하시오.
        //2. 사용자로부터 "대한"문자열과 "민국"문자열을 차례로 2번 입력 받고
        // "대한민국"이라고 출려하시오
        //3. scan.close()로 마무리

        Scanner scan = new Scanner(System.in);

        /*System.out.println( "문자열을 입력하세요");
        String strInput = scan.nextLine();
        System.out.println(strInput);

        System.out.println( "문자열을 입력하세요");
        String strInput1 = scan.nextLine();
        System.out.println( "문자열을 입력하세요");
        String strInput2 = scan.nextLine();
        System.out.println(strInput1+strInput2);


        //연습
        //1. Scanner를 이용하여 사용자로부터 정수 1부터 100까지의 값을 2개 입력받고
        // int inputint1 = scan.nextInt();
        //2. 이 두 정수에 대한 사칙연산의 결과를 출력



        System.out.println( "문자열을 입력하세요");
        int inputint1 = scan.nextInt();
        int inputint2 = scan.nextInt();
        System.out.println(inputint1+inputint2);
        System.out.println(inputint1-inputint2);
        System.out.println(inputint1*inputint2);
        System.out.println(inputint1/inputint2);*/

        //연습
        //1. 정수 2개를 1~100사이에서 입력받고
        //  두수의 합계와 평균을 출력
        //  합계 : A + B 평균 : ( A + B )/2
        //2. 실수 double 1개를 입력 받고
        //   소수점을 버린 정수를 출려하시오
        //   double num = scan.nextDouble();

        System.out.println( "1~100 정수 입력");
        int inputint3 = scan.nextInt();
        int inputint4 = scan.nextInt();
        System.out.println(inputint3+inputint4);
        System.out.println((double)(inputint3+inputint4)/2);
        System.out.println("실수입력");
        double num = scan.nextDouble();
        System.out.println((int)num);










        scan.close();






















    }
}
