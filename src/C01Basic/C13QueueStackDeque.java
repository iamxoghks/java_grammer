package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) {

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

////        while 문을 총한 Queue 출력 방식
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
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);

        while(!pq.isEmpty()) {
            // poll 할때마다 최소값을 추출하게 되고 복잡도 log(n)
            // peek은 최소값을 
            // 전체 데이터를 모두 poll 하면 복잡도 n*log(n)
            System.out.println(pq.poll());
        }


    }
}
