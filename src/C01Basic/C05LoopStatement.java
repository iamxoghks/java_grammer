package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C05LoopStatement {
    public static void main(String[] args) throws IOException {
//        int a = 0;

        // while문의 조건식에 변화를 주지 않으면 while 문은 기본적으로 무한 루프
//        while( 1 < 10) {
//            System.out.println("h w!");
//            a++;
//        }

        // 반복되는 도어락키 예제
        // 비밀번호 맞추면 즉시 종료 -> open 출력
        // 6번 이상 틀리면 종료 -> 5 초과 출력
//        String answer = "1234";
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = 0;
//
//        while(count < 5) {
//            String input = br.readLine();
//            if (input.equals(answer)) {
//                System.out.println("open");
//                break;
//            } else {
//                System.out.println("wrong");
//                count++;
//            }
//            if (count == 5) {
//                System.out.println("over 5");
//                break;
//            }
//        }

        // 입력한 숫자의 구구단 단수 출력
//        while(true) {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int num = Integer.parseInt(br.readLine());
//            int i = 1;
//            while(i < 10) {
//                System.out.println(i + " X " + num + " = " + i*num);
//                i++;
//            }
//        }

//        do while 문: 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println("h w!");
//        } while ( a < 10);

        // for 문은 초기식, 조건식, 증감식 모두 포함되어 있는 반복문이다.
//        for(int i = 0; i < 10; i++) {
//            System.out.println("h w!");
//        }

        // 1~10중에 홀수만 출력하기
//        for(int i = 1; i <= 10; i++) {
//            if(i % 2 != 0) System.out.println(i);
//        }

        // 1~10중에 홀수만 출력하기 방법 2 -> continue를 왜 쓰나? 가독성을 위해서
        // continue를 거친다면 하위의 코드를 실행하지 않음.
//        for(int i = 1; i <= 10; i++) {
//            if(i % 2 == 0) continue;
//            System.out.println(i);
//        }

    }
}
