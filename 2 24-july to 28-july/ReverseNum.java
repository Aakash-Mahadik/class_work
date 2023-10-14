/*WAP a program to accept numbers from user and find sum of digits.*/

import java.util.Scanner;
class ReverseNum{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		int num,i,rem=0,rev=0;
		System.out.println("Enter your number");
		num  = sc.nextInt();
		//assigning num into res for printing that number while printing reason: num is going to 0
		i = num;    
		
		//while loop condition
		while(i!=0){
			rem = i%10;
			rev = rev*10+rem;
			i = i/10;
			}
		System.out.println("reverse of your num "+num+" is: "+rev);
		
		
	}
}