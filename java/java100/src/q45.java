import java.util.Scanner;
public class q45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

    if (b*b-4*a*c==0){
        System.out.println( -b/(2.0*a) );
    }else if (b*b-4*a*c<0){
        System.out.println("실근이 없습니다");
    }else {
        System.out.println(-b + Math.sqrt(b*b-4*a*c) / (2.0*a));
        System.out.println(-b - Math.sqrt(b*b-4*a*c) / (2.0*a));
    }







    }
}
