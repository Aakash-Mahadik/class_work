// Bankcustomer class with acno,atype,amt fields using constructor overloading
class BankCustomer{
    double acNo; //account number of the customer
    String atype;//type of account (savings or current)
    double amt;
    
    BankCustomer(){
        acNo=0123456789d;
        atype="Savings";
    }
    BankCustomer(double amm){
        this.acNo=0123456789d;
        this.atype="Savings";
        this.amt =amm ;
    }
}

public class BankCustomerMain {
    public static void main(String[] args) {
        BankCustomer cus = new BankCustomer(500000);
        System.out.println("Account Number: "+cus.acNo);
        System.out.println("Type Of Account :"+cus.atype);
        System.out.println("Balance is: "+ cus.amt);

    }
}
