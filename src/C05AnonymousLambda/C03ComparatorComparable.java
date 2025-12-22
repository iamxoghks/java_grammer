package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
        // java에서는 비교를 위한 interface 대표적으로 2가지 제공
        // 1) Comparator interface: interface 내에 compareTo method만 존재
        // 2) Comparable interface: interface 내에 compare method만 존재
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(20);
//        myList.add(10);
//        myList.add(30);
//        // java의 대부분의 정렬 함수는 매개변수로 Comparator 요구
//        myList.sort(Comparator.naturalOrder());
////        o1, o2의 숫자값을 마이너스 형식으로 코딩을 하되, o1이 먼저 있으면 오름차순, o2가 먼저 있으면 내림차순
//        // 아래 두 sort가 동일
//        myList.sort((o1, o2) -> o1-o2);
//        myList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("c++");
//
//        // 기본적인 문자열 정렬일 때에는 Comparator 커스텀을 하지 않고,
//        // 복잡한 자신만의 정렬 기준을 해야할 때 Comparator 익명 객체 생성!
//        Collections.sort(myList2, (o1, o2) -> o1.compareTo(o2));
//        Collections.sort(myList2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // o1 이 먼저 있으면 오름차순
//                return o1.compareTo(o2);
//            }
//        });
//
//        Collections.sort(myList2, (o1, o2) -> o1.length() - o2.length());
//        Collections.sort(myList2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // o1 이 먼저 있으면 오름차순
//                return o1.length() - o2.length();
//            }
//        });
//
//        // 문자열 길이로 정렬하되, 문자열의 길이가 같은 경우에는 알파벳 순으로 정렬
//        Collections.sort(myList2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() == o2.length()) return o1.compareTo(o2);
//                else return o1.length() - o2.length();
//            }
//        });
//
//
//        // 백준: 단어정렬
//
//
//        // 배열, 리스트 정렬 외에 java의 그 외 자료정렬 구조
//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());
//        Set<String> treeSet = new TreeSet<>((o1, o2) -> o1.length() - o2.length());

        // 백준: 최대 힙

        // 백준: 선긋기


        // 리스트 안의 배열 정렬
//        [{4, 5}, {1, 2}, {5, 0}, {3, 1}]
        // list 배열에 1번째 index를 기준으로 오름차순 정렬
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4, 5});
//        myList.add(new int[]{1, 2});
//        myList.add(new int[]{5, 0});
//        myList.add(new int[]{3, 1});
//
//        myList.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
//
//        for (int[] ints : myList) {
//            System.out.println(Arrays.toString(ints));
//        }
//        System.out.println(Arrays.deepToString(myList.toArray()));


        // 직접 만든 객체를 정렬
        List<Student> sList = new ArrayList<>();
        sList.add(new Student("Kim", 34));
        sList.add(new Student("Hwang", 33));
        sList.add(new Student("Kim2", 20));
        sList.add(new Student("Hwang2", 22));

        // 1. Comparator 를 구현한 익명객체 방식
//        sList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
////                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(sList);

        // 2. Comparable 을 구현한 방식
        // Student 객체 안에 Comparable implements 하는 방식
        // sort 실행시 자동으로 student 안에 있는 compareTo 실행
        Collections.sort(sList);
        System.out.println(sList);

    }
}

class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", age: " + age + "}";
    }

    // Comparable compareTo 에서는 this와 매개변수로 주어지는 객체와 비교
    // this가 앞에 있으면 오름차순, 매개변수객체가 앞에 있으면 내림차순
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}