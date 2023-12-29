class Mart{
    int Cola = 10;
    int Cider = 7;
    int Whanta = 5;
    void saleCola(){
        Cola--;
        if (Cola==0){
            System.out.println("재고가 없습니다");
        }
        if (Cola<0){
            Cola++;
        }
    }
    void saleCider(){
        Cider--;
        if (Cider==0){
            System.out.println("재고가 없습니다");
        }
        if (Cider<0){
            Cider++;
        }
    }
    void saleWhanta(){
        Whanta--;
        if (Whanta==0){
            System.out.println("재고가 없습니다");
        }
        if (Whanta<0){
            Whanta++;
        }
    }
}
class Farm{
    int carrot = 0;
    void plant(){
        carrot++;
        System.out.println( "당근을 1개 생산했습니다" );
    }

}
class Cafe{
    int menuCount = 10;
    void sale(){
        System.out.println("커피를 판다");
    }


}



public class ex54 {
    public static void main(String[] args) {

        Mart ma = new Mart();
        ma.saleCola();
        ma.saleCola();
        ma.saleWhanta();
        ma.saleWhanta();
        ma.saleWhanta();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        ma.saleCider();
        System.out.println("콜라는" + ma.Cola);
        System.out.println("사이다는" + ma.Cider);
        System.out.println("환타는" + ma.Whanta);
        Farm fa = new Farm();
        fa.plant();
        fa.plant();
        fa.plant();
        fa.plant();
        fa.plant();

        System.out.println(fa.carrot);


        Cafe cf = new Cafe();
        System.out.println(cf.menuCount);
        cf.sale();

    }
}



//연습
// 카페를 클래스로 설계해보자
// 클래스이름: Cafe
// 속성 : 메뉴의 갯수 menuCount 는 10개
// 행동 : 판다 sale 입력값은 없고 반환값은 없음
//       내부에서 "커피를 판다"라고 출력만 하면됨
// 객체를 생성해서 속성값을 출력하고
// 행동 sale을 호출해보자

// 당근농장을 클래스로 설계해보자
// 클래스이름 : Farm
// 속성 : carrot 당근의 갯수 초기값은 0
// 행동 : plant() 호출시마다 당근을 하나씩 생산하고
//       속성 carrot++를 해준다
//       호출시 "당근을 1개 생산했습니다."출력
//당근을 plant()함수를 이용하여 5개 생산한 후 당근 갯수를
//출력

// 편의점을 클래스로 설계해보자
// 클래스이름 : Mart
// 이 편의점은 총 3개의 물건을 판매하고 있다.
// 콜라는 재고가 10개
// 사이다는 재고가 7개
// 환타는 재고가 5개이다.
// 편의점의 행동은 saleCola() 호출시 콜라재고가 -1된다
//              saleCider() ''    사이다   ''
//              saleWhanta() ''    환타   ''
// 홍길동이 콜라 2번사고 환타는 3번사고 사이다는 10번산다
// 재고가 없을시"재고가 없습니다" 출력
// 홍길동이 다녀간 후에
// 콜라,사이다,환타의 재고를 출력하시오