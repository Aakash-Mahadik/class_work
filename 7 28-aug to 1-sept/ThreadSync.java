class Account extends Thread{
    static int balance = 1000;
    public void run(){

        synchronized(Account.class){
            if(balance>=800){
                System.out.println(Thread.currentThread().getName()+" your balance is "+balance+" \nyou can withdraw the ammount ");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
                balance = 200;
            }else{
                System.out.println(Thread.currentThread().getName()+"your current balance is "+balance+" you can't withdraw money");
            }
        }
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setName("Name1");
        acc1.start();
        Account acc2 = new Account();
        acc2.setName("Name2");
        acc2.start();


    }
}
