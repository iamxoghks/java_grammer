package C07ExceptionFileParsing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01ExceptionBasic{
    public static void main(String[] args) {
        System.out.println("divide");
        Scanner sc = new Scanner(System.in);
        System.out.println("input head");
        // 예외처리 기본: 예외가 발생할 것으로 예상되는 코드를 try로 감싼다
        // 예외처리 목적
        // 1) 사용자에게 적절한 에러 메시지 전달
        // 2) 예외 발생시 디버깅을 위한 로그 기록
        try {
            int head = sc.nextInt();
            System.out.println("input tail");
            int tail = sc.nextInt();
            int result = head / tail;
            System.out.println("result = " + result);
        }
        // catch를 통해 예상되는 예외 클래스를 분기처리 한다
        catch (ArithmeticException e) {
            // 사용자에게 메시지 전달(가정)
            System.out.println(e.getMessage() + ", 분모는 0으로 넣으면 안 된다");
            // 시스템에 자세히 로그 기록
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력해라");
            e.printStackTrace();
        } catch (Exception e) {
            // Exception은 모든 예외 class의 조상 class
            // 구체적인 예외 class가 catch에 있으면 해당 catch로 우선 분기 됨
            System.out.println("암튼 에러임");
            throw new RuntimeException(e);
        } finally {
            System.out.println("예외 발생하던 안 하던 무조건 실행되는 부분");
        }

        // 예외처리를 하지 않을 경우 프로그램은 강제 종료
        // 예외처리 하면 프로그램은 예외 발생해도 종료 X
        System.out.println("예외 발생 -> 예외처리 이후에 실행되는 코드");

    }
}
