package C06EtcClass;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) {
//        String[] stArr = {"java", "python", "c++"};
//        stChange(stArr, 0, 1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr = {10, 20, 30};
//        intChange(intArr, 0 ,1);
//        System.out.println(Arrays.toString(intArr));
//
//        allChange(stArr, 0 ,1);
//        System.out.println(Arrays.toString(stArr));
//        allChange(intArr, 0 ,1);
//        System.out.println(Arrays.toString(intArr));


        // generic을 사용한 객체 생성
        GenericPerson<String> p1 = new  GenericPerson<>("hong1");
        GenericPerson<Integer> p2 = new  GenericPerson<>(1022);
        GenericPerson<Double> p3 = new  GenericPerson<>(120.210);
        GenericPerson<String[]> p4 = new  GenericPerson<>(new String[]{"awd", "qwf"});

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(Arrays.toString(p4.getValue()));

        // Generic example
        List<String> myList = new ArrayList<>();
        Stream<String> stream;
        Optional<Student> myStudent;
    }

    static void intChange(Integer[] intArr, int i, int j) {
        int temp =  intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }

    static void stChange(String[] stArr, int a, int b) {
        String temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    // Generic method는 반환타임 왼쪽에 <T>로 선언
    // 이때 T는 참조형 변수인 객체타입만을 허용 한다
    static <T> void allChange(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

// class 차원에 <T>가 있으면 객체에서는 <T> 까진 ㄴㄴ T만 써라
class GenericPerson<T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "value=" + value;
    }
}