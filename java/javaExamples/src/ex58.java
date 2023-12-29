public class ex58 {
    public static void main(String[] args) {
        // 클래스의 상속
        // 상속 : 부모의 재산을 물려받는 것
        // 클래스의 상속 : 부모클래스의 변수와 함수를 물려받는 것
        //사용하는 이유 : 1.코드중복을 제거할수있다
        //              2. 계층적인 구조로 코드작성을 할수있다.
        //예) 고양이 : 고유의 특성 + 일반적인 동물의 특성
        //   강아지 : 고유의 특성 + 일반적인 동물의 특성
        Cat objCat = new Cat();
        System.out.println(objCat.age);
        objCat.eat();
        objCat.grooming();

        Dog objDog = new Dog();
        System.out.println(objDog.age);
        objDog.eat();
        objDog.bark();

    }
}
class Animal {//동물 특
    //속성
    int age = 10;
    //행동
    void eat(){
        System.out.println("먹는다");
    }
}
class Cat extends Animal { //고양이 특
    //속성

    //행동
    void grooming(){
        System.out.println("손질한다");
    }

}
class Dog extends Animal{//개 특
    //속성
    //행동
    void bark(){
        System.out.println("짖는다");
    }
}