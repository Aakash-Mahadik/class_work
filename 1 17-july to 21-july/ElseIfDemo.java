//WAP to take input as a number from user and based on that decide weather it is greater than 50 or 100 or lesser than 50

/*
	syntax
	if(condition){
	code
	}else if(condition){
	code
	}else{
	code
	}
*/  
import java.util.Scanner;

class ElseIfDemo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		//variable declaration
		int num;
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		if(num>=50 && num<=100){
			System.out.println("you enter the value between 50 to 100");
		}else if(num>100){
			System.out.println("you enter value greater than 100");
		}else{
			System.out.println("you enter value lesser than 50");
		}
		sc.close();
	}
}