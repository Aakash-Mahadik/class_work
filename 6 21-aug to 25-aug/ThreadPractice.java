/*Multi threading is basically use for 
 * giving a time to differnt function while 1 is taking it to long
 * it give some time to 1 task and next few time for another task
 */
/*Multi Threading is done in a two way
 * 1)Extending thread class which we have seen in this program and 
 * 2) using runnable interface
 */


 class thred1 extends Thread{
    public void run(){
        int i = 0;
        while(i<=100){
        System.out.println("Hii");
        // try {
        //         Thread.sleep(1000); // Pause for 1 second
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        i++;
        }
    }

    public void sayHello(){
        int i =0;
        while(i<=100){
        System.out.println("Hello");
        i++;
        }
    }
}
class thred2 extends Thread{
    public void run(){
        int i =0;
        while(i<=100){
        System.out.println("Aakash");
        i++;
        }
    }
}
public class ThreadPractice {

    public static void main(String[] args) {
        thred1 t1 = new thred1();
        thred2 t2 = new thred2();
        // t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());
        t2.start();  
        t1.sayHello();
        for(int i = 1;i<=100;i++){
            System.out.println(i);
        }
        
        
    }
}

