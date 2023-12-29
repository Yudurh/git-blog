import java.util.Scanner;
import java.util.Random;
public class q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int[]a = new int[10];
        for (int i=0;i<10;i++){
            a[i] = ra.nextInt(100);
            System.out.println(a[i]);
        }
        try {

            Thread.sleep(5000); //3초

        }catch(Exception e) { }

        for (int i=0;i<50;i++){
            System.out.println("  ");
        }
        int b= sc.nextInt();
        if (b==a[3]){
            System.out.println("정답");
        }



    }
}
