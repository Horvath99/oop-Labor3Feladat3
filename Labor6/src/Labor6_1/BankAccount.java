package Labor6_1;

import java.util.ArrayList;

public class BankAccount extends ArrayList<BankAccount> {
    protected double balance;
    protected final String accountNumber;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    protected BankAccount(){
        ++numAccounts;
        this.accountNumber=generateAccountNumber();
    }
    private static String generateAccountNumber(){
        StringBuffer str=new StringBuffer();
        String numAccountsStr=""+numAccounts;
        int len=numAccountsStr.length();
        str.append(PREFIX);
        for(int i=0;i<ACCOUNT_NUMBER_LENGTH-len-PREFIX.length();i++) {
            str.append('0');
        }
        str.append(numAccountsStr);
        return str.toString();
    }
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
