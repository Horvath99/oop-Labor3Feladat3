package Labor3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer("John","BLACK");
        System.out.println(customer1.toString());
        customer1.setAccount(new BankAccount("OTP1"));
        System.out.println(customer1.toString());
        customer1.getAccount().depozit(1000);
        System.out.println(customer1.toString());
        Customer customer2=new Customer("Mary","WHITE");
        customer2.setAccount(new BankAccount("OTP2"));
        System.out.println(customer2.toString());
        customer2.CloseAccount();
        System.out.println(customer2.toString());
        customer1.setFirstname("Mary and John");
        System.out.println(customer1.toString());



    }
}
