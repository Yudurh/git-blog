package MariaDB;
// 데이타를 담는 클래스 종류
// VO : View Object, 값의 수정이 안되고, 로직(코드)가 없음
// DTO : Data Transfer Object, 레이어 간 데이타 전송에 사용
//      레이어란? 데이타를 전송/처리하는 단위를 의미.
// ENTITY : JPA에서 주로 사용. DB 컬럼과 1:1로 매칭.

// 데이타를 직접 조작하는 클래스
// DAO : Data Access Object, 직접 DB 제어 메소드들의 집합.

//CREATE TABLE member (
//        memberno INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,membermember
//        id VARCHAR(50),
//        name VARCHAR(50)
//        );
public class MemberVO {
    //DB 컬럼과 1:1연결
    //INT -> int
    //VARCHAR -> String
    //DATETIME : Date or LOcaDateTime
    private  int memberno;
    private String id;
    private String name;

    //getter/setter 자동생성
    public int getMemberno() {
        return memberno;
    }

    public void setMemberno(int memberno) {
        this.memberno = memberno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
