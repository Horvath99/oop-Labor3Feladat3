package Labor3_2;

import Labor3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        Customer customer2=new Customer("Mary","WHITE");
        Random rand=new Random();
        customer1.addAccount(new BankAccount("OTP1"));
        customer1.addAccount(new BankAccount("OTP2"));
        customer1.addAccount(new BankAccount("OTP3"));
        customer1.addAccount(new BankAccount("OTP4"));
        customer1.addAccount(new BankAccount("OTP5"));
        customer2.addAccount(new BankAccount("OTP1"));
        customer2.addAccount(new BankAccount("OTP2"));
        customer2.addAccount(new BankAccount("OTP3"));
        customer2.addAccount(new BankAccount("OTP4"));
        customer2.addAccount(new BankAccount("OTP5"));
        customer2.addAccount(new BankAccount("OTP6"));
        customer2.addAccount(new BankAccount("OTP7"));
        customer2.addAccount(new BankAccount("OTP8"));
        customer2.addAccount(new BankAccount("OTP9"));
        for(int i=0;i< customer1.getNumAccounts();i++){
            int random=rand.nextInt(10000);
            customer1.getAccount(i).depozit(random);
        }
        for(int i=0;i< customer2.getNumAccounts();i++){
            int random= rand.nextInt(10000);
            customer2.getAccount(i).depozit(random);
        }
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        customer1.CloseAccount("OTP1");
        customer2.CloseAccount("OTP9");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }

}
