
class Table{
    synchronized
    public void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    
    public void run(){
        t.printTable(5);
        try {
            sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(10);
    }
}


public class TestSync {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
