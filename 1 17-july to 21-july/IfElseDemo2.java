// Wap to print greater or lesser using if else

import java.util.Scanner;

class IfElseDemo2{
	public static void main(String[]args){
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		num2 = sc.nextInt();
		
		
		if(num1>num2){
			System.out.println("num1 is greter than num2");
			}
		else{
			System.out.println("num2 is greter than num1");
			}
		sc.close();
	}
}