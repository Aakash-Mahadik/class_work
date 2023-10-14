//WAP to accept number from user and check if it is divisible by or not 5
 
import java.util.Scanner;

class PositiveOrNegetive{
	public static void main(String[]args){
		//creation of scanner class object
		Scanner sc = new Scanner(System.in);

		//variable declaration
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		//applying condition
		if(num>0){
			System.out.println("number is a positive");
		}else if(num<0){
			System.out.println("number is a negetive");
		}else{
			System.out.println("number is zero");
		}
		sc.close();
	}
}