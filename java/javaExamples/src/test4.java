import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 0, 4, 2 };
        int b = nums[0]+nums[4];
        System.out.println( "합은 " + b );


        for (int i=0;i<5;i++){
            int a = nums[i];
            System.out.println(nums[a]);
        }


        Arrays.sort(nums);
        System.out.println("최소값: " + nums[0]);
        System.out.println("최대값: " + nums[4]);

    }
}
