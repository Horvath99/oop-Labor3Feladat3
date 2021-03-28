package Labor6_1;

public class Main {
    public static void main(String[] args) {
        Bank otp=new Bank("OTP");
        otp.addCustomer(new Customer("John","BLACK"));
        otp.addCustomer(new Customer("Marcus","RASHFORD"));
        for(int i=0;i<otp.numCustomers();i++){
            otp.getCustomer(i+1).addAccount(new SavingsAccount(0.1));
            otp.getCustomer(i+1).addAccount(new CheckingAccount(300));
            otp.getCustomer(i+1).getAccount(0).depozit(500);
            otp.getCustomer(i+1).getAccount(1).depozit(500);
        }
//        for(int i=0;i< otp.numCustomers();i++){
//            System.out.println(otp.getCustomer(i+1).toString());
//        }
        for(int i=0;i< otp.numCustomers();i++){
            ((SavingsAccount)(otp.getCustomer(i+1).getAccount(0))).addInterest();
        }
//        for(int i=0;i< otp.numCustomers();i++){
//            System.out.println(otp.getCustomer(i+1).toString());
//        }
        for(int i=0;i< otp.numCustomers();i++){
            ((CheckingAccount)(otp.getCustomer(i+1).getAccount(1))).withdraw(780);
        }
        for(int i=0;i< otp.numCustomers();i++){
            System.out.println(otp.getCustomer(i+1).toString());
        }




    }
}
