public class ex44 {
    public static void main(String[] args) {
        //정렬 알고리즘
        // 1. 버블정렬
        // 2. 선택정렬
        // 3. 삽입정렬
        //Arrays.sort()함수 - 듀얼피봇 퀵정렬 알고리즘
        //버블 정렬
        //모든 자리수를 오른쪽자리와 비교해서 맞교환하는 방식
        int[] numbers = { 9, 8, 1, 3, 2 };
        //모든 자릿수를 비교
        //i:0
        //i:0 <=> j:1 2 3 4
        //i:1 <=> j:2 3 4
        //i:2 <=> j:3 4
        //i:3 <=> j:4

        int a = 0;
        for (int i=0;i<numbers.length;i++){

            for (int j=i+1;j< numbers.length;j++){
                if (numbers[i]>numbers[j]){
                    a=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=a;
                }

            }


        }

        for (int num : numbers){
            System.out.println(num);
        }



    }

}
