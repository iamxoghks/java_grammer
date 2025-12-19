package C03Inheritance;

//  default: 같은 패키지 내에서 접근 가능
//  protected: 다른 패키지 내에서라도 상속 관계면 접근 가능
//  open 순서
//  public > protected  > default > private
public class C03AnimalMain extends Animal{

    public static void main(String[] args) {
        C03AnimalMain animalMain = new C03AnimalMain();
        animalMain.sound();

        Dog dog = new Dog();
        dog.sound2();
        // 부모클래스의 타입으로 지정시, 부모클래스에서 정의된 메서드만 객체에서 사용 가능
//        dog.sound3();

        Cat cat = new Cat();
        cat.sound3();

        Animal d2 = new Dog();
        // 상속관계일 때는 부모클래스의 타입을 자식클래스의 객체 타입으로 지정 가능
    }

}

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("멍 멍");
    }
    public void sound2() {
        System.out.println("wuff wuff");
    }
}

class Cat extends Animal {
    public void sound3() {
        System.out.println("meow");
    }
}
