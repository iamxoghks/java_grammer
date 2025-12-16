package C02MethodClass;

public class C04Person {
    // 객체 변수는 일반적으로 변수의 안정성을 위해 private 으로 함. 무조건.

    private String name;
    private String email;
    private int age;

    // setter, getter를 통해 외부에서 객체 변수에 접근 가능하게 함.
    // setter, getter는 외부 접근 가능하게 일반적으로 public.
    public void setName (String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String returnPersonalInfo() {
        return "이름은: " + this.name + "이고, 이메일은: " + this.email + ", 나이는: " + this.age;
    }

    // 객체 method 간의 호출은 문제 없음
    public void testMethod() {
        String temp = this.returnPersonalInfo();
    }

    // class method는 기본적으로 객체생성을 가정하지 않으므로,
    // class method내에서 객체 method를 호출하는 것은 불가능(논리적 모순)
//    public static testMethod2() {
//        String temp = this.returnPersonalInfo();
//    }
}
