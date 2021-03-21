package Labor4_2;

import Labor4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        ArrayList<Customer> customers=readFromCSVFile("Labor4/labor4_2_input.csv");
        for(Customer customer: customers){
            System.out.println(customer);
        }

    }

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nem letezo allomany");
            return customers;
        }
        Customer customer1=null;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] items = line.split(",");

            if (items[0].equals("Customer")) {
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                customer1=new Customer(firstName, lastName);
                customers.add(customer1);
            }
            else if(items[0].equals("Account")){
                 String accountNumber=items[1].trim();
                 double balance=Double.parseDouble(items[2].trim());
                 BankAccount account=new BankAccount(accountNumber);
                 account.depozit(balance);
                 customer1.addAccount(account);
            }

        }
        return customers;
    }
}
