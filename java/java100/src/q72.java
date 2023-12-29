import java.util.Scanner;
public class q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){

                a[i] += sc.nextInt();

                }

        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if (a[i]<a[j]){
                   max = a[j];
                }
            }

        }
        System.out.println(max);


    }
}
