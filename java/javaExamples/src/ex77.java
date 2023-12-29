public class ex77 {
    public static void main(String[] args) {
        // 수학적인 계산에 사용
        // Math 클래스
        // import하지 않아도 기본 사용가능 java.lang.*에 들어가 있음

        //소숫점 첫째자리 반올림 Matr.round()
        //소숫점 첫째자리 반올림 Matr.ceil()
        //소숫점 첫째자리 반올림 Matr.floor()

        //삼각함수 - 각도계산 sin, cos, tan
        //각도 단위 2가지
        //1. 일반적인 360도 분위 : 45도 기울었다
        //2. 수학적인 Radian 라디안 : 수학,컴퓨터에서 사용함
        //      1라디안 = 180도/PI(3.14) = 약 57.29도이다

        //수학적인 계산을 위해서 360도 분위를 라디안으로 라디안에서 360분위로 바꿔야함
        double degree = 45.0;
        double radian = Math.toRadians(45);
        //수학적인 계산
        //세타각과 대변 c값만 알고 있을때 b변의 길이는?
        degree = Math.toDegrees(radian);

        //절대값
        double abs = Math.abs(-3);
        System.out.println( abs );

        //피타고라스정리로 변의 길이를 구하기
        //c = 루트(a*a + b*b)
        double a1 = 10;
        double b1 = 10;
        //Math.pow(A,B)A^B
        //Math.sqrt(A) 루트(A)
        //대변 c의 길이는?

        Math.pow(a1,2);
        Math.pow(b1,2);
        double c = Math.sqrt(Math.pow(a1,2)+Math.pow(b1,2));

        System.out.println(c);

    }
}
