package C02MethodClass;

import java.io.IOException;
import java.util.Arrays;

// 백 트랙킹 외에 누적합계, 팩토리얼, 피보나치수열 등 모두 재귀함수로 푸는 것을 권고하지 않음.
// 동작만 이해하는 참고 목적
public class C12RecursiveExample {
    public static void main(String[] args) throws IOException {
        // 누적합 for
        int sum = 0;
        for(int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 누적합 recursive
        System.out.println(sumAcc(1, 10));

        // factorial for
        int factorial = 1;
        for(int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        // factorial recursive
        System.out.println(factorial(5));

        // Fibonacci
        // 1 1 2 3 5 8 13 21 34
        // Fibonacci using for
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        for(int i = 2; i < 11; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);


        // Fibonacci recursive. Dynamic Programming algorithm.(기억하기 알고리즘)
        // f(n) = f(n-1) + f(n-2)
        int[] dp = new int[10];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(Fibonacci(11));


    }

    public static int sumAcc(int start, int end) {
        if(start == end) return end;
//        if(start > end) return 0;
        return start+sumAcc(start+1, end);
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public static int Fibonacci(int n) {
        if(n <= 2) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
