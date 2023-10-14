/*WAP to check whether the number is palindrome or not*/

import java.util.Scanner;
class PalindromePro{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		int num,temp,rem=0,rev=0;
		System.out.println("Enter your number");
		num  = sc.nextInt();
		//assigning num into res for printing that number while printing reason: num is going to 0
		temp = num;    
		
		//while loop condition
		while(temp!=0){
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
			}

		if(num==rev){
			System.out.println("number is a palindrome number");
		}else{
			System.out.println("number is not paindrome number");
		}
		
		
	}
}