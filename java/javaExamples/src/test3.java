import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();


        for (int i=0;i<a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=a-1;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
