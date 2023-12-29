public class ex59 {
    public static void main(String[] args) {

        //객체 생성해서 속성출력 행동 실행

        WoodDesk wd = new WoodDesk();
        WoodChair wc = new WoodChair();
        System.out.println(wd.color);
        wd.study();
        System.out.println(wd.price);
        wd.burn();
        System.out.println(wc.color);
        wc.sit();
        System.out.println(wc.price);
        wc.burn();



    }
}
class Wood{
    int price = 1000;
    void burn(){
        System.out.println("불탄다");
    }


}


class WoodDesk extends Wood{

    String color = "흰색";
    void study(){
        System.out.println("공부한다");
    }

}
class WoodChair extends Wood{

    String color = "갈색";
    void sit(){
        System.out.println("앉는다");
    }


}

//연습 클래스 상속
//부모클래스 - Wood
//  속성: 가격 int price = 1000
//  행동: 불탄다 burn()"불탄다"출력하면 됨

//자식클래스 - WoodDesk
//  속성: 색상 String color "흰색"
//  행동: 공부한다 study "공부한다"로 출력
//         - WoodChair
//  속성: 색상 String color "갈색"
//  행동: 앉는가 sit "앉는다"로 출력