import java.util.Scanner;
public class q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (;;) {
            if (a <= 170) {
                System.out.println("CRUSH" + a);
                break;

            } else {
                System.out.println("PASS");
            }
            if (b <= 170){
                System.out.println("CRUSH" + b);
                break;
            }else {
                System.out.println("PASS");
            }
            if (c <= 170){
                System.out.println("CRUSH" + c);
                break;
            }else {
                System.out.println("PASS");
            }


        }
    }
}
