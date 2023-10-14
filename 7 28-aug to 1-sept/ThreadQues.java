// WAP to check whether the number is positive or negative using thread

class Check extends Thread{
    int num = -5;
    public void run(){
        if (num > 0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}

class Check2 implements Runnable{
    int num=1346789;
    public void run(){
        if (num > 0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}


public class ThreadQues{
    public static void main(String[] args) {
        //object creation and calling method for Thread class
        Check pos = new Check();
        pos.start();
        
        //object creation and calling method for Runable interface
        Check2 check = new Check2();
        Thread t = new Thread(check);
        t.start();

        Thread t1 = new Thread("MyThread");
        //t1.start();
        System.out.println(t1.getName());
    }
}