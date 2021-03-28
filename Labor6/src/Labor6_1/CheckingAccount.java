package Labor6_1;
/** folyoSzamla**/
public class CheckingAccount extends BankAccount{
    private double overdraftLimit; //hitelkeret

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount>balance+overdraftLimit){
            return false;
        }
        balance-=amount;
        return true;

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
