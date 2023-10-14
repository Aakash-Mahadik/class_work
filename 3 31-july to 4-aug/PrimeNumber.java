/*WAP to take input from user and print weather it is prime or not*/

//importing scanner class for user input
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //scanner class object creation
        Scanner sc = new Scanner(System.in);

        //variable declaration
        int num,count=0;

        System.out.println("Enter the number to check prime or not");
        //taking user input
        num = sc.nextInt();

        //for loop condition which go from 2 to given number divide by 2
        for(int i=2;i<=num/2;i++){

            //this if is to check divisibility of given number
            if(num%i==0){
                count++; 
                //this break works when any number divide the given number
                break;
            } 
        }
        
        //here we are checking that the number is not divisible by any other numbers
        //if count is 0 means it is prime and more than 0 means it's not prime number
        if(count==0){
            System.out.println("the number is prime");
        }else{
            System.out.println("the number is not prime");
        }
        sc.close();

    }
}
