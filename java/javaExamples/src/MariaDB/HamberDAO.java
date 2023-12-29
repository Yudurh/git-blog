package MariaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HamberDAO {
    Connection conn = null;
    //SQL 쿼리를 구현하는 객체
    Statement stmt = null;
    //쿼리에 대한 응답인 ResultSet을 가져오는 객체
    ResultSet rs = null;

    //생성자 함수
    public HamberDAO(){
        try {
            //MariaDB 드라이버 로드 ( com.mysql.cj.jdbc.Driver )
            Class.forName("org.mariadb.jdbc.Driver");
            //데이터베이스 접속
            conn = DriverManager.getConnection(
                    //jdbc:mysql://localhost:3306/mydb
                    "jdbc:mariadb://localhost:3306/kiosk", //Host
                    "root", //사용자
                    "1234" //암호
            );
        }catch (Exception e){
            e.printStackTrace();
            try {
                conn.close();
            } catch (Exception ex) {
                e.printStackTrace();
            }
        }
        if( conn != null) {
            System.out.println("데이터베이스 접속 성공!!");
        }

    }

    public int insert(HamberVO vo){
        int result = 0;
        //INSERT INTO MEMBER ( memberno, id , NAME ) VALUES(1,'hong','홍길동');
        //주의! 맨끝에 세미콜론이 있으면 안됨!
        String sql = "INSERT INTO item VALUES(NULL,'"+vo.getUuid()+"','"+vo.getitem_name() +"','"+vo.getItem_option() +"','"+vo.getitem_price() +"','"+vo.getitem_image_url() +"',default)";
        try {
            stmt = conn.createStatement();
            //update,delete,insert문은 결과가 영향을 준 행의 갯수로 온다.
            // 1이 결과값으로 온다
            result = stmt.executeUpdate(sql);//쿼리수행
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }



    public List<HamberVO> selectList(){
        List<HamberVO> list = new ArrayList<>();
        try {
            //SELECT * FROM member;
            String sql = "SELECT * FROM item";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while( rs.next() ){
                HamberVO vo = new HamberVO();
                vo.setitem_name(rs.getString("item_name"));
                vo.setItem_option(rs.getString("item_option"));
                vo.setitem_price(rs.getInt("item_price"));
                vo.setItem_number(rs.getInt("item_no"));
                list.add(vo);
            }
        }catch (Exception e){

        }
        return list;
    }


    public HamberVO selectOne(String item_name){
        HamberVO vo = new HamberVO();
        try {
            String sql = "SELECT * FROM item where item_name Like"+ "'%" +item_name+ "%'";
            stmt = conn.createStatement();
            //update,delete,insert문은 결과가 영향을 준 행의 갯수로 온다.
            // 1이 결과값으로 온다
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                vo.setitem_price(rs.getInt("item_price"));
                vo.setItem_option(rs.getNString("item_option"));
                vo.setitem_name(rs.getNString("item_name"));
                vo.setItem_number(rs.getInt("item_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }
    public int update(HamberVO vo){
        int result = 0;
        try{
            String sql = "UPDATE item SET item_name ='"+vo.getitem_name() + "', item_price="+vo.getitem_price()+ ", item_option='"+vo.getItem_option()+"'WHERE item_no ="+vo.getItem_number();
            System.out.println(sql);
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int delete(String item_name){
        int result = 0;
        //DELETE FROM member WHERE memberno=1;
        try{
            String sql = "DELETE FROM item WHERE item_name='"+item_name+"'";
            System.out.println(sql);
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


}
