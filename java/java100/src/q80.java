import java.util.Scanner;
public class q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "qhyhu wuxvw euxwxv";
        for (int i=0; i<a.length();i++){
        char b = a.charAt(i);

        if (b>='d' && b<='z'){
            System.out.print( (char)(b-3) );

        } else if (b>='a'&&b<='c') {
            System.out.println( (char)(b+23) );
        }else {
            System.out.println(b);
        }

        }




    }
}
