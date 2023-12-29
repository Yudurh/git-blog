import java.util.Arrays;
import java.util.Scanner;
public class q74 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=1;i<=n;i++){
            if (n%i==0){
                a[i-1]+=i;
            }else {
                continue;
            }
            System.out.println(a[i-1]);
        }Arrays.sort(a);
        System.out.println(a[n-1]);




    }
}
