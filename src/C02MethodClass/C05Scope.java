package C02MethodClass;

// 변수의 유효 범위: class 변수와 객체 변수는 class 전역에서 사용 가능
public class C05Scope {
    // class 변수 = static 변수
    static int v1 = 10;

    // 객체 변수
    int v2 = 20;
    public static void main(String[] args) {
        // v2를 static void에서는 접근할 수 없다.
        // 객체 method 에서만 접근 가능
        // 쓰려면 int v2에 static을 붙이거나
        // 사용하려는 곳에서 static을 빼야함.

        int v3 = 10;

        scope1(v3); // 30
        System.out.println(v3); // 10

        C04Person p1 = new C04Person();
        p1.setName("kim");
        p1.setEmail("email@email.com");
        p1.setAge(34);
        scope2(p1);
        System.out.println(p1.returnPersonalInfo());
    }

    public void main2(String[] args) {
        // 지역변수는 해당 method 내에서만 사용 가능하다
        int v3 = 30;
    }

    public static void scope1(int v3) {
        // call by value: 값 만을 전달했다
        v3 = 30;
        System.out.println("v3 = " + v3);
    }

    public static void scope2(C04Person person) {
        // call ny reference: 참조에 의한 호출. heap 메모리 주소에 접근.
        person.setName("hong");
        System.out.println(person.returnPersonalInfo());
    }
}
