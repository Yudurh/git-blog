import java.util.Scanner;
public class q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;

        for (int i=0;i<=a;i++){
            b += i;
            if (b>=a){
                break;
            }
            System.out.print(i+"+");
        }
        System.out.println();
        System.out.println(b);




    }
}
