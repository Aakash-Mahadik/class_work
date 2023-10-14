/*Wap to accept age and weight and make a decision whether he can donate a blood or not
If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not.*/

import java.util.Scanner;
class NestedIf2{
	public static void main(String[]args){

		//Scanner object creation
		Scanner sc = new Scanner(System.in);

		int age;
		float weight;
		System.out.println("Enter your age");
		//taking user input
		age = sc.nextInt();
		System.out.println("Enter your weight");
		weight = sc.nextFloat();

		//applying condition
		//not divisible by 100 because every century year is not a leap year
		if(age>18){
			System.out.println("Yes, Your Age criteria is satisfied");
			if(weight>50){
			System.out.println("Yup, Your weight criteria is also satisfied");
			System.out.println("Now, you can donate the blood");
			}else{
			System.out.println("but, Your weight criteria is not satisfied");
			System.out.println("No, you can not donate the blood");	
			}
		}else{
			System.out.println("Your age criteria is not satisfied");
			System.out.println("No, you can not donate the blood");		
		}

		sc.close();
	}
}