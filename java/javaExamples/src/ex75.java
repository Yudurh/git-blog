public class ex75 {
    public static void main(String[] args) {
        //최상위 객체 Object
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1);
        System.out.println(object2);

        //String 참조형 변수이다
        String str = "abc";
        String str2 = new String("abc");
        System.out.println(str);
        System.out.println(str2);

        //참조형변수(문자열형)의 비교

        if(str == str2){// 주소 비교가 됨
            System.out.println("같음");
        }else {
            System.out.println("다름");
        }
        if (str.equals(str2)){//내용비교
            System.out.println("같음");
        }else {
            System.out.println("다름");
        }
        //해쉬코드(hash code)
        //int형으로 object의 고유한 ID값
        // new를 통해 객체화될때 자동으로 부여함
        System.out.println( object1.hashCode() );
        System.out.println( object2.hashCode() );



    }
}
