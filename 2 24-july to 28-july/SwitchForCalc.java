/*WAP to make decision which day of week is selected by user as week-off.*/

import java.util.*;

class SwitchForCalc{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		float num1,num2;
		int ch;
		boolean flag = true;
		System.out.println("Enter a 1st number");
		num1 = sc.nextInt();
		System.out.println("Enter a 2nd number");
		num2 = sc.nextInt();

		System.out.println("--choices are given below--");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multipliction");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 0 for exit");
				    
		
		while(flag){
			System.out.println("Enter your choice");
			ch = sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("Addition of numbers is: "+(num1+num2));
			flag = true;
			break;
		case 2:
			System.out.println("subtraction of numbers is: "+(num1-num2));
			flag = true;
			break;
		case 3:
			System.out.println("multipliction of numbers is: "+(num1*num2));
			flag = true;
			break;
		case 4:
			System.out.println("division of numbers is: "+(num1/num2));
			flag = true;
			break;
		case 0:
			System.out.println("User exit from loop");
			flag = false;
			break;
		default:
			System.out.println("User entered invalid input");
		}
		}

		
	}
}
			
		