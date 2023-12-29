import java.util.Scanner;
public class q58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if (a>=b){
            if (a>=c){
                max=a;
            }else {
                max=c;
            }
        } else if (a<b) {
            if (b>=c){
                max=b;
            }else {
                max=c;
            }

        }
        if (max==a){
            if (a<b+c){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        } else if (max==b) {
            if (b<a+c){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }else {
            if (c<a+b){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }


    }
}
