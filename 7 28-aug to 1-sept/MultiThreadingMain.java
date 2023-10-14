// WAP to implement multithreading for Reversing user input as integer number and reverse that number in one thread and create another thread to check whether that number is palindrome or not apply proper methods

import java.util.Scanner;

class RevNumber extends Thread{
    //variable decleration
    public int originalNum;
    public int reverseNum;

    //constructore
    RevNumber(int number){
        this.originalNum = number;
    }

    //overriden method
    public void run(){
        reverseNum = reverseNumber(originalNum);
        System.out.println("Reversed Number is: "+reverseNum);
    }

    //method to return value
    public int getRevNum(){
        return reverseNum;
    }

    //method for reversing number
    public int reverseNumber(int number){
        int reversed =0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
        
    }
}

class PalindromeCheck extends Thread{
    //variable decleration
    int originalNum;
    int revNum;

    //constructore
    PalindromeCheck(int number, int revNum){
        this.originalNum = number;
        this.revNum = revNum;
    }

    //overriden method
    public void run(){
        boolean ispalindromeNum = ispalindrome();
        if(ispalindromeNum){
            System.out.println("The Number is Palindrome");
        }else{
            System.out.println("The Number is Not a palindrome");
        }
    }

    //method for finding number is palindrome or not
    public boolean ispalindrome(){
        return originalNum==revNum;
    }
}
public class MultiThreadingMain {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner sc = new Scanner(System.in);
        int Num;

        //taking user input
        System.out.println("Enter a number to check palindrome ");
        Num = sc.nextInt();

        //creating thread objects for reversing and starting and giving number
        RevNumber rv = new RevNumber(Num);
        rv.start();
        try {
            rv.join(); // Wait for RevNumber thread to finish before accessing reversed number

        } catch (InterruptedException e) {
            System.out.println(e);
        }
        //creating thread objects for palindrome and starting and giving values
        PalindromeCheck pc = new PalindromeCheck(Num,rv.getRevNum());
        pc.start();

        sc.close();
    }
}
