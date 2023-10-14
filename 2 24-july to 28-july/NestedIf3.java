/*WAP to find greates among three using nested if*/

import java.util.Scanner;
class NestedIf3{
	public static void main(String[]args){

		//Scanner object creation
		Scanner sc = new Scanner(System.in);

		int num1,num2,num3;
		
		System.out.println("Enter your num1");
		//taking user input
		num1 = sc.nextInt();
		System.out.println("Enter your num2");
		num2 = sc.nextInt();
		System.out.println("Enter your num3");
		num3 = sc.nextInt();

		//applying condition
		if(num1>num2){
			if(num1>num3){
				System.out.println("num1 is greter than other two num1 is: "+num1);	
			}else{
				System.out.println("num3 is greater than other two num2 is: "+num3);
			}
		}else{
			if(num2>num3){
				System.out.println("num2 is greter than other two num2 is: "+num2);	
			}else{
				System.out.println("num3 is greater than other two num3 is: "+num3);
			}
		}

		sc.close();
	}
}