import java.util.Scanner;
public class q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        if (b>=30){
            System.out.println( a + ":" + (b-30));
        } else if (b==0){
            System.out.println((a-1) + ":" + 30);
        }else {
            System.out.println( (a-1) + ":" + (b+30));
        }


        if (a<=0){
            a = a+12;
        }




    }
}
