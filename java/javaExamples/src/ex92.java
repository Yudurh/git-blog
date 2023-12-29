public class ex92 {
    public static void main(String[] args) {
        //재귀함수 Recursive Function
        // : 자기가 자기를 호출하는 함수
        myFunc();

    }
    static int count = 0;
    static void myFunc(){
        count++;
        System.out.println("myFunc호출됨:" + count);
        //탈출조건
        if ( count > 3 ){
            count--;
            System.out.println("탈출:count" +count);
            return;
        }
        myFunc();

        count--;
        System.out.println("탈출2:count"+count);
        return;
    }

}
