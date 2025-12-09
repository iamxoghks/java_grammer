package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C06LoopStatementAdvance {
    public static void main(String[] args) throws IOException {
        // 1~20까지 수 중 짝수의 총합
//        int sum = 0;
//        for(int i = 1; i < 21; i++) {
//            if(i % 2 == 0) sum += i;
//        }
//        System.out.println(sum);

        // 두 수의 최대 공약수 구하기
//        int a = 24, b = 36;
//        int minimum = Math.min(a, b);
//        int answer = 0;
////        for(int i = 1; i < minimum + 1 ; i++) {
////            if(a%i==0&&b%i==0) {
////                answer = i;
////            }
////        }
////        System.out.println(answer);
//
//        for(int i = minimum; i > 0; i--) {
//            if (a % i == 0 && b % i == 0) {
//                answer = i;
//            }
//        }
//        System.out.println(answer);

        // 소수인지 여부 판별. 소수란 1과 자신을 제외한 숫자로 나누어지지 않는 1보다 큰 수

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        for(int i = 2; i < a; i++) {
//            if(a % i == 0) {
//                System.out.println("sosu");
//                break;
//            } else {
//                System.out.println("nope");
//                break;
//            }
//        }
//        boolean b = false;
//        //for(int i = 2; i*i <= a; i++) {
//        for(int i = 2; i <= Math.sqrt(a); i++) {
//            if(a % i == 0) {
//                b = true;
//                break;
//            }
//        }
//        System.out.println(b ?  "No sosu" : "Yes sosu");

//        int[] arr = {1, 3, 5, 7};
//        // 일반 for 문을 통한 배열 접근 방식
////        for(int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//
//        // Enhanced for 문을 통한 배열 접근 방식
////        for(int a : arr) {
////            System.out.println(a);
////        }
//
//        // 일반 for문을 통한 arr에 저장된 값 변경
//        for(int i = 0; i < arr.length; i++){
//            arr[i] += 10;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        // Enhanced for 는 arr의 저장된 값 변경 -> 원본의 값 변경 불가
//        // 참조형 변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
//        그래서 내장된 메서드를 통해 힙메모리 안에 있는 개체값을 보기 좋게 출력할 수 있다
//        for(int a : arr) {
//            a -= 10;
//        }

        // 스택: 기본형 변수, 참조형 변수의 힙메모리주소값
        // 힙: 참조형 변수값
//        int a = 10;
//        String[] arR = {"ab", "12312", "12a"};

//        java 변수의 유효범위
        // 하위 영역의 블록(중괄호)에서 정의된 변수는 상위 블록에서 접근 불가
//        int num1 = 10;
//        if(true) {
//            num1 = 20;
//            int num2 = 30;
//        }
//        num2 = 40;

        // i 를 어떻게 재사용 할 수 있을까. 하위에서 선언되어서 ㅇㅇ for문 밖에서는 의미 없음
//        for(int i = 0; i < 10; i++) break;
//        for(int i = 0; i < 10; i++) break;

//        다중 for문
//        2~9까지 모든 구구단 한 번에 출력
//        2단입니다 ~
//        3단입니다 ~
//        StringBuilder sb  = new StringBuilder();
//        for (int i = 1; i < 10; i++) {
//            sb.append(i).append( " 단 입니다. : ");
//            for (int j = 1; j < 10; j++) {
//                sb.append(i).append(" X ").append(j).append(" = ").append(i*j);
//            }
//            System.out.println(sb);
//        }

        // 라벨문: 반복문에 이름을 붙이는 것
        // 원하는 for 문을 labeling을 통해 break 또는 continue 시킬 수 있음.
//        loop1:
//        for(int i = 0; i <10; i++) {
//            for(int j = 0; i < 10; j++) {
//                if(true) {
//                    break loop1;
//                }
//            }
//        }
    }
}
