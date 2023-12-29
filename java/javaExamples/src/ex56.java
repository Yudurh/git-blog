
class Desk {


    private int price = 1000;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class ex56 {
    public static void main(String[] args) {
        //연습
        // 책상(Desk)을 클래스로 설계
        //속성 : price 가격은 1000으로 초기화한다.
        //      접근권한 private으로
        //행동 : Getter.Setter 함수를 만들어보자
        //출력값 : price를 2000으로 바꾸고 가격을 출력하시오
        // Getter/Setter자동생성 : 우클릭 -> 생성 -> Getter 및 Setter
        Desk de = new Desk();
        de.setPrice(2000);
        System.out.println(de.getPrice());


    }

}
