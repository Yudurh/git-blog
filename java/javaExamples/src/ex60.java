public class ex60 {
    public static void main(String[] args) {

        //메소드 오버라이딩
        //Overriding(올라탄다)
        //면접필수질문
        // 1. 메소드 오버로딩과 오버라이딩 차이점
        // 오버로딩: 매개변수를 다르게 함으로 함수이름을 재정의 없이
        //          함수기능을 확장
        // 오버라이딩: 상속관계에서 부모클래스의 메소드를 재정의하는것

        CoffeMachine obj = new CoffeMachine();
        obj.work();


    }
}
class Machine{
    String name = "일반기계";
    public void work(){
        System.out.println("기계가 일한다");
    }
}

class CoffeMachine extends Machine{
  String name = "커피기계";
  //어노테이션: 컴파일 지시어
  //컴파일러에게 이함수는 오버라이딩 된 함수임을 알려준다
  @Override
  public void work(){
      System.out.println("커피기계가 일한다");
  }
}