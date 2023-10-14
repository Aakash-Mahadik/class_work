import java.util.*;

public class Student{

	String name;
	int rollno,age;

	public void takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your rollno: ");
		rollno = sc.nextInt();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
	}
		
	public void info(){
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Age: "+age);
	}
	
	public void classDecision(){
		if(age>18){
			System.out.println(name+" is doing there gradution" );
		}else if(age>15 && age<=18){
			System.out.println(name+" is in high school" );
		}else if(age>10 && age<=15){
			System.out.println(name+" is in between class 6th to 10th" );
		}else{
			System.out.println(name+" is in between class 1st to 5th" );
		}
	}	

	public static void main(String []args){

		Student student = new Student();

		//calling method
		student.takeInput();
		student.info();
		student.classDecision();
	}
}