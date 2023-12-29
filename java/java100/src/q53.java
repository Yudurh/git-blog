import java.util.Scanner;
public class q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double[] c = {(a+b), (b+a),
                (a-b), (b-a), (a*b), (b*a),
                (a/b), (b/a),
                (Math.pow(a,b)),(Math.pow(b,a))
        };
        double max = Integer.MIN_VALUE;
        for (int i=0;i<10;i++){

            if (c[i]>max){
                max = c[i];
            }

        }
        System.out.println(max);





    }
}
