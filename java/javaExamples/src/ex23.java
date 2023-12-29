public class ex23 {
    public static void main(String[] args) {

        //조건문의 4가지 형식(패턴)


        //1. 단일 if문
        //형식: if ( 조건식 ) {
        //          true일때의 실행문;
        //}
        int i = 10;
        if (i == 10) ;
        {
            System.out.println("i가 10임");
        }

        //2. if else문
        // if( 조건식 ) {
        //   true일때의 실행문;
        //}else{
        //  false일때의 실행문;
        //}
        if (i > 20) {
            System.out.println("i가 20보다 큼");
        } else {
            System.out.println("i가 20보단 작거나 같음");
        }


        //3. if else if문
        // if( 조건식1 ) {
        //   조건식1이 true 일때의 실행문
        //}else if( 조건식2 ){
        //  조건식1이 false고, 조건식2가 true 일때의 실행문
        //}else{
        //  조건식1이 false고 조건식2가 false일때의 실행문
        //}
        if (i < 10) {
            System.out.println("i가 10보다 작음");
        } else if (i < 20) {
            System.out.println("i가 10보다 작지않고 20보다 작음");
        } else {
            System.out.println("i가10보다 작지 않고 20보다 작지 않음");
        }


        //4. 중첩 if문(if안에 if문) - 3단계 이상으로 들어가지 않도록 주의!
        //  함수를 이용하여 코드를 분리해주면 좋다.
        if (i % 2 == 0) {
            System.out.println("2의 배수임");
            if (i % 5 == 0) {
                System.out.println("2의 배수이며 5의 배수임");
            } else {
                System.out.println("2의 배수이나 5의 배수는 아님");
            }
        }
    }
}