package Labor3_2;

import Labor3_1.BankAccount;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;
    private String firstname;
    private String lastname;
    private BankAccount accounts[]= new BankAccount[ MAX_ACCOUNTS ];
    private int numAccounts;

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

    public BankAccount getAccount(int index){
        return accounts[index];
    }
    public BankAccount getAccounts(String accountNumber) {
        for(int i=0;i<numAccounts;i++){
            if(accountNumber.equals(accounts[i].getAccountNumber())){
                return accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void addAccount(BankAccount account) {
        if(account==null) return;
        if(numAccounts==MAX_ACCOUNTS){
            System.out.println("Tul sok szamla");
            return;
        }
        accounts[numAccounts] = account;
        numAccounts++;
    }

//    public void setAccounts(BankAccount[] accounts) {
//        this.accounts = accounts;
//    }

    public void CloseAccount(String accountNumber){
        int ok=0;
        for(int i=0;i<numAccounts;i++)
        {
            if(accountNumber.equals(accounts[i].getAccountNumber())){
                BankAccount csere;
                accounts[i]=null;
                csere=accounts[numAccounts-1];
                accounts[numAccounts-1]=null;
                accounts[i]=csere;
                csere=null;
                numAccounts--;
                ok=1;
            }
        }
        if(ok==1){
            System.out.println("Sikeresen torolve");
        }else{
            System.out.println("Az elem nem talalhato");
        }

    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstname + ' ' + lastname + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }



}

