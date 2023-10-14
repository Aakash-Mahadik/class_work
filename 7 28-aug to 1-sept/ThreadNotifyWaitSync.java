class Customer{
    int balance = 15000;
     
    synchronized void withdraw(int ammount){
        System.out.println("going to withdraw...");
        if(balance<ammount){
            System.out.println("less balance, waitting for deposite");
            try{
                wait();
            }catch(Exception e){

            }
            System.out.println("Updated balance "+balance);
            System.out.println("Withdrawal completed");
        }
    }

    synchronized void deposite(int ammount){
        System.out.println("going to deposite...");
        balance += ammount;
        System.out.println("deposit completed...");
        notify();
    }
}

public class ThreadNotifyWaitSync {
    public static void main(String[] args) {
        Customer c = new Customer();

        new Thread(){
            public void run(){
                c.withdraw(20000);
            }
        }.start();

        new Thread(){
            public void run(){
                c.deposite(15000);
            }
        }.start();
        
    }
}
