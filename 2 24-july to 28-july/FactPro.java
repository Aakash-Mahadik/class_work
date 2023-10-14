/*Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output.
fact=fact*i
*/

import java.util.*;

class FactPro{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int num;
		long res=1;

		System.out.println("Enter a number");
		num = sc.nextInt();
		
		for(int i=num; i>0;i--){
			res *=i;
		}
		
		System.out.println("Factorial of number is: "+res);

		
	}
}
			
		