//WAP to accept percentage from the user and make a decision

import java.util.Scanner;
class DecisionMaking{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int percentage;
		System.out.println("Enter your percentage");
		percentage = sc.nextInt();
		if(percentage>=75){
			System.out.println("User pass the class with distinction");
		}else if(percentage<75 && percentage>=60){
			System.out.println("User pass with first class");
		}else if(percentage<60 && percentage>=45){
			System.out.println("User pass with secound class");
		}else if(percentage<45 && percentage>=35){
			System.out.println("User pass the class");
		}else{
			System.out.println("User fail the class");
		}
		sc.close();
	}
}