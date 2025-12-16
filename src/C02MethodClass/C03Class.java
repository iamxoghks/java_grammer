package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C03Class {
    public static void main(String[] args) {

        // Class method 기본 호출 방식
//        int result = Calculator.add(10, 20);
//
//        Calculator calculator = new Calculator();
//        int result2 = calculator.add(1, 2);

        // 객체가 아닌 Class 만 사용시 문제점
        // 고유의 변수, 고유의 메서드 사용 불가
        // A
        // 20원 매출
//        Calculator.sumAcc(20);
//        System.out.println(Calculator.accumulator);
//
//
//        // 30원 매출
//        Calculator.sumAcc(30);
//        System.out.println(Calculator.accumulator);
//
//        // 40원 매출
//        // 누적 매출: 90원
//        System.out.println(Calculator.sumAcc(40));
//
//        // B
//        // 10원 매출
//        System.out.println(Calculator.sumAcc(10)); // 100원이 아닌 10원
//
//        // 20원 매출
//        System.out.println(Calculator.sumAcc(20)); // 120원이 아닌 30원


        // 객체를 활용한 부서별 매출 계산
        CalculatorForInstance calA = new CalculatorForInstance();
        CalculatorForInstance calB = new CalculatorForInstance();

        // A 부서
        calA.accumulation(20);
        System.out.println(calA.accumulator);
        calA.accumulation(30);
        System.out.println(calA.accumulator);
        calA.accumulation(50);
        System.out.println(calA.accumulator);

        // B 부서
        calB.accumulation(10);
        System.out.println(calB.accumulator);
        calB.accumulation(15);
        System.out.println(calB.accumulator);
        calB.accumulation(30);
        System.out.println(calB.accumulator);

        // 클래스매서드 사용 예시
        System.out.println(Math.min(10, 20));
        // 객체 사용 예시
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
    }
}

//class Calculator {
//
//    // class 변수
//    static int accumulator;
//    // 객체 변수
////    int accumulator = 0;
//
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int sumAcc(int a) {
//        accumulator += a;
//        return accumulator;
//    }
//}



class CalculatorForInstance {

    // class 변수
//     static int accumulator;
    // 객체 변수
    int accumulator = 0;

    // method에 static이 있는 경우는 class method
    // class method는 일반적으로 객체의 상태와 상관없는 독립적인 로직 수행시 사용 -> 메모리 저장 필요 X
    public static int add(int a, int b) {
        return a + b;
    }

    // method에 static이 없으면 객체 method
    // 객체 method
    public int accumulation(int a) {
        // this. -> 매개변수명과 객체변수명이 이름이 같을 때 사용
        // 객체 자기 자신을 의미하므로 객체변수명에 관행적으로 붙임
        this.accumulator += a;
        return this.accumulator;
    }
}
