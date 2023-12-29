import java.util.Scanner;
public class q91 {




    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = scan.nextInt();
        }
        //nxn으로 출력
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print(nums[j]+" ");
            }
            for(int k=0; k<i; k++) {
                System.out.print(nums[k]+" ");
            }
            System.out.println();
        }

    }
}
