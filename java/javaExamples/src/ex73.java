public class ex73 {
    public static void main(String[] args) {
        //익명객체 Anonymouse Object
        //  : 일회성 메소드 재정의할 때 사용
        //  : 한번 쓰고 버릴 코드에 굳이 이름을 붙일 필요가 없다
        SuperCar superCar = new SuperCar();
        superCar.drive();

        //한번쓰고 버릴 인터페이스 구현 객체(메소드)
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("드라이브한다.");
            }
        };
        car.drive();
    }
}
interface Car {
    void drive();//가상함수
}
class SuperCar implements Car {
    @Override
    public void drive() {
        System.out.println("수퍼카를 드라이브한다.");
    }
}