package Labor5_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers=new ArrayList<>();
    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }
    public Customer getCustomer(int customerID){
        for(Customer customer:customers){
            if(customerID==customer.getID()){
                return customer;
            }
        }
        return null;
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public int numCustomers(){
        return customers.size();
    }
    private void printCustomers( PrintStream ps ){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getID()+", " + customer.getFirstname() +", "+
                    customer.getLastname()+", "+customer.getNumAccounts());
        }
    }
    public void printCustomersToStdout(){
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
