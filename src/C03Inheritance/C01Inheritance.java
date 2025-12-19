package C03Inheritance;

// 상속 -> 부모의 변수와 메서드를 자식클래스에서 물려받는 것
public class C01Inheritance extends Parents {
    int b= 20;
    public static void main(String[] args) {
        C01Inheritance c1 = new C01Inheritance();
        // 부모클래스의 변수 a 변수 상속
        System.out.println(c1.b);
        System.out.println(c1.a);

        // private 접근 제어자는 클래스 내부에서만 접근 가능
//        System.out.println(c1.c);
        // 부모클래스의 m1 method 상속
        c1.m1();
        c1.m2();
    }

    // overriding (parent class 재정의: 부모 class의 method, 자식 class의 method 동일한 경우
    // overriding method인 것을 명시적으로 펴햔하는 키워드(annotation)
    // 성능 최적화를 위해 붙여주는 것 좋음.

    @Override
    public void m1() {
        System.out.println("overriding method m1 from child class");
    }

    public void m2() {
        System.out.println("child class");
    }
}

class Parents {
    int a = 10;
    private int c = 30;
    public void m1() {
        System.out.println("This is parents class");
    }
}