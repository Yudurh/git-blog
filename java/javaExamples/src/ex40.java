public class ex40 {
    public static void main(String[] args) {

        //배열 Array
        //배열이란? 같은 타입의 데이타가 연속된 공간에 나열
        // 그리고 각 데이터에 인덱스를 부여해 놓은 데이터 구조이다
        //사용하는 이유는 대량의 데이터를 처리하기 위해서 사용.

        //정수형 1차배열
        int i = 10, j = 20, k = 30;
        //배열의 형식
        //타입[] 배열이름 = { item1, item2, item3 ;}
        int[] arratNum1 = {10, 20, 30};
        System.out.println(arratNum1[0]);//인덱스로 배열의 요소에 접근
        System.out.println(arratNum1[1]);
        System.out.println(arratNum1[2]);

        //배열의 인덱스(0 1 2 ...)를 반복문의 i변수와 연결한다.
        for (int a = 0; a < 3; a++) {
            System.out.println(arratNum1[a]);
        }

        //배열의 갯수 출력
        System.out.println(arratNum1.length);

        //향상된 for문 - 배열과 리스트
        //for(타입 요소값: 배열){
        //}
        for ( int num:arratNum1){
            System.out.println(num);
        }

        //연습
        int[] nums = {10, 30, 20, 50, 40};
        //1. 배열의 모든 요소를 출력
        //2.    ''  ''  갯수를 출력
        //3.    ''  모든 요소값(정수)의 합계를 출력
        //4. 20은 배열의 몇번째에 위치하는지 출력

        int c = 0;
        int sum = 0;
        for (int a = 0; a < 5; a++) {
            System.out.println(nums[a]);
            c++;
            sum = sum + nums[a];
        }

        System.out.println(c);

        c = 0;

        for (int a = 0; a < 5; a++) {
            c++;
            if (nums[a] == 20) {
                System.out.println(c + "번째");
            }


        }


    }
}

