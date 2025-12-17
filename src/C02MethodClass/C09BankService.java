package C02MethodClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
<계좌개설 및 입출금 서비스>
1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
2.자료구조 :  계좌객체를 담아둘 자료구조는 Map
3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요.
    3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
    3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호, 잔고를 보기좋게 출력
    3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
    3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
    3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
4.주의사항
    4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
    4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
 */
public class C09BankService {
    public static void main(String[] args) {
        Map<String, BankAccount> bankAccountMap = new HashMap<>();
        while (true){
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if(number==1){
//                계좌개설
                System.out.println("1. 계좌 개설입니다. 아래 정보를 입력해주세요.");
                System.out.println("이름, 계좌번호, 잔액을 입력");
                String name = sc.nextLine();
                String accountNumber = sc.nextLine();
                long balance = Long.parseLong(sc.nextLine());
                if(bankAccountMap.containsKey(accountNumber)){
                    System.out.println("계좌번호가 중복입니다.");
                }else {
                    bankAccountMap.put(accountNumber, new BankAccount(name, accountNumber, balance));
                }
            }else if (number==2){
//                계좌조회
                System.out.print("2. 계좌조회서비스입니다.계좌번호를 입력해주세요. : ");
                String accountNumber = sc.nextLine();
                BankAccount b1 = bankAccountMap.get(accountNumber);
                System.out.println( "계좌주명 : " + b1.getName() + " 계좌번호 :  " + b1.getAccountNumber()  +  "잔액 : "+ b1.getBalance());


            }else if (number==3){
                System.out.print("3. 입금서비스입니다. 계좌번호를 입력해주세요. : ");
                String accountNumber = sc.nextLine();
                System.out.print("입금 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                BankAccount b1 = bankAccountMap.get(accountNumber);
                System.out.println("입금 전 잔액 : "+ b1.getBalance());
                b1.deposit(money);
                System.out.println("입금 후 잔액 : "+ b1.getBalance());

            }else if (number==4){
                System.out.print("4. 출금서비스입니다. 계좌번호를 입력해주세요. : ");
                String accountNumber = sc.nextLine();
                System.out.print("출금 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                BankAccount b1 = bankAccountMap.get(accountNumber);
                if(b1.checkBalance(money)){
                    b1.withdraw(money);
                    System.out.println("출금 완료되었습니다.");
                }else {
                    System.out.println("잔액이 부족합니다.");
                }

            }else if (number==5){
                System.out.print("5. 송금서비스입니다. 본인계좌번호를 입력해주세요. : ");
                String myNumber = sc.nextLine();
                System.out.print("상대방 계좌번호를 입력해주세요. : ");
                String targetNumber = sc.nextLine();
                System.out.print("송금 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                BankAccount b1 = bankAccountMap.get(myNumber);
                BankAccount b2 = bankAccountMap.get(targetNumber);
                if(b1.checkBalance(money)){
                    b1.transfer(b2, money);
                    System.out.println("송금 완료되었습니다.");
                }else {
                    System.out.println("잔액이 부족합니다.");
                }
            }
        }
    }
}

class BankAccount {
    private long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;

    public BankAccount(String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public static long getStaticId() {
        return staticId;
    }

    public boolean checkBalance(long amount) {
        if(this.balance < amount) return false;
        return true;
    }

    public void withdraw(long amount) {
        this.balance -= amount;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void transfer(BankAccount targetAccount, long money){
        if(this.balance < money){
            return;
        }
        this.balance -= money;
        targetAccount.balance += money;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
