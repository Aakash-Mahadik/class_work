import java.util.*;

class CharDemo{

	public static void main(String[]args){

		//scanner class object creation
		Scanner sc = new Scanner(System.in);
		
		//variable decleration
		String name;
		char gender;

		System.out.println("--Enter your details--");
		System.out.println("Enter the name");
		name = sc.nextLine();
		System.out.println("Enter the gender");
		gender = sc.next().charAt(0);

		if(gender == 'm' || gender == 'M'){
			System.out.println("Hello "+name+" you are male and strong");
		}else if(gender == 'f' || gender == 'F'){
			System.out.println("Hello "+name+" you are female and strong as male");
		}else{
			System.out.println("pls enter right gender");
		}

		
	}
}