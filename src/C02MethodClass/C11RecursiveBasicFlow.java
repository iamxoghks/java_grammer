package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasicFlow {
    public static void main(String[] args) {
//        recur(0, 3);
//        recur1(0, 3);
        recur2(new ArrayList<>(), 0, 3);
        recur3(new ArrayList<>(), 0, 5);
    }

    public static void recur(int counter, int target) {
        if(counter == target) return;
        System.out.println("before call recursive counter = " + counter);
        recur(counter+1,  target);
        System.out.println("after call recursive counter = " + counter);
    }

    public static void recur1(int counter, int target) {
        if(counter == target) return;
        System.out.println("before call recursive counter = " + counter);
        counter++;
        recur1(counter, target);
        System.out.println("after call recursive counter = " + counter);
    }


    public static void recur2(List<Integer> myList, int counter, int target) {
        if(counter == target) return; // 1 // 6 // 11
        // if(myList.size() == target) return;
        System.out.println("before call recursive counter = " + counter);// 2 // 7 // 12
        System.out.println("before call recursive counter = " + myList.toString()); // 3 //8 // 13
        myList.add(counter); // 4 // 9 // 14
        recur2(myList, counter+1, target); //5 // 10 // 15
        System.out.println("after call recursive counter = " + counter); // 16 // 18 // 20
        System.out.println("after call recursive counter = " + myList.toString()); // 17 // 19 // 21
    }

    public static void recur3(List<Integer> myList, int counter, int target) {
        if(counter == target) return;
        // if(myList.size() == target) return;
        System.out.println("before call recursive counter = " + counter);
        System.out.println("before call recursive counter = " + myList.toString());
        recur2(myList, counter+1, target);
        myList.add(counter);
        System.out.println("after call recursive counter = " + counter);
        System.out.println("after call recursive counter = " + myList.toString());
    }



}
