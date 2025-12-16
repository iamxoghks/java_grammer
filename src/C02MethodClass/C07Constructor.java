package C02MethodClass;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class C07Constructor {
    public static void main(String[] args) {
        // Calendar 객체 생성
        Calendar c1 = new Calendar("2025", "Dec", "16");
//        calendar.setYear("2025");
//        calendar.setMonth("Dec");
//        calendar.setDay("16");

        // Calendar 객체 출력
        Calendar.printCalendar(c1);
        System.out.println(c1.calendarInfo());

        // java 자료구조 내에 직접 만든 객체를 담아 관리

        List<Calendar> myList = new ArrayList<>();
        myList.add(c1);
        myList.add(new Calendar("2025", "Dec", "17"));

        System.out.println(myList);

    }
}

// 클래스명 Calendar, 변수: year, month, day 모두 String
class Calendar {
    private String year;
    private String month;
    private String day;

    // 생성자: 객체가 만들어지는(new) 시점에 호출되는 method
    // 생성자 특징
    // 1) class 이름과 method 이름이 동일
    // 2) 반환 타입 없음
    // 3) 매개변수가 있을 수도 있고 없을 수도 있습니다
    // 이 method는 객체를 만들 때 자동으로 호출되는 method
    // 생성자의 사용 목적
    // 비어있는 생성자라 아무 것도 안 함. 객체 생성시점에 객체 변수값들을 초기화.
    // 직접 생성자를 1개라도 추가할 경우, 초기(기본) 생성자는 무시가 되므로
    // 필요시 별도로 추가해야함.
    // 변수의 안정성을 위해 setter 지양하고, 생성자를 지향.
    public Calendar() {}
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    // toString()메서드는 객체명으로 출력시 자동으로 메서드가 호출
    @Override
    public String toString() {
        return "{ year=" + year + " }, { month=" + month + " }, { day=" + day + " }";
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