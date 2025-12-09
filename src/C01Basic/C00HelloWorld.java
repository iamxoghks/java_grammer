package C01Basic;

// 클래스의 명명 규칙
// 1) 반드시 public class 명과 파일명이 일치해야함
// 2) 일반적으로 알파벳 대문자로 시작함
public class C00HelloWorld {
    // 1) main 메서드는 java 파일 실행시 실행의 시작점이자, 가장 먼저 실행되는 메서드
    // 2) public static 어디에서든 접근 가능하고, 반환 또는 return 값이 없는 메서드다
    // 3) 메서드명, 변수명은 일반적으로 소문자알파벳으로 시작
    public static void main(String[] args) {
        // print 단축어 sout
        System.out.println("hello world"); // 반드시 ;로 명령문 종료

        // 메서드를 호출할 때는 메서드명()를 통해 호출
        System.out.println(method2());

        // //는 컴파일 대상에서 제외 하는 주석
        /*
        여러 줄의 주석 처리도 가능
         */
    }

    // 직접 생성한 리턴 값이 있는 메서드 예시
    public static int method2() {
        return 10;
    }
}
