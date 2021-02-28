package labor2;

public class main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP000001");
        // System.out.println(account1.toString());
        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());
        System.out.println("Depozit 1000 euro");
        account1.depozit(1000);
        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());
        System.out.println("Withdraw:500 euro");
        if (account1.withdraw(500)) {
            System.out.println("Withdraw:500 euro Succesful");
        } else {
            System.out.println("Withdraw:500 euro Unsuccesful");
        }
        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());
        System.out.println("Withdraw:1000 euro");
        if (account1.withdraw(1000)) {
            System.out.println("Withdraw:1000 Succesful");
        } else {
            System.out.println("Withdraw:1000 Unsuccesful");
        }
        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());

    }
}
