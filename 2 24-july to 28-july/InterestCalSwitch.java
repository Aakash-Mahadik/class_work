import java.util.*;

class InterestCalSwitch{

	public static void main(String[]args){

		//scanner class object creation
		Scanner sc = new Scanner(System.in);
		
		//variable decleration
		int Amm,time,ch;
		double intval;

		System.out.println("--Enter your details--");
		System.out.println("Enter the Amm");
		Amm = sc.nextInt();
		System.out.println("Enter the time period in years");
		time = sc.nextInt();

		System.out.println("Enter 1 :if you want to calculate interest rate of fixed deposit");
		System.out.println("Enter 2 :if you want to calculate interest rate of saving interest");
		ch = sc.nextInt();

		switch(ch){
			
			case 1: intval= (Amm*7*time)/100;
				System.out.println("Interest value for fixed deposite is: "+intval);
				System.out.println("total ammount you get after "+time+" years will be "+(Amm+intval));
				break;

			case 2: intval= (Amm*3.5*time)/100;
				System.out.println("Interest value for saving interest is: "+intval);
				System.out.println("total ammount you get after "+time+" years will be "+(Amm+intval));
				break;

			default: System.out.println("wrong choice you have made");
		}


		
	}
}