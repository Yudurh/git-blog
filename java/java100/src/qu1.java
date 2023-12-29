import java.util.Scanner;
import java.util.Random;
public class qu1 {
    public static void main(String[] args) {

        System.out.println( "Hello" );
        System.out.println( "Hello world" );
        System.out.println('h');
        System.out.println( "C:\\Download\\hello.java");


        Scanner scan = new Scanner(System.in);

        System.out.println( "입력" );
        /*System.out.println("15를 입력");
        int n1 = scan.nextInt();
        System.out.println( n1 );

        double d1 = scan.nextDouble();
        System.out.println( d1 );

        System.out.println( "입력" );
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println( s2 + s1 );
        */

       //문제 13 풀어보기

        /*int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        System.out.print(i1);
        System.out.print( ":" );
        System.out.print(i2);*/

        /*int i1 = scan.nextInt();
        String octaString = Integer. toOctalString( i1 );
        System.out.println( octaString );*/

        //18번
       /* String c1 = scan.nextLine();
        char c2 = c1.charAt(0);
        System.out.println( (int)c2 );*/

        /*int c1 = scan.nextInt();
        System.out.println( (char)c1);*/

        /*int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println( (a>b) ? 1 : 0 );*/



        //35번

        int asd = 0;
        for (int i = 1; i<=10; i++){

            if(10%i == 0) {
                System.out.println("약수" + i);
                asd++;

            }
            System.out.println( "약수의 갯수" + asd );
        }

















    }
}
