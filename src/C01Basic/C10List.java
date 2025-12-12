package C01Basic;

import java.util.*;

public class C10List {
    public static void main(String[] args) {
        // List 선언 방법
        // 클래스명 변수명 = new 클래스명();
//        ArrayList<String> myList = new ArrayList<>();
//        ArrayList<String> myList2 = new ArrayList<String>();
//
//        // List 선언 방법2: 가장 일반적인 방법
//        ArrayList<String> myList3 = new ArrayList<>();
//
//        // 초기값 세팅
//        myList3.add("a");
//        myList3.add("b");
//        myList3.add("c");
//        myList3.add("d");
//
//        System.out.println(myList3);


        // 초기값 세팅 2: 배열을 리스트로 전환
//        String[] arr = {"java", "C", "Go"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        // List 출력
//        // 왜 출력이 될까?
//        // List등의 collection framework(Arrays. 등)안에는 toString 메서드가 구현되어 있다
//        System.out.println(myList4);

        // add: List에 값을 하나씩 추가하는 method
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        // 아래처럼 할 수는 있지만 하면 안 됨.
//        // list는 중간 위치 데이터를 삽입/삭제하는 작업에 비효율적
//        myList.add(0, 30);
//        System.out.println(myList);
//
//        // get(index): 특정 index의 요소 반환
//        System.out.println(myList.get(0));
//
//        // size: List의 길이.갯수 반환
//        System.out.println(myList.size());
//        System.out.println(myList.toArray().length);
//
//        // list 값 출력 for
//        for(int i = 0; i < myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//        // list 값 출력 Enhanced for
//        for(int a : myList){
//            System.out.println(a);
//        }

        // remove: 값 삭제
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(1);
//        list.remove(list.size()-1);
//        System.out.println(list);
//
//        // indexOf: 특정값을 찾아 index return(가장 먼저 나오는 것)
//        // for 문 돌려서 찾아도 됨
//        System.out.println(list.indexOf(1));
//
//        // contains: 값이 있는지 없는지 찾는 것
//        list.add(20);
//        System.out.println(list.contains(20));

        // 프로그래머스 n의 배수 고르기
//        int[] answer = new int[myList.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = myList.get(i);
//        }

        // 정렬
        // 1) Collections class -> sort method
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//        Collections.sort(myList); // 오름차순 정렬
//        Collections.sort(myList, Collections.reverseOrder()); // 내림차순
//        Collections.reverse(myList);
//        // 2) 객체의 sort method
//        myList.sort(Collections.reverseOrder()); // 내림차순
//        myList.sort(Comparator.reverseOrder()); // 내림차순
//        myList.sort(Comparator.naturalOrder()); // 오름차순

        // 이중 리스트: 리스트 in 리스트
        // [[1,2,3], [4,5,6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> m1 = new ArrayList<>();
//        myList.add(m1);
//        myList.add(new ArrayList<>());
//        m1.add(1);
//        m1.add(2);
//        m1.add(3);
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);
//        System.out.println(myList.get(0));
//        System.out.println(myList.get(1));
//        System.out.println(myList);
//        System.out.println(myList.get(0).get(0));

        // [[1,2,3,], [4,5,6], [7,8,9], ...., [58, 59, 60]]
//        List<List<Integer>> myList = new ArrayList<>();
//        int count = 1;
//        for(int i = 0; i < 20; i++) {
//            myList.add(new ArrayList<>());
//            for(int j = 0; j < 3; j++) {
//                myList.get(i).add(count);
//                count++;
//            }
//        }
//
//        System.out.println(myList);

        // 배열 in list 여러 방법들
//        List<int[]>  list = new ArrayList<>();
//
//        list.add(new int[]{10, 20});
//        list.add(new int[]{1, 2, 3});
//        list.add(new int[]{4, 3, 2, 1});
//
//        for (int[] a : list) {
//            System.out.println(Arrays.toString(a));
//        }

//        List<int[]>  list = new ArrayList<>();
//        int[] arr = new int[2];
//        arr[0] = 10;
//        arr[1] = 20;
//        list.add(arr);
//        list.add(new int[3]);
//        list.get(1)[0]=1;
//        list.get(1)[1]=2;
//        list.get(1)[2]=3;
//        list.add(new int[]{4, 3, 2, 1});

    }
}
