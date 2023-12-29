public class ex14 {
    public static void main(String[] args) {

        //단항연산자 ++ -- !(논리반전) (형변환)(타입) ~(물결-비트반전)
        // A++ : A = A + 1
        // A-- : A = A - 1
        // 형변환(int)A : int형으로 형변환됨
        // 논리반전 !A true -> false

        // ~A 비트반전 ~0 -> 1 , ~1 -> 0
        // * 비트단위 연산자는 잘 안쓰인다.

        int i = 15;//이진수 1111, 10->1010
                   // 0000000....0001111
        System.out.println( Integer.toBinaryString(i));
        i = ~i; // 0->1 , 1->0 000000...00001111
                //             111111...11110000
        System.out.println( Integer.toBinaryString(i));
        System.out.println( i ); //-16 돼 있음 ~ 양수 음수도 반전













    }
}
