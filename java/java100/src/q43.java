import java.util.Scanner;
public class q43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("입력");
        long a = sc.nextInt();
        long[] b = new long[5];
        b[0] = a/10000;
        b[1] = (a/1000)%10;
        b[2] = (a/100)%10;
        b[3] = (a/10)%10;
        b[4] = a&10;


        for (int i=0;i<5;i++){

            if (b[i]==1){
                System.out.print("일");
            } else if (b[i]==2) {
                System.out.print("이");
            }else if(b[i]==3){
                System.out.print("삼");
            } else if (b[i]==4) {
                System.out.print("사");
            }else if (b[i]==5){
                System.out.print("오");
            } else if (b[i]==6) {
                System.out.print("육");
            } else if (b[i]==7) {
                System.out.print("칠");
            } else if (b[i]==8) {
                System.out.print("팔");
            } else if (b[i]==9) {
                System.out.print("구");
            }
            if (i==0 && b[0]>=1 ){
                System.out.print("만");
            } if (i==1 && b[1]>=1 ) {
                System.out.print("천");
            } if (i==2 && b[2]>=1 ) {
                System.out.print("백");
            } if (i==3 && b[3]>=1 ) {
                System.out.print("십");
            }


        }









    }
}
