public class ex61 {
    public static void main(String[] args) {
        //클래스에서 중요한 개념들
        //1. 상속 : 중복제거, 계층화/모듈화
        //2. 다형성
        //3. 추상화 클래스
        //4. 인터페이스


        //생성자 함수 : Constructor
        //          : 객체 생성시 자동으로 호출되는 함수
        //          : 값을 초기화할 때 사용
        Book objBook = new Book();
        System.out.println( objBook.price );

    }
}
class Book {
    int price = 1000;
    void read(){
        System.out.println("책을 읽는다");
    }
    //생성자함수
    //형식: public 반환형없음 함수이름=클래스이름과 동일
    public  Book(){
        System.out.println("생성자함수 자동호출됨");
    //초기화
        this.price = 2000;

    }

}