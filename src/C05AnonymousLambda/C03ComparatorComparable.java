package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
        // java에서는 비교를 위한 interface 대표적으로 2가지 제공
        // 1) Comparator interface: interface 내에 compareTo method만 존재
        // 2) Comparable interface: interface 내에 compare method만 존재

        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(10);
        myList.add(30);
        // java의 대부분의 정렬 함수는 매개변수로 Comparator 요구
        myList.sort(Comparator.naturalOrder());
//        o1, o2의 숫자값을 마이너스 형식으로 코딩을 하되, o1이 먼저 있으면 오름차순, o2가 먼저 있으면 내림차순
        // 아래 두 sort가 동일
        myList.sort((o1, o2) -> o1-o2);
        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        List<String> myList2 = new ArrayList<>();
        myList2.add("java");
        myList2.add("python");
        myList2.add("c++");

        // 기본적인 문자열 정렬일 때에는 Comparator 커스텀을 하지 않고,
        // 복잡한 자신만의 정렬 기준을 해야할 때 Comparator 익명 객체 생성!
        Collections.sort(myList2, (o1, o2) -> o1.compareTo(o2));
        Collections.sort(myList2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 이 먼저 있으면 오름차순
                return o1.compareTo(o2);
            }
        });

        Collections.sort(myList2, (o1, o2) -> o1.length() - o2.length());
        Collections.sort(myList2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 이 먼저 있으면 오름차순
                return o1.length() - o2.length();
            }
        });

        // 문자열 길이로 정렬하되, 문자열의 길이가 같은 경우에는 알파벳 순으로 정렬
        Collections.sort(myList2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });


        // 백준: 단어정렬


        // 배열, 리스트 정렬 외에 java의 그 외 자료정렬 구조
        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());
        Set<String> treeSet = new TreeSet<>((o1, o2) -> o1.length() - o2.length());

        // 백준: 최대 힙

        // 백준: 선긋기





    }
}
