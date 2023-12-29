// import : 외부 함수나 클래스를 가져오는것 기능을 확장
import java.util.Scanner;


public class ex09 {
    public static void main(String[] args) {
        //콘솔 입출력창
        //콘솔창을 이용하여 문자열을 키보드 입력해주자
        //Scanner 클래스를 이용
        //클래스 객체 생성해야함
        //클래스이름 객체이름 = new 클래스이름(매개변수);
        //new : 예약어, 객체를 생성하는 기능
        Scanner scan = new Scanner(System.in);

        System.out.println( "문자열을 입력하세요");
        String strInput = scan.nextLine();
        System.out.println( "입력된 값:" + strInput);

        scan.close(); //Scanner에 할당된 자원(메모리)를 해제함









    }
}
