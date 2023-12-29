import java.text.SimpleDateFormat;
import java.util.Date;
public class ex83 {
    public static void main(String[] args) {
        //날짜와 시간 관련된 클래스
        //Date, Calendar 클래스 사용

        //인간이 살아가는 주된 배경
        //1. 시간 - 단위: 년월일시분로밀리초, 너무 복잡하고 큰값이니까 하나의 정수값으로 표현(timestamp 1970-1-1 0:0:0:0)
        //          2023년7월31일10시30분20초932밀리초 => 1929393919192
        //2. 장소 - 행정주소(경기도 의정부시 호원동) => GPS좌표(위도. 경도 double값)

        //현재시간을 운영체제(윈도우즈10,맥,리눅스)에서 가져온다.
        Date date = new Date();//현재시간을 담고있는 Date 객체
        System.out.println( date );//Mon Jul 31 10:42:06 KST 2023
        //타임스탬프 정수값 출력
        long timestamp = date.getTime();
        System.out.println( timestamp );
        //1690767840789 밀리초단위

        //날짜시간을 포맷(형식)에 맞춰서 출력하기
        //SimpleDateFormat 클래스
        // 심볼
        // yyyy : year
        // MM : month
        // dd : day on month
        // HH : hour 24시간제
        // hh : Hour 12시간제 a : AM 또는 PM
        // mm : minute
        // ss : second
        // SS : milli second
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");

        String dateFormat = sdf.format(new Date());
        System.out.println( dateFormat );

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateFormat2 = sdf2.format(new Date());
        System.out.println( dateFormat2 );

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");

        String dateFormat3 = sdf3.format(new Date());
        System.out.println( dateFormat3 );



    }
}
