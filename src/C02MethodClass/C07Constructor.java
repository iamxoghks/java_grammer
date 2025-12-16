package C02MethodClass;

import java.util.GregorianCalendar;

public class C07Constructor {
    public static void main(String[] args) {
        // Calendar 객체 생성
        Calendar calendar = new Calendar();
        calendar.setYear("2025");
        calendar.setMonth("Dec");
        calendar.setDay("16");

        // Calendar 객체 출력
        Calendar.printCalendar(calendar);
        System.out.println(calendar.calendarInfo());
    }
}

// 클래스명 Calendar, 변수: year, month, day 모두 String
class Calendar {
    private String year;
    private String month;
    private String day;

    public String getYear() {
        return year; }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    // class method
    public static void printCalendar(Calendar calendar) {
        System.out.println("오늘의 날짜는 " + calendar.getYear() + " - " +  calendar.getMonth() + " - " + calendar.getDay());
    }

    // 객체 method
    public String calendarInfo() {
        return "오늘의 날짜는 " + this.year + " - " + this.month + " - " + this.day;
    }
}