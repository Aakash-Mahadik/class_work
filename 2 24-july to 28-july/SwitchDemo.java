/*WAP to make decision which day of week is selected by user as week-off.*/

import java.util.*;

class SwitchDemo{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Enter a number from 1 to 7 to select weekly of");
		num = sc.nextInt();
		
		switch(num){
		case 1:
			System.out.println("User selected monday as week off");
			break;
		case 2:
			System.out.println("User selected tuesday as week off");
			break;
		case 3:
			System.out.println("User selected wednesday as week off");
			break;
		case 4:
			System.out.println("User selected thusday as week off");
			break;
		case 5:
			System.out.println("User selected friday as week off");
			break;
		case 6:
			System.out.println("User selected saturday as week off");
			break;
		case 7:
			System.out.println("User selected sunday as week off");
			break;
		default:
			System.out.println("User entered invalid input");
		}

		
	}
}
			
		