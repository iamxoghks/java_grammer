package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
        // 변수의 명명규칙
        // 변수명에 의미의 분절이 일어나는 겨우에는 camelcase 또는 _소문자 사용
//        String myFirstName = "hongildong";
//        String my_first_name = "hongildong";

        // 정수: byte(1b yte 할당), int(4 byte 할당), long(8 byte 할당)
//        byte a = 127, b = -128;

        // 자료형이 표현할 수 있는 범위를 넘어선 경우 오버플로우/언더플로우 발생
        // 표현 가능한 범위 이상은 오버, 이하는 언더
//        a++; // 오버플로우
//        System.out.println(a);
//        b--; // 언더플로우
//        System.out.println(b);

//        long l1 = 10;
        // long은 명시적으로 L을 붙여서 해당 값이 long타입임을 명시
//        long l2 = 20L;
//        System.out.println(l1+l2);

        // 실수: float, double
//        float f1 = 1.123F;
//        double d1 = 1.123;
//        double d2 = 1.123D;

        // 실수 연산은 기본적으로 오차 발생: 소수점을 2진법으로 표현하는 부동소수점을 사용하기 때문
//        double d3 = 0.1;
        // 미세한 오차는 소수점 절사를 통하여 당장에는 드러나지 않음
//        System.out.println(d3);
        // 부동소수점 오차 테스트
//        double total = 0;
//        for(int i = 0; i < 1000; i++) total += 0.1;
//        System.out.println(total);

        // 소수점 연산 오차 해결방법1: 소수를 정수로 변환 후 추후 다시 나눗셈으로 변환
//        double total2 = 0;
//        for(int i = 0; i < 1000; i++) total2 += (0.1*10);
//        System.out.println(total2);

        // 소수점 연산 오차 해결방법2: BigDecimal class 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//        // 값을 입력받아 저장할 때부터 문자로 입력을 받아 오차문제를 해결
          // 금전, 은행 등 관련 거래가 필요할 때 필수로 씀. 그 외에는 그닥..?
//        BigDecimal b1 = new BigDecimal("1.03");
//        BigDecimal b2 = new BigDecimal("0.42");
//        double result = b1.subtract(b2).doubleValue();
//        System.out.println(result);

        // 문자형: char는 1글자, String은 1글자 이상
//        char c1 = '가';
//        String st1 = "가";

        // String 또는 char 배열 최초 선언시 초기값이 null로 할당
        // (int는 0, boolean은 false가 초기값) -> 배열 설정할 때 중요하므로 반드시 외울것
//        String[] stArr = new String[10];
//        System.out.println(stArr[0]);

        // null은 값이 없다는 의미로서 하나의 type이다
//        String st1 = "";
//        String st2 = null;
//        System.out.println("st1: " + st1 + ", st2: " + st2);
//        System.out.println(st1.isEmpty()); // -> true
//        System.out.println(st2.isEmpty()); // -> error

//        String[] stArr = new String[5];
//        stArr[1] = "hellowowrld1";
//        stArr[3] = "hellowowrld3";

        // boolean 형 : true, false
//        boolean b1 = false;
//        if(b1) System.out.println("true");
//        else System.out.println("false");

        // 타입변화: (기본방향) 작은 타입에서 큰 타입으로 변환시는 문제 없다
        // int -> long: 문제 없음
//        int i1 = 10;
//        long l1 = i1;
//
//        // int -> double: 문제 없음
//        int i2 = 10;
//        double d1 = i2;
//        System.out.println(d1);
//
//        // double -> int: 기본적으로는 허용 불가. 명시적 형 변환은 가능
//        double d2 = 10.5;
//        int i3 = (int) d2;

        // 정수/정수 일 경우 소수점 절사 문제 발생
        // '두 수가 모두 정수이면 결과값도 정수일 것이다'라고 java가 판단한다
        // 두 수 중에 하나라도 double로 변환시켜 해결
//        int a = 1;
//        int b = 4;
//        double d1 = (a/b);
//        System.out.println(d1);
//        double d2 = (double) a/b;
//        System.out.println(d2);

        // char -> int: 문제 없음

//        char c1 = 'a';
//        int i1 = (int) c1; // 명시적 타입 변환
//        int i2 = c1; // 묵시적 타입 변환
//        System.out.println(i1);
//        System.out.println(i2);
//        // 예) 문자 비교를 위한 묵시적 타입변환
//        System.out.println('a' > 'b'); // ASCII 코드를 비교함
//        System.out.println('a' < 'b'); // 동일

//        문제) 알바펫 소문자 개수 세기
        String st1 = "012DWA@14admaiowd";
        int count = 0;
        for(int i = 0; i < st1.length(); i++) {
            char ch = st1.charAt(i);
            if(ch>= 97 && ch <= 122) count++;
            // 알파벳 전체 개수일 때
//            if((ch>= 97 && ch <= 122) || ch>= 65 && ch <= 90) count++;
        }
        System.out.println(count);

        // 변수와 상수
        // 변수: 재할당 가능, 재선언은 불가능
//        int a1 = 10;
//        a1 = 20;
//        // 불가능 -> 위에 이미 선언함
//        int a1 = 30;

        // 상수: 값의 재할당 불가능. 정해진값을 사용시 상수 활용.
        final int a1 = 10;

    }
}
