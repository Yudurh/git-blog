import java.util.Scanner;
public class q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i=0;i<3;i++){
            if (i==0){
                if (a<=170){
                    System.out.println("PASS");
                }else {
                    System.out.println("CRASH");
                }
            }
            if (i==1){
                if (b<=170){
                    System.out.println("PASS");
                }else {
                    System.out.println("CRASH");
                }

            }
            if (i==2){
                if (c<=170){
                    System.out.println("PASS");
                }else {
                    System.out.println("CRASH");
                }
            }

        }




    }
}
