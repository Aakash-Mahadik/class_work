
class MyRunnable1 implements Runnable{
    public void run(){
        int i =0;
        while(i<200){
        System.out.println("i am thread1");
        System.out.println("i am happy");
        i++;
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int i =0;
        while(i<200){
        System.out.println("i am thread2");
        System.out.println("i am sad");
        i++;
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        MyRunnable1 MR1 = new MyRunnable1();
        Thread t1 = new Thread(MR1);
        MyRunnable2 MR2 = new MyRunnable2();
        Thread t2 = new Thread(MR2);
        t1.start();
        t2.start();
    }
}
