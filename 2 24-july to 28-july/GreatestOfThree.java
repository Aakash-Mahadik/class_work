/*WAP to find Greatest among three number using Nested if*/

import java.util.Scanner;                 //Scanner Class is Imported

class GreatestOfThree{

	public static void main(String[]args){

		//Scanner object creation to take user input
		Scanner sc = new Scanner(System.in);

		//variable declaration
		int num1,num2,num3;
		
		System.out.println("Enter your num1");
		num1 = sc.nextInt();       //taking user input

		System.out.println("Enter your num2");
		num2 = sc.nextInt();       //taking user input

		System.out.println("Enter your num3");
		num3 = sc.nextInt();       //taking user input

		//applying condition
		if(num1>num2){              //checking weather num1 is greater than num2
			if(num1>num3){      //checking weather num1 is greater than num3
				System.out.println("num1 is greater than other two, num1 is: "+num1);	//printing num1 is greater
			}else{
				System.out.println("num3 is greater than other two, num2 is: "+num3);   //printing num3 is greater
			}
		}else{
			if(num2>num3){     //checking weather num2 is greater than num3
				System.out.println("num2 is greater than other two, num2 is: "+num2);	//printing num2 is greater
			}else{
				System.out.println("num3 is greater than other two, num3 is: "+num3);   //printing num3 is greater
			}
		}

		sc.close();
	}
}