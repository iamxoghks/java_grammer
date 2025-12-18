package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

// 재귀함수 활용 대표적인 알고리즘
// backtracking, dfs || 분할 정복
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {

        // for 의 반복 횟수 || 개수는 동적으로 결정되지 않고 정적으로 정해서 쓰임
//        for(int n = 0; n < 3; n++){
//            for(int i = 0; i < 3; i++){
//                System.out.println("h w!");
//            }
//        }

        // 재귀함수는 동적으로 반복 회수 결정 가능 -> !
//        recurfor(3);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
        // 숫자 1,2,3,4 를 가지고 만들 수 있는 2개짜리 숫자 조합을 출력

//        List<List<Integer>> myList2 = new ArrayList<>();
//        for(int i = 0; i < myList.size(); i++){
//            for(int j = i+1; j < myList.size(); j++){
//                myList2.add(List.of(myList.get(i), myList.get(j)));
//            }
//        }
//        // 숫자 조합을 2중 List에 담아 출력
//        System.out.println(myList2);

        // 재귀함수로 List<List<Integer>>
//        List<List<Integer>> myList3 = new ArrayList<>();
//        List<Integer> myList2 = new ArrayList<>();
//        for(int i = 0; i < myList.size(); i++){
//            myList2.add(myList.get(i));
//            for(int j = i+1; j < myList.size(); j++){
//                myList2.add(myList.get(j));
//                myList3.add(new ArrayList<>(myList2));
//                myList2.remove(myList2.size()-1);
//            }
//            myList2.remove(myList2.size()-1);
//        }
//        System.out.println(myList3);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> doubleList = new ArrayList<>();
//        Combination(new ArrayList<>(), myList, 0, 2, doubleList);
//        System.out.println(doubleList);

        // permu

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//
//        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> temp =  new ArrayList<>();
//        boolean[] visited = new boolean[myList.size()];
//        for(int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            visited[i] = true;
//            for(int j = 0; j < myList.size(); j++) {
//                if(visited[j]) continue;
//                temp.add(myList.get(j));
//                visited[j] = true;
//                doubleList.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//                visited[j] = false;
//
//            }
//            temp.remove(temp.size()-1);
//            visited[i] = false;
//        }
//
//        System.out.println(doubleList);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//
//        List<List<Integer>> doubleList = new ArrayList<>();
//        permu(new ArrayList<>(), myList, 2, doubleList, new boolean[myList.size()]);
//        System.out.println(doubleList);


        // 백준 15649(N과 M), 6603(로또)



        // self! combi
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//
//        List<List<Integer>> doubleList = new ArrayList<>();
//        combi(doubleList, new ArrayList<>(), myList, 0, 2);
//        System.out.println(doubleList);


        // self permu
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        List<List<Integer>> doubleList = new ArrayList<>();
        permu(doubleList, new ArrayList<>(), myList, 2, new boolean[myList.size()]);
        System.out.println(doubleList);

    }

//    public static void recurfor(int target) {
//        if(target == 0) {
//            System.out.println("hello world!");
//            return;
//        }
//        for (int i = 0 ; i < 3; i++) {
////            System.out.println("hello world!"); // 여기서 실행하면  3^n 형식이 아님
//            recurfor(target-1);
//        }
//    }
//
//    public static void Combination(List<Integer> tempList, List<Integer> myList, int start, int target, List<List<Integer>> doubleList) {
//        if(tempList.size() == target) {
//            doubleList.add(new ArrayList<>(tempList));
//            return;
//        }
//        for(int i = start; i < myList.size(); i++){
//            tempList.add(myList.get(i));
//            Combination(tempList, myList, i+1, target, doubleList);
//            tempList.remove(tempList.size()-1);
//        }
//
//    }
//
//    public static void permu(List<Integer> tempList, List<Integer> myList, int target, List<List<Integer>> doubleList,boolean[] visited) {
//        if(tempList.size() == target) {
//            doubleList.add(new ArrayList<>(tempList));
//            return;
//        }
//        for(int i = 0; i < myList.size(); i++){
//            if(visited[i]) continue;
//            tempList.add(myList.get(i));
//            visited[i] = true;
//            permu(tempList, myList, target, doubleList, visited);
//            tempList.remove(tempList.size()-1);
//            visited[i] = false;
//        }
//    }

    public static void permu(List<List<Integer>> doubleList, List<Integer> tempList, List<Integer> myList, int target, boolean[] visited) {
        if(tempList.size() == target) {
            doubleList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 0; i < myList.size(); i++) {
            if(visited[i]) continue;
            tempList.add(myList.get(i));
            visited[i] = true;
            permu(doubleList, tempList, myList, target, visited);
            tempList.remove(tempList.size() - 1);
            visited[i] = false;
        }
    }





}
