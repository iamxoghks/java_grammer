package C07ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class C02ExceptionAdvance {
    public static void main(String[] args) throws IOException {
        // 의도된 예외 강제 scenario
//        Scanner sc = new Scanner(System.in);
//        System.out.println("email input: ");
//        String email = sc.nextLine();
//        System.out.println("password input: ");
//        String password = sc.nextLine();
//        System.out.println(register(email, password));
//        System.out.println("DB inserted");

        // Exception의 종류
        // 1) Checked Exception: 예외가 발생 될 것으로 예상 되는 거(타 시스템과 주고받을 때, DB, Network(외부와 통신))
        //      => 예외처리 강제 try{} catch{}, throws(위임)
        // 2) Unchecked Exception: 예외가 발생 될 것으로 예상 못 하는 거
        //      => 예외처리 강제하지 않음

        // Checked Exception 처리 방법
        // 1) throws 를 통해 예외처리 -> checked 예외처리 위임 받음 -> main에 throw
//        String text = fileRead("src/C07ExceptionFileParsing/text.txt");
//        System.out.println(text);

        // 2) throws를 통해 checked 예외 처리를 위임 받고, 호출하는 쪽에서 예외처리
//        try {
//            String text = fileRead("src/C07ExceptionFileParsing/text.txt");
//            System.out.println(text);
//        } catch (IOException e) {
//            System.out.println("파일 처리 과정에서 에러가 발생했다!, " + e.getMessage());
//            e.printStackTrace();
//        }

        // 3) checked 예외를 try/catch하여 unchecked를 강제로 발생시킨다(DB rollback 목적)
        // => 제일 많이 쓰임
        try {
            String text = fileRead("src/C07ExceptionFileParsing/text.txt");
            System.out.println(text);
        } catch (RuntimeException e) {
            System.out.println("파일 처리 과정에서 에러가 발생했다!, " + e.getMessage());
            e.fillInStackTrace();
        }

    }

    static boolean register(String email, String password) {
        if(password.length() >= 10) return true;
        else {
            // 예외를 강제 발생시켜서 해당 method 강제 종료
            // 예외는 기본적으로 method를 호출한 쪽으로 전파된다
            throw new IllegalArgumentException("Password too short");
        }
    }

//    static String fileRead(String path) throws IOException {
//        Path filePath = Paths.get(path);
//        String text = Files.readString(filePath);
//        return text;
//    }
    static String fileRead(String path) {
        Path filePath = Paths.get(path);
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
