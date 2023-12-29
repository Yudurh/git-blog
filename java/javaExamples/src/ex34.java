public class ex34 {
    public static void main(String[] args) {
        //반복문의 제어 break continue
        //break - 반복문 종료
        //continue - 현재 회차에서 증감문으로 이동

       /* for (int i=0; i<10; i++){
            System.out.println(i);
            if (i>5){
                break;
            }

        }*/
        //연습
        //1부터 10까지 출력하되
        //2의 배수이면 출력
        //i가 8이상이면 출력하지 않고 반복문을 중단

        for (int i=1;i<11;i++){
            if (i>7){
                break;
            }
            if (i%2==0){
                System.out.println(i);
            }

        }
        //cointinue문
        for (int i=0; i<10;i++){//0~9 중에서 홀수만 출력
            if (i%2==0){
                continue;
            }
            System.out.println(i);

        }

        //연습
        //1부터 100까지 홀수의 합만 출력하되
        //끝자리가 3일때는 건너뛰기

        int sum = 0;
        for (int i=1;i<=100;i++){
            if (i%10==3){
                continue;
            }
            if (i%2==1){
                sum=sum+i;
            }
        }System.out.println(sum);





    }
}
