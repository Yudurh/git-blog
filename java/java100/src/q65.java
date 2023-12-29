import java.util.Scanner;
public class q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            if (i%10==3||i%10==6||i%10==9){
                System.out.print("X ");
            }else {
                System.out.print( i + " ");
            }




        }





    }




}
