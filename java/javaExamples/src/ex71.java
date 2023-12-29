public class ex71 {
    public static void main(String[] args) {
        //추상화 클래스
        // : 일반함수 + 가상함수가 있는 클래스
        //인터페이스
        // : 가상함수만 있는 클래스
        //가상함수 : 선언만 있고 코드본체는 하위(자식)클래스에서
        //         재정의(오버라이딩)해서 구현한다
        //사용하는 이유
        //      추상화(설계,구조)         구체화(실체,구현)
        //1. 그림을 그린다.               서양화/동양화/웹툰 그린다.
        //2. 처방전에 진통제 처방          타이레놀/펜잘
        //3. 완충재 21mm 표준             스티로폼/고무재질/스펀지

    }
}
abstract class Toon {
    //가상함수
    abstract void drawToon();
}
class WebToon extends Toon{
    @Override
    void drawToon() {
        System.out.println("웹툰을 그린다");
    }
}