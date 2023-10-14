/*WAP to accept Salary from the user and make a decision as per given condition
sal>=50000      print "I am happy"
sal>=75000  print "I have better life"
sal>-=100000 print "My family is happy with me"*/



import java.util.Scanner;

class ElseIfDemo3{
	public static void main(String[]args){
		
		//Scanner class object creation
		Scanner sc = new Scanner(System.in);
		//variable declaration
		int sal;

		//taking user input
		System.out.println("Enter your salary");
		sal = sc.nextInt();

		//applying condition
		if(sal>=100000){
			System.out.println("My family is happy with me!");
		}else if(sal>=75000){
			System.out.println("I have better life!");
		}else if(sal>=50000){
			System.out.println("I am happy!");
		}else{
			System.out.println("I am not satisfied with my salary");
		}
		sc.close();
	}
}