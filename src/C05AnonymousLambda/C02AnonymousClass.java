package C05AnonymousLambda;

import org.w3c.dom.ls.LSOutput;

// 익명 내부 클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
        // AbstractAnimal을 상속한 class가 별도로 존재하지 않음
        // 익명 클래스가 만들어짐과 동시에 익명 객체 생성
        AbstractAnimal aa = new AbstractAnimal() {
            @Override
            void makeSound() {
                System.out.println("머ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅇ 머ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅇ");
            }
        };

        aa.makeSound();
        aa.eat();

        Animal1 a1 = new Animal1() {
            @Override
            public void makeSound() {

            }

            @Override
            public void eat() {

            }
        };

        // interface의 익명객체에 구현할 method가 1개만 있을 때는 Lambda 표현식 가능
        // Animal2 a2 = new Animal2();~~~ >>>>>> Animal2 a2 = () -> {};
        // 어차피 안에 실행할 method는 한 개만 있어서 그냥 ㅇㅇ...... () -> {};
//        Animal2 a2 = () -> {};

        // 객체 1
        Animal2 a2_1 = () -> {
            System.out.println("hello world! 1");
            System.out.println("hello world! 2");
        };
        a2_1.makeSound();

        // 객체 2
        // 실행문이 한 줄만 있을 때 중괄호 { } 생략 가능. if, else if 랑 비슷
        Animal2 a2_2 = () -> System.out.println("hello world! 1");
        a2_2.makeSound();

        // 객체 3
        Animal3 a3_1 = (a, b, c) -> a + ", " +  b + ", " + c;
        System.out.println(a3_1.makeSound("java", "c", "python"));


        // 익명 객체 만들기 Animal4
        // makeSound() 선언 -> String, String, int && return String
        // method 기능: int가 10 이상이면 a+b return, 10 미만이면 a만 return
        Animal4 a4 = (a, b, c) -> {
            if(c >= 10) return a+b;
            return a;
        };

        System.out.println(a4.makeSound("eth", " to the moon", 10));

    }
}

abstract class AbstractAnimal {
    abstract void makeSound();

    void eat() {
        System.out.println("동물이 먹이를 먹습니다.");
    }
}

interface Animal1 {
    void makeSound();
    void eat();
}

interface Animal2 {
    void makeSound();
}

interface Animal3 {
    String makeSound(String a, String b, String c);
}

interface Animal4 {
    String makeSound(String a, String b, int c);
}
