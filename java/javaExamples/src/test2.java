import java.util.Random;
public class test2 {
    public static void main(String[] args) {
        Random ra = new Random();

        int b = 0;
        int c = 0;

        for (;;){
            int a = ra.nextInt(2)+1;
            if (a==1){
                System.out.println("스트라이크");
                b++;
            }else {
                System.out.println("볼");
            c++;
            }
            if (b==3){
                System.out.println("삼진 아웃!");
                break;
            }
            if (c==4){
                System.out.println("포볼 진루!");
                break;
            }
        }




    }
}
