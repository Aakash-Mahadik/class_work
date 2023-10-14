// WAP to create two threads...one thread will generate even numbers between 1 and 50 and another thread will generate odd numbers  between 1 and 50
class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("even : "+i);
            }
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            if(i%2==1){
                System.out.println("odd  : "+i);
            }
        }
    }
}
public class ThreadQue {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
