package Labor4_2;

import java.util.ArrayList;

public class Customer {
    public static final int MAX_ACCOUNTS=10;
    private String firstname;
    private String lastname;
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public ArrayList<BankAccount> getAccount(int index) {
        return accounts.get(index);
    }

    public ArrayList<BankAccount> getAccounts(String accountNumber) {
        for(int i=0;i<getNumAccounts();i++){
            if(accountNumber.equals(accounts.get(i).getAccountNumber())){
                return accounts.get(i);
            }
        }
        return null;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumAccounts() {

        return accounts.size();
    }

    public void addAccount(BankAccount account) {
        if(account==null) return;
        if(getNumAccounts()==MAX_ACCOUNTS){
            System.out.println("Tul sok szamla");
            return;
        }
//        accounts[getNumAccounts()] = account;
//        getNumAccounts()++;
        accounts.add(account);
    }

//    public void setAccounts(BankAccount[] accounts) {
//        this.accounts = accounts;
//    }

    public void CloseAccount(String accountNumber){
        int ok=0;
        for(int i=0;i<getNumAccounts();i++)
        {
            if(accountNumber.equals(accounts.get(i).getAccountNumber())){
//                BankAccount csere;
//                accounts[i]=null;
//                csere=accounts[getNumAccounts()-1];
//                accounts[getNumAccounts()-1]=null;
//                accounts[i]=csere;
//                csere=null;
//                getNumAccounts()--;
                ok=1;
                accounts.remove(i);
            }
        }
        if(ok==1){
            System.out.println("Sikeresen torolve");
        }else{
            System.out.println("Az elem nem talalhato");
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\n' +
                ", accounts=" + accounts +
                '}';
    }
}