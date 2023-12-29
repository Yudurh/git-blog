public class ex69 {
    public static void main(String[] args) {
        //추상화클래스 vs 인터페이스
        //abstract class    interface
        //추상화 클래스 : 일반함수 + 가상함수
        //인터페이스 : 가상함수만 있음
        //가상함수란? 선언만 있고 코드본체는 없는 함수

        //가상함수(추상화메소드)를 사용하는 이유
        //1. 설계와 구현의 관점에서 생각한다
        //  예)설계사무소 - 설계도
        //      시공사 - 설꼐도대로 시공한다.
        //2. 설계자 - 기능 정의
        //   구현자 - 실제 구현 코드 작성
        //3. 표준 형식을 만들고, 이 형식에 맞는 실제코드는 따로 작성
        //   해서 새로운 코드 추가를 용이하게 함
        //  예)USB C타입 호환하는 기기는 다 사용한다
        Picasso picasso = new Picasso();
        picasso.draw();


    }
}
abstract class Picture{
    //일반함수
    void sale(){
        System.out.println("그림을 판다");
    }
    //가상함수
    abstract void draw();
}
class Picasso extends Picture {
    @Override
    void draw() {
        System.out.println("피카소가 그림을 그린다");
    }
}