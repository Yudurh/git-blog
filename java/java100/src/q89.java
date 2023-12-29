import java.util.Scanner;
public class q89 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=1;i<7;i++){

            for (int j=1;j<7;j++){

                if ( i+j==a ){
                    System.out.println( i + " " + j );
                }

            }

        }


    }
}
