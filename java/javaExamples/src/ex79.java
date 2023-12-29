public class ex79 {
    public static void main(String[] args) {
        //예외 처리 방법
        //1. try catch문
        //2. throws문 : 예외를 내가 처리하지 않고 나를 호출한 대상에게 전달한다.

        try {
            myFunc();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static void myFunc() throws Exception {

        //강제로 예외를 방시키는 코드
        throw new Exception();
        //1.try catch
        //2. throws

    }

}
