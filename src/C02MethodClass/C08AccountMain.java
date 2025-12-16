package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C08AccountMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 계좌 개설(객체 생성)
        Account account1 = new Account();
        account1.setName("Kim");
        account1.setAccountNumber("12345");
        account1.setBalance(50000000);

        Account account2 = new Account("Hwang", "54321", 2405000);
        Account account3 = new Account("Lee", "34512", 5000);

        // List를 계좌 객체를 담는 자료구조로 사용
        List<Account> myList = new ArrayList<>();
        myList.add(account1);
        myList.add(account2);
        myList.add(account3);

        System.out.println("송금 전 계좌 정보");
        for(Account a : myList) System.out.println(a);

        System.out.println("자신의 계좌번호와 송금받을 상대의 계좌번호, 금액을 입력해주세요");
        System.out.println("자신의 계좌번호를 입력하세요: ");
        String from = br.readLine();
        System.out.println("상대방의 계좌번호를 입력하세요: ");
        String to = br.readLine();
        System.out.println("금액을 입력하세요: ");
        long amount = Long.parseLong(br.readLine());

        C08AccountMain.exchange(from, to, amount, myList);

        // 계좌 1(account num 12345)에서 계좌 2(account num 54321)로 송금: 잔고 변경 Method (set)
        // 내 객체를 찾아서 -50,000 후 상대방 객체를 찾아서 + 50,000
//        for(Account a : myList) {
//            if(a.getAccountNumber(a).equals("12345")) a.setBalance(a.getBalance() - 50000);
//            if(a.getAccountNumber(a).equals("54321")) a.setBalance(a.getBalance() + 50000);
//        }
//        //
//
//        System.out.println("송금 후 계좌 정보");
//        for(Account a : myList) System.out.println(a);
    }

    public static void exchange(String a, String b, long money, List<Account> myList) {
        for(Account x : myList) {
            if(x.getAccountNumber(x).equals(a)) x.setBalance(x.getBalance() - money);
            if(x.getAccountNumber(x).equals(b)) x.setBalance(x.getBalance() + money);
        }
        //

        System.out.println("송금 후 계좌 정보");
        for(Account x : myList) System.out.println(x);
    }


}

class Account {
    private String name;
    private String accountNumber;
    private long balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public String getAccountNumber(Account account) {
        return this.accountNumber;
    }

    public Account() {}
    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return  "(이름: " + name + ", 계좌번호: " + accountNumber + ", 잔액: " + balance + ")";
    }

}