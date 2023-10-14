import java.util.Scanner;

class ValidUser{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age>=18){
			System.out.println("User is eligible for vote");
		}
		else{
			System.out.println("User is not eligible for vote");
		}
		sc.close();
	}
}