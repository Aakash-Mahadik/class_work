//WAP to accept number from user and check if it is divisible by or not 5
 
import java.util.Scanner;

class DivisibilityCheck{
	public static void main(String[]args){
		//creation of scanner class object
		Scanner sc = new Scanner(System.in);

		//variable declaration
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		//applying condition
		if(num%5==0){
			System.out.println("number is a divisible by 5");
		}else{
			System.out.println("number is not divisible by 5");
		}
		sc.close();
	}
}