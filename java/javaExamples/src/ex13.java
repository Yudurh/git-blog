public class ex13 {
    public static void main(String[] args) {
        // i++ i--
        // ++i --i
        // i++ : 다음줄로 넘어가면서 +1
        // ++i : +1이 먼저 되고 그다음 연산이 수행됨

        int i = 10;
        i++;
        ++i;
        System.out.println( i );


        i=10;
        System.out.println( i++ );//10
        System.out.println( i );//11
        System.out.println( ++i );//12
        System.out.println( i );//12










    }
}
