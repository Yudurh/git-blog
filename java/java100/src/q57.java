import java.util.Scanner;
public class q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] menu = {0,400,340,170,100,70};
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (menu[a]+menu[b]>500){
            System.out.println("angry");
        }else {
            System.out.println("no angry");
        }







    }
}
