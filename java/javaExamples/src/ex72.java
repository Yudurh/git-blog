public class ex72 {
    public static void main(String[] args) {
        //인터페이스 interface
        // : 가상함수만 있는 클래스

        //               추상화클래스     인터페이스
        //1.  다중상속         x            o
        //2.  일반함수         o            x
        //3.               class       interface
        //4.              extends      implements
        //공통점
        //1. 둘다 가상함수를 사용한다

    }
}
interface Drawing {
    //일반함수 사용불가
    abstract void draw();
    void sktch(); //abstract 예약어 생략가능
}
interface  Sketch{
    void paint();
}
//다중상속이 가능함
class  Painter implements Drawing,Sketch {
    @Override
    public void draw() {
        System.out.println("드로잉");
    }

    @Override
    public void sktch() {

        System.out.println("스케치");
    }

    @Override
    public void paint() {
        System.out.println("페인트");
    }
}