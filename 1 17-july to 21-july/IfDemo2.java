/* Note: while using conditional statement we make use of comparison operators <,>,<=,>=,==,!=   */

// Wap to print greater or lesser

import java.util.Scanner;

class IfDemo2{
	public static void main(String[]args){
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the number: ");
		num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println(num1+" num1 is greater than num2 "+num2);
			}
		if(num1<num2){
			System.out.println(num2+" num2 is greater than num1 "+num1);
			}
		sc.close();
	}
}