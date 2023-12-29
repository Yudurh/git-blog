public class ex45 {
    public static void main(String[] args) {

        //2. 선택정렬
        //  인덱스변수 minIndex에 최소값 인덱스를 설정하고,
        //  minIndex를 이용해서 맞교환 하는 방식.
        int[] nums = { 9, 8, 1, 3, 2 };
        int minIndex;
        for(int i=0; i<nums.length-1; i++){
            minIndex = i;
            System.out.println("minIdx:"+minIndex);
            for(int j=i+1; j<nums.length; j++){
                if( nums[j] < nums[minIndex] ){
                    //더 작은 값을 발견! => minIndex값을 변경!
                    minIndex = j;
                }
            }
            //minIndex값을 이용해서 맞교환한다.
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        for( int num : nums )
            System.out.println( num );

        //3. 삽입 정렬
        //  인덱스 1(두번째)부터 정렬을 시작하고,
        //  자기보다 왼쪽에 있는 값들과 비교하여,
        //  더 작은 값이면 맞교환한다.
        //  교환할 값을 가진 key변수를 이용함.
        int[] nums1 = { 9, 8, 1, 3, 2 };
        int key;
        for(int i=1; i<nums1.length; i++){
            key = nums1[i]; //8
            int j = i - 1;
            while( j >= 0 && nums1[j] > key ){
                nums1[ j + 1 ] = nums1[j]; //9 9 1 3 2
                j--; //증감문
            }
            nums1[ j + 1 ] = key; //8 9 1 3 2
        }
        for( int num : nums1 )
            System.out.println( num );



    }
}
