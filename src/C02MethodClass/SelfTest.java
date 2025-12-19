package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class SelfTest {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        List<List<Integer>> doubleList = new ArrayList<>();
        combination(doubleList, new ArrayList<>(), myList, 0, 2);
        System.out.println(doubleList);


        List<Integer> myList2 = new ArrayList<>();
        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        myList2.add(4);

        List<List<Integer>> doubleList2 = new ArrayList<>();
        permu(doubleList2, new ArrayList<>(), myList2, 2, new boolean[myList.size()]);
        System.out.println(doubleList2);

    }

    public static void combination(List<List<Integer>> doubleList, List<Integer> tempList, List<Integer> myList, int start, int end) {
        if(tempList.size() == end) {
            doubleList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = start; i < myList.size(); i++) {
            tempList.add(myList.get(i));
            combination(doubleList, tempList, myList, i+1, end);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void permu(List<List<Integer>> doubleList2, List<Integer> tempList2, List<Integer> myList2, int end2, boolean[] visited) {
        if(tempList2.size() == end2) {
            doubleList2.add(new ArrayList<>(tempList2));
            return;
        }
        for(int i = 0; i < myList2.size(); i++) {
            if(visited[i]) continue;
            visited[i] = true;
            tempList2.add(myList2.get(i));
            permu(doubleList2, tempList2, myList2, end2, visited);
            visited[i] = false;
            tempList2.remove(tempList2.size() - 1);
        }
    }
}
