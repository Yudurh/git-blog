import java.util.Scanner;
public class q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        for (int i=0;i<a.length();i++){

            char b = a.charAt(i);
            if (b>='a' && b<='z'){
                System.out.println((char)(b-32));
            } else if (b>='A' && b<='Z') {
                System.out.println((char)(b+32));
            }else {
                System.out.println(b);
            }


        }





    }
}
