public class ex62 {
    public static void main(String[] args) {

        Robot obj1 = new Robot();
        System.out.println( obj1.color );
        Robot obj2 = new Robot("흰색");
        System.out.println( obj2.color );

    }
}
//생성자함수
// 1. 매개변수 없는 기본생성자 함수
// 2. 매개변수가 있는 생성자 함수
class Robot {
    String color = "빨강";
    public Robot(){
        System.out.println("기본 생성자 함수");
    }
    public Robot(String color){
        this.color = color;
        System.out.println("매개변수가 있는 생성자함수");
    }
}