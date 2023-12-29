public class ex93 {
    public static void main(String[] args) {

        //연습문제
        //재귀함수로 팩토리얼을 구해보자

        int n = 5;
        int result = Fack(n);
        System.out.println(result);


    }

    static int a = 0;
    public static int Fack(int n){


        if (n==1){
            return 1;
        }


        return n*Fack(n-1);

    }
}
