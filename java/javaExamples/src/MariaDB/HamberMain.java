package MariaDB;
import java.util.*;
import java.util.UUID;
import  java.util.List;

public class HamberMain {
    public static void main(String[] args) {

        HamberDAO dao = new HamberDAO();
        HamberVO vo = new HamberVO();
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("1.상품입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 ");
            int a = sc.nextInt();
            if (a==1){
                System.out.println("상품 입력");
                System.out.println("상품 이름 : ");
                String name = sc.next();
                System.out.println("상품 가격 : ");
                int price = sc.nextInt();
                System.out.println("이미지 이름 : ");
                String img = sc.next();
                System.out.println("옵션 종류 : ");
                String opt = sc.next();

            vo.setUuid(UUID.randomUUID().toString());
            vo.setItem_option(opt);
            vo.setitem_price(price);
            vo.setitem_name(name);
            vo.setitem_image_url(img);
        int result = dao.insert(vo);
        if ( result > 0 ){
            System.out.println("성공");
                }
                System.out.println();
            }
            if (a==2){
            List<HamberVO>list = dao.selectList();
                System.out.println("됨");
            for (int i=0; i< list.size();i++){
                HamberVO hvo2 = list.get(i);
                System.out.println("상품 이름: "+hvo2.getitem_name());
                System.out.println("상품 가격: "+hvo2.getitem_price());
                System.out.println("상품 옵션: "+hvo2.getItem_option());
            }
                System.out.println();
            }
            if (a==3){
                System.out.println("상품 이름");
                String b = sc.next();
                List<HamberVO>list = dao.selectList();
                HamberVO hvo1 = dao.selectOne(b);
                System.out.println("상품정보 출력");
                for ( HamberVO h1 : list ){
                    if ( hvo1.getitem_name().contains(b) )
                    System.out.println("상품 이름 : " + h1.getitem_name());
                    System.out.println("상품 가격 : " + h1.getitem_price());
                    System.out.println("옵션 : " + h1.getItem_option());
                }
            }
            if (a==4){
                System.out.println("수정할 상품명 입력");
                String b = sc.next();
                System.out.println("상품명");
                String c = sc.next();
                System.out.println("상품 가격");
                int d = sc.nextInt();
                System.out.println("옵션");
                String e = sc.next();
                HamberVO hvo1 = dao.selectOne(b);
                hvo1.setitem_name(c);
                hvo1.setitem_price(d);
                hvo1.setItem_option(e);
                int result = dao.update(hvo1);
                if (result>0) {
                    System.out.println("수정완료");
                }
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
