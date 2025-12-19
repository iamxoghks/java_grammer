package C04Intercafe;

// interface 상속(구현)시 implements 사용
// interface의 다중 상속은 허용
public class C01Cat implements C01AnimalInterface1, C01AnimalInterface2{

    @Override
    public void makeSound() {
        System.out.println("야용야용");
    }

    @Override
    public void eat(String food) {
        System.out.println(food + "츄르 츄릅");
    }
}
