package MariaDB;
import java.util.*;
import java.util.UUID;
import  java.util.List;
public class cartMain {
    public static void main(String[] args) {
        cartDAO dao = new cartDAO();
        cartVO vo = new cartVO();
        Scanner sc = new Scanner(System.in);
        for (;;){

            System.out.println("1.상품목록 2.장바구니 담기 3.장바구니 목록 4.장바구니 수정 5.장바구니 삭제 6.종료 : " );
            int a = sc.nextInt();

            if (a==1){
                List<cartVO>list = dao.selectList();
                System.out.println("됨");
                for (int i=0; i< list.size();i++){
                    cartVO hvo2 = list.get(i);
                    System.out.println("상품 이름 "+ (i+1) +" : "+hvo2.getItem_name());
                    System.out.println("상품 가격 "+ (i+1) +" : "+hvo2.getCart_item_price());

                }
                System.out.println();
            }
            if (a==2){
                System.out.println("상품 입력");
                System.out.println("상품 이름 : ");
                String name = sc.next();

                vo.setItem_name(name);


                int result = dao.update(vo);

                if (result>0){
                    System.out.println("추가 완료");

                    }

            }
            if (a==3){

                List<cartVO>list = dao.selectList();
                System.out.println("됨");
                for (int i=0; i< list.size();i++){
                    cartVO hvo = list.get(i);
                    System.out.println("상품 이름 "+ (i+1) +" : "+hvo.getItem_name());
                    System.out.println("총 가격 "+ (i+1) +" : "+ hvo.getCart_item_amount() * hvo.getCart_item_price());
                    System.out.println("상품 갯수 " + hvo.getCart_item_amount());
                }
                System.out.println();



            }
            if (a==4){

                System.out.println("수정할 상품 입력");
                System.out.println("상품 이름 : ");
                String name = sc.next();
                System.out.println("수정할 갯수");
                int count = sc.nextInt();
                vo.setItem_name(name);

                vo.setCart_item_amount(count);


                int result = dao.update2(vo);
                System.out.println("수정성공");

            }
            if (a==5){
                System.out.println("삭제할 상품명");
                String a1 = sc.next();
                int result2 = dao.delete(a1);
                if (result2>0){
                    System.out.println("삭제성공");
                }


            }
            if (a==6){
                break;
            }



        }


    }
}
