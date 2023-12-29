import java.util.Scanner;
public class q51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println((a/10+a%10*10)*2);
        if ((a/10+a%10*10)*2<=50){
            System.out.println("GOOD");
        }else {
            System.out.println("OH MY GOD");
        }


    }
}
