package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
//        for(int i = 2; i < a; i++) {
//            if(a % i == 0) {
//                System.out.println("sosu");
//                break;
//            } else {
//                System.out.println("nope");
//                break;
//            }
//        }
        boolean b = false;
        //for(int i = 2; i*i <= a; i++) {
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                b = true;
                break;
            }
        }
        System.out.println(b ?  "No sosu" : "Yes sosu");

    }
}
