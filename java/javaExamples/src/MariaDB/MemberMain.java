package MariaDB;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();

        MemberVO vo = new MemberVO();
        vo.setMemberno(0);
        vo.setId("son");
        vo.setName("흥민");

        int result = dao.insert(vo);
        if ( result > 0 ){
            System.out.println("회원 등록 성공");
        }
        //회원정보 조회
        MemberVO rvo = dao.selectOne(7);
        System.out.println("회원정보 출력");
        System.out.println("회원번호"+rvo.getMemberno());
        System.out.println("아이디:"+rvo.getId());
        System.out.println("이름:"+ rvo.getName());

        //회원정보 수정
        rvo.setName("흥민이형");
        int result2 = dao.update(rvo);
        if ( result2>0 ){
            System.out.println("회원정보 수정 성공");
        }
        
        
        //회원정보 삭제
        int result3 = dao.delete(7);
        if( result3>0 ){
            System.out.println("회원정보 삭제 성공");
        }
        
        
        
        
        
        //회원정보 전체 조회
        System.out.println("회원정보 전체 조회");
        List<MemberVO>list = dao.selectList();
        for (int i=0; i< list.size();i++){
            MemberVO rvo2 = list.get(i);
            System.out.println("회원번호"+rvo2.getMemberno());
            System.out.println("아이디:"+rvo2.getId());
            System.out.println("이름:"+ rvo2.getName());
        }


    }
}
