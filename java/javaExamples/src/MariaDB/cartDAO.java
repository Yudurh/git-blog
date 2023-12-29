package MariaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class cartDAO {
    Connection conn = null;
    //SQL 쿼리를 구현하는 객체
    Statement stmt = null;
    //쿼리에 대한 응답인 ResultSet을 가져오는 객체
    ResultSet rs = null;

    //생성자 함수
    public cartDAO(){
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
    public int insert(cartVO vo){
        int result = 0;
        String sql = "INSERT INTO cart VALUES(NULL,"+vo.getCart_item_no()+",'"+vo.getItem_name() +"','"+vo.getCart_item_price() +"',"+"default)";



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
    public List<cartVO> selectList(){
        List<cartVO> list = new ArrayList<>();
        try {
            //SELECT * FROM member;
            String sql = "SELECT item_name,cart_item_amount, cart_item_price FROM cart group by cart_item_no ";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while( rs.next() ){
                cartVO vo = new cartVO();
                vo.setItem_name(rs.getString("item_name"));
                vo.setCart_item_price(rs.getInt("cart_item_price"));
                vo.setCart_item_amount(rs.getInt("cart_item_amount"));
                list.add(vo);
            }
        }catch (Exception e){

        }
        return list;
    }

    public int update(cartVO vo){
        int result = 0;
        try{
            String sql = "UPDATE cart SET cart_item_amount = cart_item_amount+1 WHERE item_name ='"+ vo.getItem_name() +"'";
            System.out.println(sql);
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public int update2(cartVO vo){
        int result = 0;
        try{
            String sql = "UPDATE cart SET cart_item_amount ="+ vo.getCart_item_amount()+" WHERE item_name ='"+ vo.getItem_name() +"'";
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
            String sql = "DELETE FROM cart WHERE item_name='"+item_name+"'";
            System.out.println(sql);
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }



}


