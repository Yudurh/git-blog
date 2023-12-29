import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
public class ex85 {
    public static void main(String[] args) {
        //연습문제
        //두 날짜 사이의 차이를 구하기(D-Day구하기)
        //12월 25일 크리스마스에 제품을 구매하면 선물을 주려고 한다
        //현재 날짜 기준으로 D-Day를 출력하시오
        //출력예) "크리스마스까지 142일 남았습니다."
        Calendar cal1 = new GregorianCalendar(Locale.KOREA);
        Calendar cal2 = new GregorianCalendar(Locale.KOREA);

        cal1.setTime( new Date() );
        System.out.println(cal1.getTimeInMillis());
        cal2.set(2023,11,25);
        System.out.println(cal2.getTimeInMillis());
        System.out.println((cal2.getTimeInMillis()-cal1.getTimeInMillis())/(1000*60*60*24));

    }
}
