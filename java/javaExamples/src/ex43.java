public class ex43 {
    public static void main(String[] args) {
        //값의 치환(바꿔치기)
        int a = 10;
        int b = 20;
        //a와b의 값을 서로 치환하려면?
        //temp 변수를 이용하여 순차적으로 교환한다
        int temp = a;
        a = b;
        b = temp;

        //연습
        int[] nums = { 10, 30, 20, 50, 40 };
        //1. 2번쨰 요소와 3번째 요소를 치환한 후
        //  전체요소를 출력
        //2. 1번째 요소와 5번째 요소를 치환한 후
        // 전체요소를 출력

        //3. 최대값 찾기 (Arrays.sort 사용하지않기)
        // 1)int max = 최소값을 넣고,
        // 2)전체 요소를 순환하면서 max값보다 큰값이 있으면 대입

        //4. 최소값 찾기
        // 1)int min = 최대값
        // 2)전체 요소를 순환하면서 min값보다 작은 값이 있으면 대입
        temp = nums[1];
        nums[1] = nums[2];
        nums[2] = temp;
        for (int numss:nums){
            System.out.println(numss);
        }
        temp = nums[0];
        nums[0] = nums[4];
        nums[4] = temp;
        for (int numss:nums){
            System.out.println(numss);
        }
        int max = 10;
        for (int i=0;i<5;i++){

            if (nums[i]>max){
                max=nums[i];
            }

        }
        int min = 50;
        System.out.println("최대값은" + max);
        for (int i=0;i<5;i++){

            if (nums[i]<min){
                min=nums[i];
            }

        }
        System.out.println( "최소값은" + min);

        for (int i : nums){
            System.out.println(i);
        }






    }
}
