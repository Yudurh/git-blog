//public : 예약어 접근제한자 - 모든 클래스에서 접근가능
//class : 예약어 클래스 정의어
//ex01 : 사용자정의어 클래스이름이면서 파일이름
//자바는 클래스에서 클래스로 끝남
// {} : 클래스나 함수(메소드)의 코드 본문을 감쌀때 사용함 scope 혹은 영역 이라고도 부름
// () : 함수의 매개변수(입력값)을 지정할 때 사용
// [] : 배열(나라히 배열된 데이터)의 타입을 지정
public class ex01 {
    //static : 예약어 - 정적 함수,클래스,변수앞에 지정
    //void : 예약어 - 함수의 반환형이 없다
    //main : 예약어 시작점 함수의 이름
    //String[] args : 시작점 함수의 매개변수
    //덩어리가 그냥 프로그램 시작점
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        System.out.println( 10 + 20 );
        System.out.println("JSH");
        // ; 세미콜론 : 실행문의 끝을 의미

        //1. 콘솔에 보인이름을 영문으로 출력하시오.
        //2. 콘솔에 10 + 20 의 결과를 출력하시오.

        //System.out.println : 콘솔에 문자열을 출력해주는 함수
        //"data" 쌍따옴표 : 문자열임을 알려줌
        // 실행 단축키 : SHIFT + F10
        // //: 한줄 코멘트 걍 설명문구
        // /*:여러줄 코멘트
    }
}