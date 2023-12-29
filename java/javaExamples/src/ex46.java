import java.util.Random;
public class ex46 {
    public static void main(String[] args) {
        //2차원 정수배열
        //
        //               1열 2열 COLUMN
       /* int[][] nums = {{10,20}, //1행 ROW
                        {30,40}  //2행
        };

        System.out.println( nums[0][0] );
        System.out.println( nums[0][1] );
        System.out.println( nums[1][0] );
        System.out.println( nums[1][1] );


        for (int i=0;i<2;i++){
            for (int j=0;j< nums[i].length;j++){
                System.out.println(nums[i][j]);
            }
        }
        //향상된 for문
        for (int[] arrNum : nums){
            for (int num: arrNum){
                System.out.println(num);
            }

        }*/
        Random ra = new Random();

        //연습
        int[][] nums2 = new int[3][3];
        //1. 2차원 정수배열 nums2를 행3개 열3개로 만들고
        // 모든 행열에 값을 넣되
        // 랜덤값 정수 1~100 사이의 값을 넣고
        // 전체를 순환하여 출력
        //2. 최소값과 최대값을 출력

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<3;i++){

            for (int j=0;j< nums2[i].length;j++){
            nums2[i][j] = ra.nextInt(100)+1;
                System.out.println(nums2[i][j]);
                if (nums2[i][j]>max){
                    max=nums2[i][j];
                }
                if (nums2[i][j]<min){
                    min=nums2[i][j];
                }

            }
        }
        System.out.println( "최대값은" + max);
        System.out.println( "최소값은" + min);

        //연습
        // 순돌이네 인쇄소
        // 3행3열 2차원 정수배열에 아래와 같은 숫자가 들어왔다면
        // 0 1 0          @ * @
        // 1 2 0    =>    * + @
        // 1 0 0          * @ @
        // 이렇게 출력된다
        // 0 1 2
        // 1 2 0
        // 2 1 0 의 결과를 출력하시오

        int [][] b = {
                {0,1,2},
                {1,2,0},
                {2,1,0}
        };
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (b[i][j]==0){
                    System.out.print(" @ ");
                }else if (b[i][j]==1){
                    System.out.print(" * ");
                }else {
                    System.out.print(" + ");
                };


            }
            System.out.println();
        }









    }
}
