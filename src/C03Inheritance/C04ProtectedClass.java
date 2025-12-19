package C03Inheritance;

// class 에는 public, default 접근 제어자만 존재 가능
public class C04ProtectedClass {
//    변수, 메서드에는 4가지 접근제어자가 존재;
//    public: 프로젝트 전체에서 접근 가능(다른 패키지에서도 접근 가능)
//    private: 클래스 내에서만 접근 가능
//    default: 같은 패키지 내에서만 접근 가능
//    protected: 다른 패키지도 상속 관계면 접근 가능
    public String st1 = "hello java1";
    private String st2 = "hello java2";
//    default String st3 = "hello java3";
    protected String st4 = "hello java4";
    public static void main(String[] args) {


    }
}
