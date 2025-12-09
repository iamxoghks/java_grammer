package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C04IfStatements {
    public static void main(String[] args) throws IOException {
        // 도어락키 예제
//        String answer = "1234";
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//
//        if(input.equals(answer)) System.out.println("open");
//        else System.out.println("not open");
//
        // 교통카드 예제
        System.out.println("현재 가진 돈은?");
        // 사용자가 가지고 있는 돈을 int
        // 10000 이상이면 택시
        // 10000~3000 버스
        // 3000 미만 뚜벅이

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        // if, else if 구문에서 조건식은 택1. 즉, 한 조건에 해당하면 실행 후 구문 밖으로 빠져나감.
        if(input >= 10000) System.out.println("taxi");
        else if (10000 >= input && input >= 3000) System.out.println("bus");
        else System.out.println("walk");

    }
}
