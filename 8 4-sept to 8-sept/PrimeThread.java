import java.util.Scanner;

class PrimeNumberCalcultor extends Thread{
    
    int number;
    PrimeNumberCalcultor(int num){
        this.number=num;
    }
    public void run(){
        long primeSum=calculatePrimeSum(number);
        System.out.println("Sum of prime numbers up to " + number + " is: " + primeSum);
    }

    public static long calculatePrimeSum(int n) {
        long primeSum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeSum += i;
            }
        }

        return primeSum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
} 

public class PrimeThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        PrimeNumberCalcultor pnc = new PrimeNumberCalcultor(n);
        pnc.start();

    }

    
}
