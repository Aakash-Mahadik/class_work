/*WAP program to accept a number and check whether it is less than 100,greater than 50 else greater than 100*/

import java.util.Scanner;
class NestedIf{
	public static void main(String[]args){

		//Scanner object creation
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter your Number");
		//taking user input
		num = sc.nextInt();

		//applying condition
		//not divisible by 100 because every century year is not a leap year
		if(num<100){
			System.out.println("Number is less than 100");
			if(num>50){
			System.out.println("Number is greater than 50");
			}else{
			System.out.println("Number is less than 50");	
			}
		}else{
			System.out.println("Number is greater than 100");	
		}

		sc.close();
	}
}