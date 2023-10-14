/*Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/

import java.util.*;           //Scanner Class is Imported

class SumOfEvenOdd{

	public static void main(String[]args){
 		
		//scanner class object creation to take user input
		Scanner sc = new Scanner(System.in);

		//variable declaration
		int num,sumOfEven=0,sumOfOdd=0,choice;

		//applying condition using do while loop
		do{
			System.out.println("Enter your number");
			num=sc.nextInt();          //taking user input

			//this if else is to get sum of even number and odd number
			if(num%2==0){
				sumOfEven+=num;
			}else{
				sumOfOdd+=num;
			}
			
			System.out.println("Enter 1 to continue or 0 to stop");
			choice=sc.nextInt();       //taking user input for choice weather want to continue or not
			
			}while(choice==1);          //condition to check weather user want to continue or not

		//printing result		
		System.out.println("sum of even number is: "+sumOfEven);                   //printing even number sum
		System.out.println("sum of odd number is: "+sumOfOdd);                     //printing odd number sum

		sc.close();
	}
}

			