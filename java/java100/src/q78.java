import java.util.Scanner;
public class q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        char b;
        int c;
            a = sc.nextInt();
        int result = a;
        for (;;) {
            String input = sc.next();
            b = input.charAt(0);

            if (b == '='){
                System.out.println(result);
                break;
            }
            c = sc.nextInt();




            if (b=='+'){
                result = result + c;
            } else if (b=='-') {
                result = result - c;
            } else if (b=='*') {
                result = result * c;
            } else if (b=='/') {
                result = result/c;
            }

        }

    }
}
