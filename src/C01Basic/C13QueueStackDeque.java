package C01Basic;

import java.io.IOException;
import java.util.*;

public class C13QueueStackDeque {
    public static void main(String[] args) throws IOException {

//        ArrayList = List | add 최적화, 앞에서 remove(성능저하)
    //        index를 가지고 있음
//        장점: 조회성능 빠름;
//        단점: 중간값 삭제 remove 성증 저하
//        LinkedList = Queue | add 최적화, 앞에서 remove 최적화
    //        index가 없음
//        특정 자료의 앞,뒤에 어떤 자료가 있는지만 알고 있음
//        장점: 맨 앞의 값 삭제 성능 빠름
//        단점: 조회 성능 저하

        // Queue interface를 linked list를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//
//        // poll은 queue 에서 가장 앞에 있는 데이터를 뽑아(삭제)내면서 해당 데이터를 출력함
//        int value = myQue.poll();
//        System.out.println(value); // 10
//        System.out.println(myQue); // [20, 30]
//
//        // peek 은 Queue에서 가장 앞에 있는 데이터를 삭제하지 않고 해당 데이터를 출력
//        int value2 = myQue.peek();
//        System.out.println(value2); // 20
//        System.out.println(myQue); // [20, 30]

//        while 문을 통한 Queue 출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("a");
//        printerQueue.add("b");
//        printerQueue.add("c");
//        printerQueue.add("d");
//        printerQueue.add("e");
//        // Queue는 일반적으로 while문을 통해 요소를 소모
//
//        while(!printerQueue.isEmpty()) {
//            System.out.println(printerQueue.poll());
//        }

        // LinkedList의 ArraysList 성능차이 비교
//        ArrayList
//          장점: 조회 성능 빠름
//          단점: remove(0) 성능 저하 = 중간 삽입/삭제 성능 저하
//        LinkedList
//          장점: remove(0) 성능 빠름  = 중간 삽입/삭제 성능 빠름
//          단점: 조회 성능 저하

//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 10000000; i++) {
//            myLinkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList add time:  " +  (endTime - startTime));
//
//
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        long startTime1 = System.currentTimeMillis();
//        for(int i = 0; i < 10000000; i++) {
//            myArrayList.add(0, i);
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("ArrayList add time:  " + (endTime1 - startTime1));

        // 관련 문제: 가드2, 요세푸스 문제 0

        // 길이 제한 큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.offer("a");
//        blockingQueue.offer("b");
//        blockingQueue.offer("c");
//        blockingQueue.offer("d");
//        blockingQueue.offer("e");
//        System.out.println(blockingQueue);
//
//        // add를 하면 error | offer를 해야함.
//        Queue<String> blockingQueue2 = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("a");
//        blockingQueue.add("b");
//        blockingQueue.add("c");
//        blockingQueue.add("d");
//        System.out.println(blockingQueue2);

        // 우선순위 큐: 데이터를 poll 할 때 정렬된 데이터결과값(최소값/최대값) 보장
        // 일단 데이터를 다 넣어놓고 정렬해야 하는 상황 -> 리스트
        // 지속적으로 데이터가 추가/제거 되면서 전체 데이터가 실시간으로 변경되는 상황에 사용
        // pq에서 데이터 하나 poll() => log(n)
        // pq에서 전체 데이터를 모두 poll => n*log(n)
        // list에서 전체 데이터를 정렬 => n*log(n)
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);

//
//        while(!pq.isEmpty()) {
//            // poll 할때마다 최소값을 추출하게 되고 복잡도 log(n)
//            // peek은 최소값을
//            // 전체 데이터를 모두 poll 하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }

        // 카드2, 요세푸스 문제 0
//        백준: 최소힙
//        프로그래머스: 더 맵게

//        Queue<Integer> pq = new PriorityQueue<>();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        for(int i = 0; i < n; i++) {
//            int x = Integer.parseInt(br.readLine());
//            if(x == 0) {
//                if(pq.isEmpty()) {
//                    sb.append(0).append("\n");
//                } else {
//                    sb.append(pq.poll()).append("\n");
//                }
//            }  else {
//                pq.add(x);
//            }
//
//        }
//        System.out.println(sb);


        // 최대힙: poll 할 때마다 최대값 추출
//        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        // LikedList -> 앞의 값을 빼서 뒤에다 넣을 때 성능 좋음
        // PriorityQueue -> 꺼낼 때 최소값, 최대값을 보장해준다!!!!!!

        // Stack 후입 선출의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); // 마지막 입력값 꺼내기(stack에서 빼고 출력)
//        System.out.println(myStack.peek()); // 마지막 입력 값 확인


        // 프로그래머스: 올바른 괄호

//        1. Stack 만든다.
//        2. String에서 한 글자씩 가져와서 Stack에 넣는다.
//        3. 넣을 때 Stack이 비어있거나 같은 것이면 push 다른 것이면 pop.
//        4. 결과적으로 Stack이 비어있으면 true, 아니면 false

//        String s = "()()()()()()";
//        boolean answer = true;
//
//        Stack<String> myStack = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c == '(') {
//                myStack.push(String.valueOf(c));
//            } else {
//                if(myStack.isEmpty()) {
//                    answer = false;
//                    break;
//                }
//                myStack.pop();
//            }
//        }
//
//        System.out.println(answer);

//        // 프로그래머스: 같은 숫자는 싫어
//
//        public class Solution {
//            public int[] solution(int []arr) {
//                Stack<Integer> myStack = new Stack<>();
//                for(int i = 0; i < arr.length; i++) {
//                    if(myStack.isEmpty() || !myStack.peek().equals(arr[i])) {
//                        myStack.push(arr[i]);
//                    }
//                }
//
//                int[] answer = new int[myStack.size()];
//                for(int i = 0; i < answer.length; i++) {
//                    answer[i] = myStack.get(i);
//                }
//
//                return answer;
//            }
//        }


//        방법 2
//            import java.util.ArrayDeque;
//            import java.util.Deque;
//
//        class Solution {
//            public int[] solution(int[] arr) {
//                Deque<Integer> st = new ArrayDeque<>(arr.length);
//
//                for (int x : arr) {
//                    if (st.isEmpty() || st.peekLast() != x) { // 마지막과 비교
//                        st.addLast(x); // push
//                    }
//                }
//
//                int[] answer = new int[st.size()];
//                int i = 0;
//                for (int v : st) {           // 아래에서 위로(입력 순서 그대로)
//                    answer[i++] = v;
//                }
//                return answer;
//            }
//        }




//        Deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(30);

        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());


//        Queue
//        1) LinkedList - FIFO
//        2) PriorityQueue - Heap

//        Stack - LIFO, 마지막 값과 지금 집어넣으려고 하는 값 비교
//
//        Deque -

    }
}
