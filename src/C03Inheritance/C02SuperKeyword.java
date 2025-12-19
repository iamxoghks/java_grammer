package C03Inheritance;

// 부모클래스를 상속받을때, 자식객체의 생성자에서는 부모객체를 자동으로 생성
// 이때, 부모클래스에 기본생성자 없으면 자식클래스에서 error
public class C02SuperKeyword extends SuperParents{
    int a = 20;

    public C02SuperKeyword(){
        super(10);
        this.a = 20;
    }
    public static void main(String[] args) {
        C02SuperKeyword c1 = new C02SuperKeyword();
        System.out.println(c1.a);
        c1.display();
    }

    public void display() {
        System.out.println("child 변수: " + this.a);
        // 부모의 변수나 메서드에 접글할 때에는 super 사용
        System.out.println("parent 변수: " + super.a);
    }
}

class SuperParents {
    int a = 20;
    public SuperParents(int a) {
        this.a = a;
    }
}