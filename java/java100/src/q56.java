import java.util.Scanner;
public class q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a+b+c+d==1){
            System.out.println("도");
        }else if (a+b+c+d==2){
            System.out.println("개");
        }else if (a+b+c+d==3){
            System.out.println("걸");
        }else if (a+b+c+d==4){
            System.out.println("윷");
        }else {
            System.out.println("모");
        }






    }
}
