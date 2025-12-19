package C04Intercafe.BankProgram;

// entity 계층으로서 객체에 대한 상태값을 관리하는 class
public class BankAccount {

    private String AccountNumber;
    private long balance;

    public BankAccount(String AccountNumber, long balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public long getBalance() {
        return balance;
    }

    // 최종 금액을 update. 입출금 모두 사용
    public void updateBalance(long balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account Number: " + AccountNumber + ", Balance: " + balance;
    }
}
