import java.util.Objects;
import java.util.Scanner;
public class q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();


        if (b.equals("+")){
            System.out.print(a + b + c);
            System.out.println("=" + (a+c));
        } else if (b.equals("-")) {
            System.out.print(a + b + c);
            System.out.println("=" + (a-c));
        }else if (b.equals("*")) {
            System.out.print(a + b + c);
            System.out.println("=" + (a*c));
        }else if (b.equals("/")) {
            System.out.print(a + b + c);
            System.out.println("=" + (a/c));
        }


    }
}
