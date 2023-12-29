public class ex80 {
    public static void main(String[] args) {

        //try catch finally문

        try{
            //예외가 발생할수도 있는 실행문
            System.out.println("예외발생전");
            throw new Exception();
        }catch (Exception e){
            //예외발생시 수행하는 실행문
            System.out.println("예외발생함");
        }finally {
            //예외가 발생하든 안하든 무조건 실행하는 실행문
            //용도: 자원을 닫아주는 역할
            System.out.println("finally 정리중....");
        }



    }
}
