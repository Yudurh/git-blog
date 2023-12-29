public class ex57 {
    public static void main(String[] args) {
        //싱글톤
        //싱글톤(Singleton) : 프로그램 안에 있는 유일한 객체
        //클래스는 new를 통해서 여러 객체를 반복적으로 찍어낼 수 있다.
        //하지만, 중요한 데이타를 유지/저장할 때는
        //붕어빵1,붕어빵2,붕어빵3 여러개 있다면 어디에 데이타를 저장할지
        //헷갈린다.




    FishPang obj1 = new FishPang();
        FishPang obj2 = new FishPang();
        FishPang obj3 = new FishPang();
        System.out.println( obj1 );
        System.out.println( obj2 );
        System.out.println( obj3 );

        UniqueFishPang objUnique1 = UniqueFishPang.getInstance();
        UniqueFishPang objUnique2 = UniqueFishPang.getInstance();
        UniqueFishPang objUnique3 = UniqueFishPang.getInstance();
        System.out.println( objUnique1 );
        System.out.println( objUnique2 );
        System.out.println( objUnique3 );
        //한줄복사 : 컨트롤 디
        //한줄이동 : 알트 쉬프트 방향키

    }

}


//붕어빵
class FishPang {
    int price = 1000;

}
//유일무이한 붕어빵
class UniqueFishPang{
    int price = 1000000;
    private static UniqueFishPang singleton = new UniqueFishPang();
    static UniqueFishPang getInstance(){
        return singleton;
    }
}