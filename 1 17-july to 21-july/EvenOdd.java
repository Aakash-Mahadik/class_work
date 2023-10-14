//Wap to find number is even or odd
import java.util.Scanner;

class EvenOdd{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter your number: ");
		num = sc.nextInt();
		if(num%2==0){
			System.out.println("your number is even.");
		}
		else{
			System.out.println("your number is odd.");
		}
		sc.close();
	}
}