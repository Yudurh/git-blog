import java.util.Scanner;
public class q88 {

    static int sum(int a){
        if (a==1){
            return 1;
        }
        return a+sum(a-1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int n = sc.nextInt();
       for (int i=1;i<=n;i++){
           a = a + sum(i);
       }
        System.out.println(sum(n));
        System.out.println(a);


    }
}
