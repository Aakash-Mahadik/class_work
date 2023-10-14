/*WAP to accept Character from user and make a decision whether is vowel or consonent*/

import java.util.*;

class SwitchChar{

	public static void main(String[]Args){

		Scanner sc = new Scanner(System.in);
		
		char ch;

		System.out.println("Enter any character");
		ch = sc.next().charAt(0);

		System.out.println("This output from switch case");
		//using switch case
		switch(ch){

			case 'a':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'e':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'i':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'o':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'u':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'A':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'E':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'I':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'O':
				System.out.println("Yes, This letter is vowel");
				break;
			case 'U':
				System.out.println("Yes, This letter is vowel");
				break;
			default: 
				System.out.println("NO, This letter is not vowel, This is consonant");
				break;
			}

			System.out.println("This output from if else");
			//using if else
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='O' || ch=='E' || ch=='U'){
				System.out.println("Yes, This letter is vowel");
			}else{
				System.out.println("NO, This letter is not vowel, This is consonant");
			}
			sc.close();
		}
	}
		