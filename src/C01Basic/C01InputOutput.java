package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
        // 출력: System.out 을 통해 콘솔에 출력
        // 1) println은 줄바꿈 있는 출력
        // 2) 기본적으로 모든 출력은 문자열
//        System.out.println(20);
//        System.out.print("hello world1");
//        System.out.print("hello world2");

        // 입력1: Scanner 클래스 - 입력을 위한 클래스로서 바이트 단위 입력 처리
//        Scanner myScanner = new Scanner(System.in);
//
//        String input = myScanner.nextLine(); // 입력받은 데이터를 한 줄로 읽어서, String으로 변환
//        System.out.println("input: " + input);

        /*
        아래와 같이 입력값이 주어졌을 때 처리 방법
        abc
        bcd
        2
        3
         */
//        Scanner myScanner = new Scanner(System.in);
//        String input1 = myScanner.nextLine();
//        String input2 = myScanner.nextLine();
//        // 입력 받은 문자열을 직접 형변환 하는 것을 더 추천함
//        int input3 = Integer.parseInt(String.valueOf(myScanner.nextInt()));
//        int input4 = myScanner.nextInt();

        // 입력2: BufferedReader
        // 성능이 Scanner 보다 좋은 이유.
        // 1) Buffer를 사용하여 더 좋은 성능을 발휘함
        // 2) Scanner는 byte 단위이고, InputStreamReader는 문자 단위라 더 빠름
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input2 = br.readLine();
//        System.out.println("input: " + input2);

        /*
        입력값:abc bcd efg
         */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        String[] arr = input.split(" ");
//        System.out.println("arr[0]: " + arr[0] + ", arr[1]: " + arr[1] + ", arr[2]: " + arr[2]);
//        // close는 메모리 회수, IO 장치와 연계된 코드이므로, 가비지컬렉터(GC)의 대상이 아님
//        br.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // StringTokeinzer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 내부에 토큰화
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        br.close();
    }
}
