/*WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.Otherwise Loan can't be given to customer.*/

import java.util.*;   //Scanner class imported

class LoanDecision{

	public static void main(String[]args){

		//Scanner class object creation to take user input
		Scanner sc = new Scanner(System.in);

		//variable declaration
		int salary;
		String country;	

		//taking user input for country
		System.out.println("Enter your country name");
		country = sc.nextLine();	

		//taking user input for salary
		System.out.println("Enter your salary");
		salary = sc.nextInt();

		//aplying condition to check weather salary is greater than 50000 and country is india only
		if(salary>50000 && country.equalsIgnoreCase("india")){
			System.out.println("Person is eligible for loan");      //printing eligiable for loan
		}else{
			System.out.println("person is not eligible for loan");  //printing not eligiable for loan
		}
		sc.close();
	}
}
