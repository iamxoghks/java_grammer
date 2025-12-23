package C05AnonymousLambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OptionalDataException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) throws IOException {
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
//        int total = Arrays.stream(intArr).filter(a -> a > 30).map(a -> a *2).sum();
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
//        int totalLength = Arrays.stream(stArr).mapToInt(String::length).sum();
//        // 여기까지는 intStream으로 변환
//        int totalLength = Arrays.stream(stArr).mapToInt(a -> a.length())
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
//        int[] arr = {10, 20, 30, 40};
//        Arrays.stream(arr).forEach(System.out::println);
////        Arrays.stream(arr).forEach(a -> System.out.println(a)); // 더이상 stream이 아니라 .찍고 이어갈 수 없음
//        int total = Arrays.stream(arr).sum();
//        System.out.println(total);
//        long total2 = Arrays.stream(arr).count();
//        System.out.println(total2);
//        // optional객체: 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
//        // 값이 있다는 것을 무조건 확신할 때 getAsInt로 받을 수 있다
//        int max = Arrays.stream(arr).max().getAsInt(); // return type이 OptionalInt라서 getAsInt로 변환
//        System.out.println(max);
//        int min = Arrays.stream(arr).min().getAsInt(); // return type이 OptionalInt라서 getAsInt로 변환
//        System.out.println(min);
        // reduce: 누적 연산 -> reduce(초기값, 연산식)
//        int accSum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
////        lambda 식으로 바꾸면 아래랑 똑같음
////        int accSum = Arrays.stream(arr).reduce(0, Integer::sum);
//        System.out.println(accSum);
//        int accMultiply = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
//        System.out.println(accMultiply);
//        String[] atArr = {"java", "python", "c++"};
//        String result = Arrays.stream(atArr).reduce("", (a, b) -> a + b);
//        System.out.println(result);
//        // lambda 식으로 바꾸면 아래랑 똑같음
//        String result2 = Arrays.stream(atArr).reduce("", String::concat);
//        System.out.println(result2);
//        // findFirst: 첫번째 요소 반환
//        String firstValue = Arrays.stream(atArr).findFirst().get();
//        String firstValue2 = Arrays.stream(atArr).filter(a -> a.length() >= 5).findFirst().get();
//        System.out.println(firstValue);
//        System.out.println(firstValue2);

//        Map<String, Integer> map = new TreeMap<>();
//        map.put("java", 10);
//        map.put("python", 20);
//        map.put("c++", 30);
//        String firstValue3 = map.keySet().stream().findFirst().get();
//        System.out.println(firstValue3);

        // 배열로 변환시 주의사항
        // 주의 사항: 제네릭 타입소거 -> 자바의 런타임 시점에 <String>과 같은 제네릭의 타입이 제거되는 현상
//        String[] stArr = {"hello", "java", "world"};
//        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]);
//
//        // method 참조: 형식-"클래스명::메서드명", 조건-하나의 메서드만 호출하는 경우
//        Arrays.stream(stArr).forEach(System.out::println);
//        String[] answer2 = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(String[]::new);
//        System.out.println(Arrays.toString(answer2));

        // streamApi
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("kim", 20));
//        studentList.add(new Student("choi", 30));
//        studentList.add(new Student("lee", 35));
//        studentList.add(new Student("park", 22));
//
//        // 실습
//        // 1) 모든 객체의 평균 나이 (average)
//        double averageAge = studentList.stream().mapToInt(Student::getAge).average().getAsDouble();
//        System.out.println(averageAge);
//        // 2) 정렬을 통한 가장 나이 어린 사람 찾기(sorted + findFirst)
//        // 방법 1
//        Student student = studentList.stream().min(Comparator.comparingInt(Student::getAge)).get();
//        System.out.println(student);
//        // 방법 2
//        Student student2 = studentList.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get();
//        System.out.println(student2);
//        // 3) 30대인 사람들의 이름만 모아서 새로운 String에 담기( .map().getName() )
//        String[] newStudent = studentList.stream().filter(a -> a.getAge() >= 30).map(Student::getName).toArray(String[]::new);
//        System.out.println(Arrays.toString(newStudent));

        // Optional 객체: 특정 객체에 값이 없을(null)지도 모른다는 것을 명시적으로 표현한 객체
//        Optional<String> st1 = Optional.ofNullable(null);
//        if (st1.isPresent()) System.out.println(st1.get().length());
//        else System.out.println("is null");
        // 아래 애들은 따로 있음
//        OptionalInt;
//        OptionalDouble;
//        OptionalLong;
//        OptionalDataException;

        // Optional 객체 생성 방법
        // 1)
//        Optional<String> st1 = Optional.empty(); // 비어있는 optional 객체 생성
//        Optional<String> st2 = Optional.ofNullable(null); // 비어있는 Optional 객체 생성
//        Optional<String> st3 = Optional.ofNullable("hello"); // 값이 있는 Optional 객체 생성
//        Optional<String> st4 = Optional.of("hello"); // 값이 있는 Optional 객체 생성
//
////        Optional 객체 처리 방법
//        // 1) isPresent() -> get() => 정석
//        if(st1.isPresent()) System.out.println(st1.get());
//        else System.out.println("null");
//        // 2) orElse() : 값이 있으면 해당 값 출력, 없으면 지정된 값 출력
//        System.out.println(st1.orElse("java"));
//        System.out.println(st3.orElse("java"));
//        // 3) orElseGet(): 값이 있으면 있는 값 return, 없으면 lambda 함수 실행
//        System.out.println(st1.orElseGet(() -> new String("null")));
//        System.out.println(st1.orElseGet(() -> "null"));
//        // 4) orElseThrow() => 값이 없으면 강제로 에러를 일으킴. 가장 많이 씀
//        // 의도치 않은 에러 -> 지양해야할 에러
//        // System.out.println(st1.get());
//        // web 개발에서 값을 입력하는 사용자에게 적절한 메시지 전달 목적과 의도된 코드 중단을 목표로 강제로 예외 처리가 상식
//        System.out.println(st1.orElseThrow(() -> new NullPointerException("st1의 값이 없습니다.")));
//        System.out.println(st3.orElseThrow(() -> new NullPointerException("값이 없습니다.")));

        // Optional 객체 처리 실습
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("kim", 20));
//        studentList.add(new Student("choi", 30));
//        studentList.add(new Student("lee", 35));
//        studentList.add(new Student("park", 22));
//        OptionalDouble opAvgAge = studentList.stream().mapToInt(a -> a.getAge()).average();
        // 1) isPresent()
//        OptionalDouble opAvgAge = studentList.stream().mapToInt(Student::getAge).average();
//        if(opAvgAge.isPresent()) System.out.println(opAvgAge.getAsDouble());
//        else System.out.println("값이 없습니다.");
//        // 2) orElseThrow
//        double opAvgAge2 = studentList.stream().mapToInt(Student::getAge).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다."));
//        double opAvgAge2 = studentList.stream().mapToInt(a -> a.getAge()).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다."));
//        System.out.println(opAvgAge2);
//
//        System.out.println("조회하고자 하는 student의 index 번호를 입력해주세요");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int index = Integer.parseInt(br.readLine());
//
//        // null exception 없음
//        Student s1 = studentList.get(index);
//        System.out.println(s1);
//
//        if (studentList.size() <= index || index < 0) System.out.println("없는 index 입니다.");
//        else System.out.println(studentList.get(index));
//
//        //
//        Optional<Student> s2;
//        if (studentList.size() <= index || index < 0) s2 = Optional.empty();
//        else s2 = Optional.of(studentList.get(index));
//        //
//        System.out.println(s2.orElseThrow(() -> new NoSuchElementException("없는 회원입니다.")));



    }
}
