import java.util.Scanner;
public class q94 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = 0;
        int c = 0;

        for (int i=0;i<a.length();i++){
            if (a.charAt(i)=='('){
                b++;
            } else if (a.charAt(i)==')') {
                c++;
            }
        }

        System.out.println(b+" , "+c);



    }
}
