//Wap to check whether number is armstrong number or not.

import java.util.*;
import java.lang.*;

class ArmstrongPro{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int num,i,res=0,rem=0;

		System.out.println("Enter a number");
		
		num = sc.nextInt();
		i = num;

		//this is for calculation
		while(i!=0){
			rem=i%10;
			rem=rem*rem*rem;
			res+=rem;
			i=i/10;
			}

		//for printing armstrong or not 
		if(num==res){
			System.out.println("Number is Armstron number");
		}else{
			System.out.println("Number is not a Armstrong number");
		}

	}
}
			
		