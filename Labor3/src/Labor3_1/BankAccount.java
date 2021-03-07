package Labor3_1;

public class BankAccount {
    private double balance;
    private String accountNumber;
    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
    }
    // getter-lekerdezes muvelet
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void depozit(double amount){
        if(amount<=0){
            return;
        }
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(amount>balance){
            return false;
        }
        balance-=amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}