//WAP to accept three numbers from users and make a desicion which is the greatest number among three
 
import java.util.Scanner;

class LargestOfThree{
	public static void main(String[]args){
		//creation of scanner class object
		Scanner sc = new Scanner(System.in);

		//variable declaration
		int num1,num2,num3;
		System.out.println("Enter the 1st number");
		num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		num2 = sc.nextInt();
		System.out.println("Enter the 3rd number");
		num3 = sc.nextInt();

		//applying condition
		if(num1>num2 && num1>num3){
			System.out.println("1st number is largest than other two");
		}else if(num2>num1 && num2>num3){
			System.out.println("2nd number is largest than other two");
		}else if(num3>num1 && num3>num2){
			System.out.println("3rd number is largest than other two");
		}else{
			System.out.println("condition is not given");
		}
		sc.close();
	}
}