import java.util.Scanner;
public class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a/Math.pow((b/100.0),2.0)<18.5){
            System.out.println("저체중");
        } else if (a/Math.pow((b/100.0),2.0)<=23) {
            System.out.println("정상체중");
        } else {
            System.out.println("과체중");
        }


    }
}
