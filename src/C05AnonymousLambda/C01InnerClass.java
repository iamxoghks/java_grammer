package C05AnonymousLambda;

// 내부클래스: 클래스 안에 클래스
// 1) static 내부 클래스
// 2) 익명 내부 클래스
public class C01InnerClass {
    public static void main(String[] args) {
        // static 내부 클래스를 활용한 객체 생성
        Member.MemberInnerClass mi = new Member.MemberInnerClass(20);
        System.out.println(mi.getB());

    }
}

class Member {
    private int a;

    public Member(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    // static 내부 클래스: Member의 static 변수처럼 활용
    static class MemberInnerClass {
        private int b;

        public MemberInnerClass(int b) {
            this.b = b;
        }

        public int getB() {
            return this.b;
        }
    }
}
