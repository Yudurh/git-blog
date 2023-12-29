public class ex78 {
    public static void main(String[] args) {
        //예외처리 Exception Handling
        // 예외 = 에러 = 오류 (실행중단)
        // try catch문
        //예외 종류
        //1. 배열의 인덱스 지정 오류
        //2. Null Exception
        //3. 산술 Exception  보통 0으로 나눌 때
        //4. 인터럽트(가로채기) Exception

        try {
            //인덱스 오류
            //int[] nums = { 10, 20, 30 };
            //System.out.println( nums[3] );
            //산술오류
            //int n = 10/0;
            //Null 예외
            //String str = null;//null
            //System.out.println(str.length());

        }catch (NullPointerException e){
            System.out.println("널포인트 예외");
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("산술 예외");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 오류");
            e.printStackTrace();
        }

        catch (Exception e){
            System.out.println("예외발생");
            e.printStackTrace();//예외발생 경로를 출력함
        }

        //try catch문을 반드시 써야 되는 자바 함수가 있음.
        try{

            System.out.println("1초간 쉽니다...");
            Thread.sleep(1000);//프로그램 수행을 1초간 정지후 실행됨.
        }catch (Exception e){

        }




        System.out.println("종료됨.");

    }
}
