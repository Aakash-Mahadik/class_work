// LMS question

import java.util.Scanner;

class StreamSug{
	public static void main(String[]args){
		//creating obj for Scanner class
		Scanner sc = new Scanner(System.in);

		//Declaration of variable
		int Eng,Maths,Sci;

		System.out.println("Enter your marks here");

		//taking user input
		System.out.println("Enter the marks of English");
		Eng = sc.nextInt();
		System.out.println("Enter the marks of Maths");
		Maths = sc.nextInt();
		System.out.println("Enter the marks of Science");
		Sci = sc.nextInt();

		//starting for conditions
		
		if(Eng>=80 && Maths>=80 && Sci>=80){
			System.out.println("student can go for pure Science");
		}
		else if(Eng>=80 && Sci>=80 && Maths>=60){
			System.out.println("student can go for Bio Science");
		}
		else if(Eng>=60 && Maths>=60 && Sci>=60){
			System.out.println("student can go for commerce");
		}
		else{
			System.out.println("condition is not given");
		}
		sc.close();
	}
}
