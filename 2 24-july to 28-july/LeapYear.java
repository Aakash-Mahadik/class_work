/*Write a Java program that takes a year from the user and prints whether it is a leap year or not.*/

import java.util.Scanner;
class LeapYear{
	public static void main(String[]args){

		//Scanner object creation
		Scanner sc = new Scanner(System.in);

		int year;
		System.out.println("Enter your Year");
		//taking user input
		year= sc.nextInt();

		//applying condition
		//not divisible by 100 because every century year is not a leap year
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println("year is leap year");
		}else{
			System.out.println("year is not a leap year");	
		}

		sc.close();
	}
}