//scanner class and arithmatic opretor
import java.util.Scanner;
class Arithmatic{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("The addition of no is: "+res);
	        res = num1 - num2;
		System.out.println("The substraction of no is: "+res);
		res = num1 * num2;
		System.out.println("The multiplication of no is: "+res);
		res = num1 / num2;
		System.out.println("The division of no is: "+res);
		res = num1 % num2;
		System.out.println("The modulas of no is: "+res);
		}
	}
		
		