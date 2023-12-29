import java.util.Scanner;
public class q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++){

            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){

                System.out.print("*");
            }
            for (int l=1;l<=i;l++){

                System.out.print("*");
            }
            System.out.println();
        }



    }
}
