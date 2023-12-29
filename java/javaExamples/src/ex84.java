import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ex84 {
    public static void main(String[] args) {
        //날짜와 시간 클래스
        //Date : 약한 수준의 기능제공
        //Calendar : 높은 수준의 기능 제공
        //         : 내부적으로 달력을 가지고 있음.
        //           (윤년, 1년 12달 365일의 데이타 제공)
        //윤년 : 4년마다 2월의 하루가 증가된다.
        //    : 지구의 공전주기 약365.2422일

        //양력 달력 : 그레고리안 달력
        //한국시간 : 국제표준시(GMT) + 9시간
        //한국표준시(KST) : GMT + 9

        Calendar cal = new GregorianCalendar(Locale.KOREA);
        //Date 객체 가져오기
        System.out.println( cal.getTime() );
        //타임스탬프 정수값 가져오기
        System.out.println( cal.getTimeInMillis() );

        //년도
        int year = cal.get(Calendar.YEAR);
        System.out.println( year );
        //달(월) : 1월이 0값이다.
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);//6으로찍힘 6의자리값이7
        //일
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println( dayOfMonth );
        //요일
        // 1 일요일 2월 3화 ... 7토
        int dayOfWeek = cal.get( Calendar.DAY_OF_WEEK );
        System.out.println( dayOfWeek );
        //올해의 몇 주차인가?
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println( weekOfYear );
        //이달의 몇주차인가?
        int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println( weekOfMonth );
        //12시간제 시
        int hour = cal.get(Calendar.HOUR);
        System.out.println( hour );
        //24시간제 시
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println(hourOfDay);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(millisecond);


        //전후시간 구하기
        // 예)회원가입후 3개월 동안 무료혜택 주기
        // 예)10시간후 서버점검하기
        cal.add( Calendar.HOUR,10 );
        echoTime(cal);
        // 20시간전
        cal.add( Calendar.HOUR,-20 );
        echoTime(cal);
        // 30일후
        cal.add( Calendar.DAY_OF_MONTH,30 );
        echoTime(cal);
        // 60일후
        cal.add( Calendar.DAY_OF_MONTH,60 );
        echoTime(cal);
        // +1년후
        // 30일후
        cal.add( Calendar.YEAR,1 );
        echoTime(cal);




    }
static void echoTime(Calendar cal){
    SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String strTime = sdf.format( cal.getTime());
    System.out.println( strTime );


    }

}

