package C07ExceptionFileParsing.MemberException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

// 사용자와 인터페이싱 하는 계층 I/O
public class MemberController {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MemberService ms = new MemberService();
        while (true) {
            System.out.println("1) sign up \n2) user info\n3) user list\n4) login");
            int input = 0;
            
            try {
                input = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("enter a number");
            }
            
            switch (input) {
                case 1:
                    System.out.println("sign up");
                    System.out.println(" enter name");
                    String name = br.readLine();
                    System.out.println("enter email");
                    String email = br.readLine();
                    System.out.println("enter password");
                    String password = br.readLine();
                    // 회원 가입시 발생하는 예외 try/catch
                    try {
                        ms.register(name, email, password);
                        System.out.println("Sign up successful");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("user info system");
                    System.out.println("enter id");
                    long id = Long.parseLong(br.readLine());
                    try {
                        Member member = ms.findById(id);
                        System.out.println(member);
                    }
                    catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("user list system\n");
                    List<Member> memberList = ms.findAll();
                    System.out.println(memberList);
                    if(memberList.isEmpty()) System.out.println("no members found");
                    break;
                case 4:
                    System.out.println("login.");
                    System.out.println("enter email\n");
                    String email2 = br.readLine();
                    System.out.println("enter password\n");
                    String password2 = br.readLine();
                    try {
                        ms.login(email2,password2);
                        System.out.println("Login successful");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }

}
