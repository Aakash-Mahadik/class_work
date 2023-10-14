

class Myth1 extends Thread{
    public void run(){
        int i =0;
        while(i<200){
        System.out.println("i am thread1");
        System.out.println("i am happy");
        i++;
        }
    }
}
class Myth2 extends Thread{
    public void run(){
        int i =0;
        while(i<200){
        System.out.println("i am thread2");
        System.out.println("i am sad");
        i++;
        }
    }
}

public class UsingThread {
    public static void main(String[] args) {
        Myth1 m1 = new Myth1();
        Myth2 m2 = new Myth2();
        m1.start();
        m2.start();
    }
}
