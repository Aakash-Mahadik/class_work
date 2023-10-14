// Write a Java program to create multiple thread in Java.Apply thread properties too.(priority,name)


//create 1st thread
class MyThread1 extends Thread{
    public void run() {
        System.out.println("This is from MyThread1");
    }
}

//create 2nd thread
class MyThread2 extends Thread{
    public void run() {
        System.out.println("This is from MyThread2");
    }
}

public class ThreadPropertiesMain {
    public static void main(String[] args) {

        //creating object of threads
        MyThread1 MT1 = new MyThread1();
        MyThread2 MT2 = new MyThread2();

        //Giving name to thread using setName
        MT1.setName("MyThread1");
        MT2.setName("MyThread2");

        //setting prioritys 
        MT1.setPriority(Thread.MAX_PRIORITY);
        MT2.setPriority(Thread.MIN_PRIORITY);

        //printing name of thread 
        System.out.println(MT1.getName());
        System.out.println(MT2.getName());

        //starting threads
        MT1.start();
        MT2.start();
        

    }
}
