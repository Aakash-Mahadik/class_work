/*Write a Java program that takes an integer as input and checks if it is divisible by 5 and 11. Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.*/

import java.util.Scanner;
class CheckDivisibilty{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter your number");
		num= sc.nextInt();
		if(num%5==0 && num%11==0){
			System.out.println("the number is divisible by 5 and 11");
		}else{
			System.out.println("number is not divisible by 5 and 11");
		}
		sc.close();
	}
}