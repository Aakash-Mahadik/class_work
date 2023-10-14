/* Note: while using conditional statement we make use of comparison operators <,>,<=,>=,==,!=   */

// Wap to print welcome to java programming if user enters postive integers

import java.util.Scanner;

class IfDemo{
	public static void main(String[]args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		if(num>0){
			System.out.println("Welcome to the java programing");
			}
		System.out.println("Enjoy Learning");
	}
}