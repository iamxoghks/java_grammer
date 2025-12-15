package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C11Map {
    public static void main(String[] args) throws IOException {
        // map 은 key : value 로 이루어진 자료구조
//        Map<String, Integer> map = new HashMap<>();
//        map.put("축구", 2);
//        map.put("배구", 3);
//        map.put("필라테스", 3);
//        map.put("농구", 3);

        // map 의 key 에는 순서가 없음
//        System.out.println(map);
//        {농구=3, 배구=3, 필라테스=3, 축구=2}


        // 특징: map에서 key값을 통한 검색 복잡도는 0(1)
        //
//        System.out.println(map.get("필라테스"));

        // map의 전체 데이터 value 출력
        // map의 key값 접근시에 index 개념 사용 불가능 -> 순서가 없으니까
        // keySet() : map의 전체 key 목록을 반환하는 method
//        Set<String> keys = map.keySet();

//        System.out.println(map.keySet());
//        System.out.println(keys);

//        for(String key : keys) {
//            System.out.println(key + " : " + map.get(key));
//            System.out.println("key: " + key + ", value: " + map.get(key));
//        }

//        for(String key : map.keySet()) {
//            System.out.println("key: " + key + ", value: " + map.get(key));
//        }

        // vaules() : map 의 전체 value 목록 반환: 잘 안 씀
//        System.out.println(map.values());
//        for(int a : map.values()) {
//            System.out.println("values: " + a);
//        }

//        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put("a", 100);
//        map2.put("b", 200);
//        map2.put("c", 300);
//        map2.put("d", 400);
//
//        System.out.println(map2);
//        System.out.println(map2.get("a"));
//        System.out.println(map2.values());







        // LinkedHashMap : 데이터의 입력 시간순 정렬
//        Map<String, Integer> myMap = new LinkedHashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//
//        for(String a : myMap.keySet()) {
//            System.out.println(myMap.get(a));
//        }

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("야구", 2);
        myMap.put("축구", 3);
        myMap.put("농구", 2);
        // iterator를 활용한 출력
        Iterator<String> it = myMap.keySet().iterator();
        // StringTokeinzer와 비슷한 개념? nextToken()
        // next method는 데이터를 하나씩 소모시키면서 값을 반환한다.
//        System.out.println(it.next());
        // hasNext method는 iterator 안에 그 당므 값이 있는지 없는지 boolean 리턴
//        System.out.println(it.hasNext());
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String s : myMap.keySet()){
            System.out.println(s);
        }
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
