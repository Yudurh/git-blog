public class ex76 {
    public static void main(String[] args) {
        //String 클래스
        //StringBuffer 클래스 : 문ㄴ자열을 좀 더 유연하게 처리해주는 함수가 추가됨
        //      : 추가,삽입,삭제 ....
        //StringBuilder 클래스 : StringBuffer를 좀 더 빠르게하려고 만든것
        //      : 대량의 정보를 처리할때 유리함

        String str = "abc";

        StringBuffer sb = new StringBuffer("abc");
        System.out.println( sb );

        sb.append("def");
        System.out.println( sb );


        sb.insert(3,"123"); //abc123def
        System.out.println( sb );

        sb.delete(2,4);
        System.out.println( sb );//ab23def


        String str2 = sb.toString();
        System.out.println(str2);
    }
}
