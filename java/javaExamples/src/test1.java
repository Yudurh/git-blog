import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 100사이의 정수 입력");
        int a = sc.nextInt();


        if (a%2==0){
            System.out.println("2의 배수");
        }
        if (a%3==0){
            System.out.println("3의 배수");
        }
        if (a%5==0){
            System.out.println("5의 배수");
        }


    }
}
