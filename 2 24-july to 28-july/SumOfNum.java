/*WAP to sum of natural number.*/

import java.util.Scanner;
class SumOfNum{
	public static void main(String[]args){
		//Scaner object creation
		Scanner sc = new Scanner(System.in);

		int num,sum=0;
		//taking user input
		System.out.println("Enter a number");
		num = sc.nextInt();

		//for loop condition
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println("sum of "+num+" natural number is: "+sum);

		
	}
}