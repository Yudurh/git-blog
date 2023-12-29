import java.util.Scanner;
public class q48 {
    public static void main(String[] args) {

        System.out.println("생년월일과 주민번호 뒷자리 첫번호를 입력");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b==1||b==2){
            System.out.println(2023-(1900+a/10000));
        }else {
            System.out.println(2023-a/10000);
        }



    }
}
