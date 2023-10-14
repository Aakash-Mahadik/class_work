/*WAP to accept number from user and generate Fibonacci series.*/

import java.util.Scanner;
class FiboSeri{
	public static void main(String[]args){
		//Scaner object creation
		Scanner sc = new Scanner(System.in);

		int num,n1=0,n2=1,n3;
		//taking user input
		System.out.println("Enter a number");
		num = sc.nextInt();

		System.out.print(n1+" "+n2);
		//for loop condition
		for(int i=2;i<=num;i++){
			//calculating series number
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

		
	}
}