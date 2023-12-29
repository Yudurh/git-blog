package MariaDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public static void main(String[] args) {
        //데이터베이스 접속 객체
        Connection conn = null;
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
}