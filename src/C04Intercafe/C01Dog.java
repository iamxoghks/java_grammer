package C04Intercafe;

// interface 상속(구현)시 implements 사용
public class C01Dog implements C01AnimalInterface1 {

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}
