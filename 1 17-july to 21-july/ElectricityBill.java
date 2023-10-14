/*Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
1 to 100 units – Rs. 10/unit

·      100 to 200 units – Rs. 15/unit

·      200 to 300 units – Rs. 20/unit

·      above 300 units – Rs. 25/unit*/

import java.util.Scanner;

class ElectricityBill{
	public static void main(String[]args){
		//creation of obj
		Scanner sc = new Scanner(System.in);
		int unit,billAmm;
		
		System.out.println("Enter the Units ");
		//taking user input
		unit = sc.nextInt();

		//applying conditions
		if(unit<=100){
			billAmm=10*unit;
		}else if(unit<=200){
			billAmm=(10*100)+((unit-100)*15);
		}else if(unit<=300){
			billAmm=(10*100)+(15*100)+((unit-200)*20);
		}else{
			billAmm=(10*100)+(15*100)+(20*100)+((unit-300)*25);
		}
		
		//printing bill ammount
		System.out.println("Your bill ammount for "+unit+"  units is: "+billAmm);
		sc.close();
	}
}
