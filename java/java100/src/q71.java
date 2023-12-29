import java.util.Random;
import java.util.Scanner;
public class q71 {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++){
            int a = ra.nextInt(20);
            sum = sum + a;

            System.out.println(a);
        }
        System.out.println(sum);



    }
}
