package C04Intercafe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();

        C01Dog d1 = new C01Dog();
        d1.makeSound();

        // interface 특징
        // 1) 다형성: 하나의 부모타입으로 여러 자식객체를 다룰 수 있음
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makeSound();
        C01AnimalInterface1 d2 = new C01Dog();
        d2.makeSound();
        // 다형성의 장점
        // 기존의 구현체(ex-ArrayList)를 다른 구현체(ex-LinkedList)로 변경시 용이
//        List<Integer> myList = new ArrayList<>();
        List<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(20);
        myList.add(0);

        // 2) 다중구현(상속) 가능
        C01AnimalInterface1 c3 = new C01Cat();
        // c3 는 makeSound() 만 있다
        c3.makeSound();
        C01AnimalInterface2 c4 = new C01Cat();
        // c4 는 eat() 만 있다
        c4.eat("chicken");
        // 다중구현의 예시 - List & Queue
        List<Integer> myList2 = new LinkedList<>(); // LinkedList를 쓰지만 List로 쓴다.
//        myList2.get(0); 사용 가능
        Queue<Integer> myQueue = new LinkedList<>(); // LinkedList를 쓰지만 Queue로 쓴다.
//        myQueue.get(0); 사용 불가능

    }
}
