// Wap to get Average of numbers
import java.util.Scanner;
class ToGetAvg{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float num1,num2,num3;
		float Avg;
		System.out.println("--to get average of 3 numbers--");
		System.out.println("Enter first number");
		num1 = sc.nextFloat ();
		System.out.println("Enter secound number");
		num2 = sc.nextFloat();
		System.out.println("Enter third number");
		num3 = sc.nextFloat();
		Avg = (num1+num2+num3)/3;
		System.out.println("The Average of 3 numbers is: "+Avg);
	}
}