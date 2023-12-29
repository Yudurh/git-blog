public class ex67 {
    public static void main(String[] args) {

        // Man man = new Man();
        //다형성: 부모클래스 타입 또는 자신의 클래스 타입을 가질 수 있다.
        // People people = new Man();
        //업캐스팅 : 부모클래스타입으로 변경하는 것
        // +------+---------+
        // ㅣ    +--------+ ㅣ
        // ㅣman ㅣpeople ㅣ ㅣ
        // ㅣ    +--------+ ㅣ
        // +----------------+
        //다운캐스팅 : 부모객체를 자식클래스타입으로 변경하는 것
        //People people = new Man();
        //people.think();
        //people.soccer();//접근불가

        //다운캐스팅 : 부모객체를 자식클래스 타입으로 변경하는 것
        // ((Man)people).soccer();
        //USB C타입에 호환되는 기기를 출시
        //A기계, B기계, C기계 새로운 제품 출시

        //다형성을 사용하는 이유
        //1. 타입의 유연성을 가질 수 있다.
        //2. 객체를 함수로 전달할 때 유용하다.

        // myFunc3( new People() );
        // myFunc3( new Man() );
        // myFunc3( new Woman() );


    }

    static void myFunc1(Man obj) {

    }

    static void myFunc2(Woman obj) {
    }

    static void myFunc3(People obj) {
        //instanceof : 객체 타입을 확인하는 연산자
        if (obj instanceof People) {
            System.out.println("People객체임");
        }
        if (obj instanceof Man) {
            System.out.println("Man객체임");
        }
        if (obj instanceof Woman) {
            System.out.println("Woman객체임");
        }

    }

    //다형성 (Polymophism:폴리모피즘)
//  : 자식클래스의 객체가 여러가지 타입을 가질 수 있다
//  : 자신의 클래스타입 + 부모의 클래스타입을 동시에 가질수있음
// 예) B extend A
//     그러면 B객체의 클래스타입은 B
//     그런데 A의 클래스타입도 가질 수 있다
// 사용하는 이유: 하나의 객체타입으로 여러 클래스 타입을 가질 수 있다
//            : 유연한 프로그래밍 가능하게함
    class People {//사람

        void think() {
            System.out.println("생각한다");
        }
    }

    class Man extends People {
        void soccer() {
            System.out.println("축구한다");
        }
    }

    class Woman extends People {
        void makeup() {
            System.out.println("화장한다");
        }
    }
}
