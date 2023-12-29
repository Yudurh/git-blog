public class ex30 {
    public static void main(String[] args) {

        //연습 - 2중 for문
        // 1부터 100사이의 소수를 찾아서 출력하시오


        int a = 10;



        for (int i=2;i<100;i++){
            int b = 0;



            for (int j=1;j<=i;j++){
                if (i%j==0){
                    b++;
                }

            } if (b==2){
                System.out.println("   수소:"+i);

            }



        }







    }
}
