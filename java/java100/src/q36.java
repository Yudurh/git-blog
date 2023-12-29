import java.util.Random;
public class q36 {
    public static void main(String[] args) {
        Random ra =new Random();

        int a = ra.nextInt(5)+1;
        int b = ra.nextInt(5)+1;

        System.out.println( a + " " + b);
        for (int i=1; i<=a; i++){
            for ( int j=1; j<=b; j++){

                System.out.println( i + " " + j);
            }

        }






    }
}
