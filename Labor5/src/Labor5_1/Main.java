package Labor5_1;

import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
//         ArrayList<Customer> customers=new ArrayList<>();
//         Customer customer1=new Customer("John","BLACK");
//         customer1.addAccount(new BankAccount());
//         customers.add(customer1);
//         Customer customer2=new Customer("Marcus","RASHFORD");
//         customer2.addAccount(new BankAccount());
//         customers.add(customer2);
//         Customer customer3=new Customer("Anthony","JOSHUA");
//         customer3.addAccount(new BankAccount());
//         customers.add(customer3);
         Bank bank1=new Bank("OTP");
       bank1.addCustomer(new Customer("John","BLACK"));
       bank1.addCustomer(new Customer("Marcus","Rashford"));
       for(int i=0;i<bank1.numCustomers();i++){
           bank1.getCustomer(i+1).addAccount(new BankAccount());
       }
       bank1.getCustomer(2).addAccount(new BankAccount());
         for(int i=0;i<bank1.numCustomers();i++){
             for(int j=0;j<bank1.getCustomer(i+1).getNumAccounts();j++){
                 bank1.getCustomer(i+1).getAccount(j).depozit(500);

             }
         }
         System.out.println(bank1.getCustomer(2));
         bank1.printCustomersToFile("bank_customers.csv");

    }

}
