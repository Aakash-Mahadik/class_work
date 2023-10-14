// Wap to swap two numbers
import java.util.Scanner;
class SwapNum{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//variable declaration
		int num1,num2,temp;
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter secound number: ");
		num2 = sc.nextInt();
		//swapping two number using third variable
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("swaping of numbers is done at num1 we have "+num1+" at num2 we have "+num2);

		//swapping two number without using third variable
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.print("swaping of numbers is done at num1 we have "+num1+" at num2 we have "+num2);
		sc.close();
		}
	}
		