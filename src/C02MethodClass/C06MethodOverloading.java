package C02MethodClass;

// java에서 같은 이름의 method 선언은 불가하다
// 다만, 같은 이름의 method 명을 사용하되 매개변수의 개수 또는 type이 달라지는 경우의
// Method Overloading은 예외
public class C06MethodOverloading {
    public static void main(String[] args) {
        // method overloading 후 해당 method call
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20.5));
        System.out.println(sum(10, 20, 30));

        // another method overloading
        System.out.println("hello world!");
        System.out.println(10);
        System.out.println(10.5);
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static double sum(double a, double b) {
        return a+b;
    }

}
