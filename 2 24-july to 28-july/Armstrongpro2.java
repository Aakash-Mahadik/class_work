//Wap to check whether number is armstrong number or not.

import java.util.*;

class ArmstrongPro2{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int num,i,res=0,rem=0,remd=0,power=0;

		System.out.println("Enter a number");
		num = sc.nextInt();
		i = num;

		while(i!=0){
			power++;
			i=i/10;
		}
		System.out.println("number of Digits "+power);

		i=num;

		//this is for calculation
		while(i!=0){
			rem=i%10;
			remd = rem;
			System.out.print(rem);
			for(int j=1; j<power;j++){
				rem = rem * remd;
			}
			System.out.println(" power of "+power+" is: "+rem);
			res+=rem;
			i=i/10;
		}
		System.out.println("Addition of all above number is: "+res);
		//for printing armstrong or not 
		if(num==res){
			System.out.println("Number is Armstrong number");
		}else{
			System.out.println("Number is not a Armstrong number");
		}

	}
}
			
		