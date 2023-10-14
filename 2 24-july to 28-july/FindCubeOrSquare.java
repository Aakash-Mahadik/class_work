/*WAP to accept number from the user ,if it is odd find cube of it otherwise find square of that number.(Do not accept input as zero)*/

import java.util.Scanner;
class FindCubeOrSquare{
	public static void main(String[]args){

		//Scanner object creation
		Scanner sc = new Scanner(System.in);

		int num,result=0;
		System.out.println("Enter your number");
		//taking user input
		num= sc.nextInt();

		//applying condition
		if(num==0){
			System.out.println("Zero is not acceptable");
		}else if(num%2==0){
			result=num*num;
			System.out.println("Ans is: "+result);
		}else{
			result=num*num*num;
			System.out.println("Ans is: "+result);	
		}

		sc.close();
	}
}