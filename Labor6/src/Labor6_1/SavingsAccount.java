package Labor6_1;
/**takarekSzamla**/
public class SavingsAccount extends BankAccount{
    private double interestRate; //kamatlab

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterest(){
        super.balance+=this.interestRate*super.balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
