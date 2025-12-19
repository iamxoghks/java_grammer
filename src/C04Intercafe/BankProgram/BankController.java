package C04Intercafe.BankProgram;

import java.util.Scanner;

// 사용자와의 interface 를 담당하는 프로그램 계층
public interface BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber, 0);
//        BankService bs = new BankService();
        BankServiceInterface bs = null;
        while (true){
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if (serviceNumber.equals("1")){
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                String number = sc.nextLine();
                System.out.println("입금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
//                bs.deposit(money, ba);
                if(number.equals("1")){
                    System.out.println("카카오 서비스 입니다.");
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);

                }else if(number.equals("2")) {
                    System.out.println("토스 서비스 입니다.");
                    bs = new BankTossService();
                    bs.deposit(money, ba);
                }
            }else {
                System.out.println("출금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
//                bs.withdraw(money, ba);
            }
        }
    }
}
