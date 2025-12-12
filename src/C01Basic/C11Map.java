package C01Basic;

import java.sql.Time;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C11Map {
    public static void main(String[] args) {
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

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 100);
        map2.put("b", 200);
        map2.put("c", 300);
        map2.put("d", 400);

        System.out.println(map2);
        System.out.println(map2.get("a"));
        System.out.println(map2.values());


    }
}
