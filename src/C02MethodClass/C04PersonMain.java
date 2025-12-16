package C02MethodClass;

public class C04PersonMain {
    public static void main(String[] args) {
        // sign in ex
//        String name1 = "hong1";
//        String email1 = "hong1@naver.com";
//        int age1 = 30;
//
//        printMember(name1, email1, age1);
//
//        String name2 = "hong2";
//        String email2 = "hong2@naver.com";
//        int age2 = 32;
//
//        printMember(name2, email2, age2);
//
//        C04Person p1 = new C04Person();
//        p1.name = "hong1";
//        p1.email = "hong1@naver.com";
//        p1.age = 30;
//
//        C04Person p2 = new C04Person();
//        p2.name = "hong2";
//        p2.email = "hong2@naver.com";
//        p2.age = 32;
//
//
//        printMember2(p1);
//        printMember2(p2);

        // 위 코드의 문제점
        // 1. person 객체의 변수에 외부 클래스에서 접근 가능
        // 2. person에 대한 출력 코드가 외부클래스마다 중복되어 들어갈 가능성 있음
        C04Person p3 = new C04Person();
        p3.setName("h");
        p3.setEmail("h@");
        p3.setAge(13);

        printMember2(p3);

        System.out.println(p3.returnPersonalInfo());

    }

    // 출력 메서드

    public static void printMember(String name, String  email, int age) {
        System.out.println("name: " + name + ",  email: " + email + ", age: " + age);
    }

    public static void printMember2(C04Person person) { // 객체의 주소값이 매개변수로 전달
        System.out.println("name: " + person.getName() + ",  email: " + person.getEmail() + ", age: " + person.getAge());
    }
}
