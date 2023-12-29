public class ex68 {
    public static void main(String[] args) {
        //다형성 : 자식클래스 객체가 여러 클래스타입을 가질 수 있는것
        // 사용이유 : 타입의 유연성을 올려줌

        //1. 업캐스팅(자식클래스 객체가 부모클래스 타입을 갖는것)
        //1) new를 통해서
        Parent parent = new Child();
        System.out.println( parent.name );
        //2) 형변환연산자를 통해서
        Child child = new Child();
        Parent parent2 = (Parent) child;

        //2. 다운캐스팅(부모클래스 타입 객체가 자식클래스 타입을 갖는 것)
        //1)형변환연산자를 통해서
        System.out.println(((Child)parent).name);

        //4가지 형식
        Parent p = new Child(); // 업캐스팅
        Child c = new Child();//일반적인 객체생성
        Parent p2 = new Parent();//일반적인 객체생성
        Parent p3 = (Parent)(new Child()); //업캐스팅
        Child c2 = (Child) p; //다운 캐스팅


    }
}
class Parent{
    String name = "Parent";
    void parentmethod(){
        System.out.println("내 이름은" + this.name);
    }
}
class Child extends Parent{
    String name = "Child";
    void childMethod(){
        System.out.println("내 이름은" + this.name);
    }
}