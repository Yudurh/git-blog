import java.util.Scanner;
public class q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(a);
        if (b/10<1){
            System.out.print("0"+b);
        }else {
            System.out.print(b);
        }
        if (c/100<1){
            System.out.print( "0" + c );
        } else if (c/10<1) {
            System.out.print("0"+"0"+c);
        }


    }
}
