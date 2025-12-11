package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C10List {
    public static void main(String[] args) {
        // List 선언 방법
        // 클래스명 변수명 = new 클래스명();
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> myList2 = new ArrayList<String>();

        // List 선언 방법2: 가장 일반적인 방법
        ArrayList<String> myList3 = new ArrayList<>();

        // 초기값 세팅
        myList3.add("a");
        myList3.add("b");
        myList3.add("c");
        myList3.add("d");

        System.out.println(myList3);


        // 초기값 세팅 2: 배열을 리스트로 전환
        String[] arr = {"java", "C", "Go"};
        List<String> myList4 = new ArrayList<>();

    }
}
