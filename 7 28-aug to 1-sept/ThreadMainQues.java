// Write a JAVA program which will generate the threads:
//- To display 10 terms of Fibonacci series.
//- To display 1 to 10 in reverse order.


//create thread for fibonacci series using runnable interface
class FibonacciRunnable implements Runnable {
    @Override
    public void run() {
        int n = 10,temp;
        
        System.out.println("Fibonacci series:");
        //fibonacci logic
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}

//create thread for reverse order using runnable interface
class ReverseOrderRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Numbers in reverse order:");
        //reverse order logic
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
public class ThreadMainQues {
    public static void main(String[] args) {
        // Create and start the Fibonacci thread
        Thread fibonacciThread = new Thread(new FibonacciRunnable());
        fibonacciThread.start();

        // Create and start the reverse order thread
        Thread reverseOrderThread = new Thread(new ReverseOrderRunnable());
        reverseOrderThread.start();
    }
}




