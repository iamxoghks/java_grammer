package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C02MethodPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        // 소수인가?
        if(isPrime(input)) System.out.println(input + " is a prime number");
        else System.out.println(input + " is not a prime number");

        voidMethod();

    }

    // 소수 판별기 메소드(isPrime)

    public static boolean isPrime(int a) {
        if(a <= 1) return false;
        if(a == 2) return true;

        for(int i = 2; i * i < a; i ++) {
            if(a % i == 0) return false;
        }
        return true;
    }

    public static void voidMethod() {
        if(true) return;
        // void 메서드에서 return은 메서드 강제종료 목적으로 사용
        System.out.println("hello world");
    }
}
