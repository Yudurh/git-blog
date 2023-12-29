import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("성적 입력");
        //연습
        //1. Scanner을 이용하여 1~100까지의 정수 1개를 입력 받고
        //  입력받은 정수가 70이상이면 "70점 이상입니다."
        //  70미만이면 "70점 미만 입니다"라고 출력

        //2. 이세종 초등학교 선생님이 홍길동 학생의 수학점수를 채점하고자
        //한다. Scanner을 이용 0~100까지 점수를 입력받고
        // 90점 이상이면 "90점 이상입니다"
        // 80점 이상이면 "80점 이상입니다"
        // 70점 이상이면 "70점 이상입니다"
        // 70점 미만이면 "70점 미만입니다"

        int i = sc.nextInt();
        if (i >= 70) {
            System.out.println("70점 이상입니다.");
        } else {
            System.out.println("70점 미만 입니다");
        }

        System.out.println("성적 입력");
        int a = sc.nextInt();
        if (a >= 90) {
            System.out.println("90점 이상입니다");
        } else if (a >= 80) {
            System.out.println("80점 이상입니다");

        } else if (a >= 70) {
            System.out.println("70점 이상입니다");

        } else {
            System.out.println("70점 미만입니다");


        }
    }
}
