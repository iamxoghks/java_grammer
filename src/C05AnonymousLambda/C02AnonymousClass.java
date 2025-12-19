package C05AnonymousLambda;

// 익명 내부 클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
        AbstractAnimal aa = new AbstractAnimal() {
            @Override
            void makeSound() {
                System.out.println("머ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅇ 머ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅇ");
            }
        };
    }
}

abstract class AbstractAnimal {
    abstract void makeSound();

    void eat() {
        System.out.println("동물이 먹이를 먹습니다.");
    }
}

