package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
        // java.util 패키지의 Calendar 클래스
        // java.util ~ .localDateTime, .LocalDate, .LocalTime
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));
//        System.out.println(calendar.get(Calendar.MILLISECOND));

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getMonthValue());
//        System.out.println(localDate.getDayOfYear());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfWeek());

//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());
//        System.out.println(localTime.getNano());

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate localDate = localDateTime.toLocalDate();
//        System.out.println(localDate);
//        System.out.println(localDateTime.getYear());
        // ChronoField 매개변수로 다양한 형식의 날짜/시간정보 조회
//        System.out.println(localDateTime.get(ChronoField.YEAR));
//        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
//        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));
//        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY)); // 0: 오전 1: 오후
//        System.out.println(localDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시 체계로 출력
//        System.out.println(localDateTime.get(ChronoField.HOUR_OF_DAY));
//        System.out.println(localDateTime.get(ChronoField.MINUTE_OF_HOUR));
//        System.out.println(localDateTime.get(ChronoField.SECOND_OF_MINUTE));
//        System.out.println(localDateTime.get(ChronoField.MILLI_OF_SECOND));
//        System.out.println(localDateTime.get(ChronoField.NANO_OF_SECOND));

        // .of: 임의로 특정시간정보 객체를 만들어내고 싶을 때 사용
        LocalDate bDay = LocalDate.of(2000, 11, 12);
        System.out.println(bDay);

        LocalDateTime bdTime = LocalDateTime.of(bDay, LocalTime.of(0, 0));
//        LocalDateTime bdTime = LocalDateTime.of(2000, 11, 12, 0, 0, 12);
        System.out.println(bdTime);
    }
}
