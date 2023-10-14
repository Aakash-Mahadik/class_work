// Wap to print greater or lesser using if else
/*      if(condition){
	    code;
	}
	else{
   	    code;
	}  */

import java.util.Scanner;

class IfElseDemo{
	public static void main(String[]args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		
		if(num>0){
			System.out.println("The number is positive");
			}
		else{
			System.out.println("The number is negetive or 0");
			}
		sc.close();
	}
}