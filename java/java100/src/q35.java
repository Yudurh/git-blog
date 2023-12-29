import java.util.Scanner;
public class q35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int j = sc.nextInt();
        for (int i = 1; i < j + 1; i++) {

            if (i % 2 == 0) {
                sum = sum + i;

            }

        }
        System.out.println( "짝수의 합은" + sum);
    }
}