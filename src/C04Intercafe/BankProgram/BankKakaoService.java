package C04Intercafe.BankProgram;

public class BankKakaoService implements BankServiceInterface{

    public void deposit(long money, BankAccount ba) {
        long current = ba.getBalance();
        long newBalance = current + money;
        ba.updateBalance(newBalance);
    }

    public boolean withdraw(long money, BankAccount ba) {
        long current = ba.getBalance();
        if(current < money){
            return false;
        }else {
            long newBalance = current - money;
            ba.updateBalance(newBalance);
            return true;
        }
    }
}
