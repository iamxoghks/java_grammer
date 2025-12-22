package C05AnonymousLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//        int[] arr =  {20, 10, 4, 12};
//        // 전통적인 방식의 데이터 접근 방법: 메모리 주소 접근
//        for (int i : arr) {
//            System.out.println(i);
//        }

        // 함수형 프로그래밍 방식: 데이터와 객체 중심이 아닌, input에 따른 output(연산작업 포함)만 존재하는 코딩 스타일
        // 1) Arrays.stream(arr) -> arr의 사본을 만듬
        // 2) a 에 사본을 담음
        // 3) 사본을 직접 출력
        // streamApi: java에서 함수형 프로그래밍을 지원하는 library
        // forEach는 stream의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a)); // lambda 식
//        Arrays.stream(arr).forEach(System.out::println); // method 참조식

        // stream의 생성: .stream()

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("c++");
        Stream<String> stream1 =  myList.stream();
        String[] myArr = {"java", "python", "c++"};
        Stream<String> stream2 =  Arrays.stream(myArr);

        // 원시 자료형을 위한 stream 객체가 별도로 존재
        // return type에 intStream 이 따로 있음
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream stream3 = Arrays.stream(intArr);
//        LongStream, DoubleStream 도 따로 있음

        // stream 의 중계연산(변환)
        // filter, map, sorted, distinct, mapToInt
//        int[] intArr = {10, 20, 30, 40, 50};
//        // filter: 특정 기준으로 대상을 filtering(조작X) 하여 새로운 stream을 반환하는 중개연산
//        Arrays.stream(intArr).filter(a -> a > 30);
//        // 여기까지 stream. 중계연산은 여기까지 stream으로 return
//        // sum: stream의 연산을 하나씩 소모하여 총 합을 구하는 method
//        int total = Arrays.stream(intArr).filter(a -> a > 30).sum();
////        int total = Arrays.stream(intArr).filter(a -> a > 30).map(a -> a *2).sum();
//        System.out.println(total);
//        // map: 기존의 stream 을 조작하여 새로운 stream을 반환
//        int total2 = Arrays.stream(intArr).map(a -> a * a).sum();
//        System.out.println(total2);
//        // distinct: 중복 제거
//        int total3 = Arrays.stream(intArr).distinct().sum();
//        System.out.println(total3);
//        // sorted: 정렬
//        int[] sortedArr = Arrays.stream(intArr).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArr));
//        // mapToInt: intStream 형태로 변환해주는 map
//        String[] stArr = {"java", "python", "c++"};
//        // 또는
////        int totalLength = Arrays.stream(stArr).mapToInt(String::length).sum();
//        // 여기까지는 intStream으로 변환
////        int totalLength = Arrays.stream(stArr).mapToInt(a -> a.length())
//        int totalLength = Arrays.stream(stArr).mapToInt(a -> a.length()).sum();
//        System.out.println(totalLength);

        // 실습
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        // 1) 홀수만 담은 배열을 생성 후 배열 출력 // filter -> intStream return
//        int[] newArr = Arrays.stream(arr).filter(a -> a%2 != 0).toArray();
//        System.out.println(Arrays.toString(newArr));
//        // 2) 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 출력 map -> toArray
//        int[] newArr2 = Arrays.stream(arr).filter(a -> a%2 != 0).map(a -> a*a).toArray();
//        System.out.println(Arrays.toString(newArr2));
//        // 3) 홀수만 걸러 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열 출력 -> .sorted
//        int[] newArr3 = Arrays.stream(arr).filter(a -> a%2 != 0).map(a -> a*a).sorted().toArray();
//        System.out.println(Arrays.toString(newArr3));



        // stream의 소모
        // forEach, sum, count, max, min, reduce(누적연산), findFirst(stream 첫 번째 값 return)
        int[] arr = {10, 20, 30, 40};
        Arrays.stream(arr).forEach(System.out::println);
//        Arrays.stream(arr).forEach(a -> System.out.println(a)); // 더이상 stream이 아니라 .찍고 이어갈 수 없음
        int total = Arrays.stream(arr).sum();
        System.out.println(total);
        long total2 = Arrays.stream(arr).count();
        System.out.println(total2);
        // optional객체: 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
        // 값이 있다는 것을 무조건 확신할 때 getAsInt로 받을 수 있다
        int max = Arrays.stream(arr).max().getAsInt(); // return type이 OptionalInt라서 getAsInt로 변환
        System.out.println(max);
        int min = Arrays.stream(arr).min().getAsInt(); // return type이 OptionalInt라서 getAsInt로 변환
        System.out.println(min);
        // 값이 있다는 것을 확신 못 할 때
//        int max2 = Arrays.stream(arr).max().orElseGet();
//        System.out.println(max2);


    }
}
