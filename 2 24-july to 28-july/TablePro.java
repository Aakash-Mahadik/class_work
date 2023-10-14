/*WAP to accept number from user and generate table of it.*/

import java.util.Scanner;
class TablePro{
	public static void main(String[]args){
		//Scaner object creation
		Scanner sc = new Scanner(System.in);

		int num;
		//taking user input
		System.out.println("Enter a number");
		num = sc.nextInt();

		//for loop condition
		for(int i=1;i<=10;i++){
			System.out.println(num+" * "+i+" = "+num*i);
		}

		
	}
}