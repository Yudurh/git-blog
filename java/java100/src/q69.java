import java.util.Scanner;
public class q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int c = 0;
        for (int i=1;i<n;i++){
           c = b*i;
        }
        System.out.println(a+c);






    }
}
