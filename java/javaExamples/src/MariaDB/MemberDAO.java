package MariaDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    //데이터베이스 접속 객체
    Connection conn = null;
    //SQL 쿼리를 구현하는 객체
    Statement stmt = null;
    //쿼리에 대한 응답인 ResultSet을 가져오는 객체
    ResultSet rs = null;

    //생성자 함수
    public MemberDAO(){
        try {
            //MariaDB 드라이버 로드 ( com.mysql.cj.jdbc.Driver )
            Class.forName("org.mariadb.jdbc.Driver");
            //데이터베이스 접속
            conn = DriverManager.getConnection(
                    //jdbc:mysql://localhost:3306/mydb
                    "jdbc:mariadb://localhost:3306/mydb", //Host
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

    public int insert(MemberVO vo){
        int result = 0;
        //INSERT INTO MEMBER ( memberno, id , NAME ) VALUES(1,'hong','홍길동');
        //주의! 맨끝에 세미콜론이 있으면 안됨!
        String sql = "INSERT INTO MEMBER VALUES(NULL,'"+vo.getId()+"','"+vo.getName() +"')";
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
    public MemberVO selectOne(int memberno){
        MemberVO vo = new MemberVO();
        try {
            String sql = "SELECT * FROM member where memberno=" + memberno;
            stmt = conn.createStatement();
            //update,delete,insert문은 결과가 영향을 준 행의 갯수로 온다.
            // 1이 결과값으로 온다
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                vo.setMemberno(rs.getInt("memberno"));
                vo.setId(rs.getNString("id"));
                vo.setName(rs.getNString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }
    public List<MemberVO> selectList(){
        List<MemberVO> list = new ArrayList<>();
        try {
            //SELECT * FROM member;
            String sql = "SELECT * FROM member";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while( rs.next() ){
                MemberVO vo = new MemberVO();
                vo.setMemberno(rs.getInt("memberno"));
                vo.setId(rs.getString("id"));
                vo.setName(rs.getString("name"));
                list.add(vo);
            }
        }catch (Exception e){

        }
        return list;
    }
    public int update(MemberVO vo){
        int result = 0;
        try{
            String sql = "UPDATE member SET id='"+vo.getId()+"', `name`='"+vo.getName()+"'WHERE memberno="+vo.getMemberno();
            System.out.println(sql);
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public int delete(int memberno){
        int result = 0;
        //DELETE FROM member WHERE memberno=1;
        try{
            String sql = "DELETE FROM member WHERE memberno="+memberno;
            System.out.println(sql);
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (Exception e){
                e.printStackTrace();
        }
        return result;
    }
}
