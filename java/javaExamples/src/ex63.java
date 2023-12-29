public class ex63 {
    public static void main(String[] args) {

        VendingM vM = new VendingM();



}
//연습문제 - 매개변수가 있는 생성자함수
//클래스이름 : VendingMachine
//  속성: itemCount  0개
//  행동: popup() "상품 출고 + 재고 5개" 형식으로 출력하고
//       itemCount를 하나 뺀다.
//  생성자 함수: 매개변수를 통해 itemCount를 5개로 넣어준다.
//  출력 : 상품 출고 + 재고 4개
//         상품 출고 + 재고 3개
//         상품 출고 + 재고 2개
//         상품 출고 + 재고 1개
//         상품 출고 + 재고 0개
//         상품 재고가 없습니다!
static class VendingM{
    int itemCount = 0;
    void  popup(){
        itemCount--;
        if (itemCount>0){
            System.out.println("상품출고 " + "재고 " + itemCount + "개");
        }else {
            System.out.println("재고가없습니다");
        }
    }

public VendingM(){
        itemCount--;
}
    public VendingM(int itemCount){
        this.itemCount = itemCount;
        itemCount--;



    }
}
}