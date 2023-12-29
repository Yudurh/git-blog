import java.sql.Timestamp;
import java.time.*;

public class ex86 {
    public static void main(String[] args) {
        //LocalDate, LocalTime, LocalDateTime
        // : JDK 1.8부터 지원
        // : 타임존 개념이 없는 단순날짜/시간 정보 출력
        // : 오픈소스 JodaTime클래스를 본따서 만듦
        // : 최신 트렌드는 Date클래스보다 LocalData, LocalDateTime을 주로 사용

        //Date, Calender의 단점
        //1. get/set함수로 인해 중간에 값이 변경될 여지가 있다
        //2. 1월을 0으로 표현하는 문제
        //3. 년/월/일 계산은 Date로만 안되고 Calender를 사용해야됨

        //LocalDate
        LocalDate now = LocalDate.now();
        System.out.println( now );
        //날짜 설정하기                                  1은 1월 0x
        LocalDate birthday = LocalDate.of(2023,2,3);
        System.out.println(birthday);
        //문자열로 날짜 설정하기
        LocalDate xmas = LocalDate.parse("2023-12-25");
        System.out.println(xmas);
        // / : 빈칸은 사용불가
        //LocalDate xmas2 = LocalDate.parse("2023 12 25");
        //System.out.println(xmas2);

        //LocalTime
        LocalTime nowTime = LocalTime.now();
        System.out.println( nowTime );
        //세계시간 - 프랑스 파리
        LocalTime parisTime = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println( parisTime );
        //시간 설정하기
        LocalTime sleepTime = LocalTime.of(23,30,0);
        System.out.println(sleepTime);
        // 시간 더하기/빼기
        LocalTime getupTime = sleepTime.plusHours(8);
        System.out.println(getupTime);
        LocalTime inHouseTime = sleepTime.plusHours(5);
        System.out.println(inHouseTime);

        //LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println( dateTime.getYear() );
        System.out.println( dateTime.getMonth() );//달 이름
        System.out.println( dateTime.getMonthValue() );//달 숫자 표기 1부터 시작
        System.out.println( dateTime.getDayOfMonth() );
        System.out.println( dateTime.getHour() );
        System.out.println( dateTime.getSecond() );

        //날짜시간 설정하기
        //LocalDateTime y2k = LocalDateTime.of(1999,12,31,23,
         //       59,29,999);
        //System.out.println(y2k);
        //문자열에서 날짜시간 설정하기
        LocalDateTime now2 = LocalDateTime.parse("2023-07-31T12:52:20.887147400");
        System.out.println(now2);
        LocalDateTime now3 = LocalDateTime.parse("2023-07-31T12:52:20");
        System.out.println(now3);
        //함수로 연결
        LocalDateTime now5 = Year.of(2023).atMonth(12).atDay(25).atTime(12,56,00);
        System.out.println(now5);

        //데이터타입 매칭
        //Java          MySQL(MariaDB)    Oracle
        //String        varchar           varchar2
        //int/long      int               number
        //float/double  float             float
        //Date          date              date
        //LocalDate     date              date
        //LocalDateTime datetime          date


        //연습
        //크리스마스까지 날짜 구하기


       // Timestamp timestamp1 = Timestamp.valueOf(now)





    }
}
