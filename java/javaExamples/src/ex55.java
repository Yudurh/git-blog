public class ex55 {
    public static void main(String[] args) {
        //접근제한자 4가지
        //접근제한자 : 클래스, 함수, 변수 앞에 위치하는 예약어,
        //           접근하는 권한을 제어할 때 사용함
        //public : 모든 클래스에서 접근가능
        //protected : 같은 폴더 + 상속관계에 있을 때 접근가능
        //           자식클래스에서 부모클래스로 접근가능
        //default(기본값) : 같은 폴더에서 접근가능
        //private : 같은 클래스안에서만 접근가능 - 캡슐화(은닉)에 적합함
        //         Getter/Setter 함수로 오픈해 줌.
        // 접근성 비교
        // public > protected > defalt > private
        //* 사용하는 이유 : 자원을 누구나 사용하면 에러(유지보수)처리에 어려움 발생
        Hong objHong = new Hong();
        System.out.println( objHong.name );
        System.out.println( objHong.age );
        System.out.println( objHong.korScore );

        objHong.setEngScore( 90 );
        System.out.println( objHong.getEngScore() );
    }
}




class Hong {
    String name = "홍길동";//defalt - 같은 폴더 안에서는 접근가능
    public int age = 30; //public - 모든 폴더 + 상속관계 + 자기클래스
    protected int korScore = 80;  //상속관계 + 같은폴더 + 자기클래스
    private int engScore = 70; //자기 클래스에서만 접근가능

    //Getter함수
    public int getEngScore() {
        return engScore;
    }

    //Setter함수
    //this : 자기클래스를 의미
    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
}