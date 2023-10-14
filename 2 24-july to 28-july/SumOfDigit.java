/*WAP a program to accept numbers from user and find sum of digits.*/

import java.util.Scanner;
class SumOfDigit{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		int num,i,rem=0,sum=0;
		System.out.println("let's try with while loop");
		System.out.println("Enter your number");
		num  = sc.nextInt();
		//assigning num into res for printing that number while printing reason: num is going to 0
		i = num;    
		
		//while loop condition
		while(i!=0){
			rem = i%10;
			sum+=rem;
			i = i/10;
			}
		System.out.println("sum of digit of your num "+num+" is: "+sum);
		System.out.println();

		
		
		//using for loop in differnt way
		int num2,sum2=0,rem2=0;
		System.out.println("let's try with for loop");
		System.out.println("Enter your number");
		num2 = sc.nextInt();

		for(int j=num2;j>0;j/=10){
			rem2 = j%10;
			sum2 += rem2;
		}
		System.out.println("sum of digit of your num "+num2+" is: "+sum2);
		
	}
}