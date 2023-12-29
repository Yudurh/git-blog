import java.util.Scanner;
public class q54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        if (b%a==0){
            System.out.print( a + " * " );
            System.out.print( b/a + " = " );
            System.out.print( a*(b/a) );
        }else if (a%b==0){
            System.out.print( b + " * " );
            System.out.print( a/b + " = " );
            System.out.print( b*(a/b) );
        } else {
            System.out.println("none");
        }








    }







    }

