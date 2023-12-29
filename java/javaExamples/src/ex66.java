public class ex66 {
    public static void main(String[] args) {
        //배열 : 동일한 타입의 데이타를 나란히 나열한 데이터 구조
        //    : int[] String[] 클래스이름[]
        //클래스 객체 배열을 다루어보자
        int[] nums = new int[5];
        Snack[] snacks = new Snack[5];
        snacks[0] = new Snack("짱구");
        snacks[1] = new Snack("포카칩");
        snacks[2] = new Snack("먹태깡");
        snacks[3] = new Snack("허니버터칩");
        snacks[4] = new Snack("프링글스");



        //향상된 for문
        for ( Snack snack : snacks ){
            System.out.println( snack.name );
        }


    }
}
class Snack{
    String name = "양파깡";
    public  Snack(String name){
            this.name = name;
    }
}