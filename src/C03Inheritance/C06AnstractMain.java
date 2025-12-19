package C03Inheritance;

import java.util.ArrayList;
import java.util.List;

public class C06AnstractMain {
    public static void main(String[] args) {
        // 추상클래스는 구현체가 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();
        AbstractDog d1 = new AbstractDog();
        d1.makeSound();
        d1.makeSound2();

        // interface는 모든 메서드가 추상(abstract)인 클래스
        // interface는 구현체가 없으므로 별도의 객체 생성이 불가하다
//        List<Integer> myList = new ArrayList<Integer>();

    }
}

// class 에 abstract method가 하나라도 있으면 이 class는 abstract class rk ehlrh,
// class 앞에 abstract 키워드가 붙음
abstract class AbstractAnimal {
     void makeSound() {
        System.out.println("동물은 소리를 냅니다");
    }
    // abstract(추상) method는 method를 선언만 하고 구현이 없다.
    // 해당 class를 상속받는 class에서 abstract method를 구현해야 한다
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal  {

    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }

}

// final 키워드를 통해 상속 불가능한 class로 변경 가능
final class FinalParents {

}