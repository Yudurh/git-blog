import java.util.Arrays;
import java.util.Scanner;
public class q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();
        Arrays.sort(a);
        System.out.println("최솟값" + a[0] + "최댓값" + a[4] );


    }
}
