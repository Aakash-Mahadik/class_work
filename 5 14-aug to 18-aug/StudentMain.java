/*Write a Package MCA which has one class Student. Accept student
	detail through parameterized constructor. Write display () 
	method to display details. Create a main class which will
	use package and calculate total marks and percentage. */

//This program is for main method from we are calling disply method of student class which in MCA package


//importing student class from MCA package and scanner class
import MCA.Student;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        //creating object of Scanner class for taking input 
        Scanner sc = new Scanner(System.in);

        //variable declaration
        double english, maths, physics, chemistry, biology, total, percent;
        String name;
        int rollnumber;

        //taking student information
        System.out.println("Enter the Students Name :");
        name = sc.nextLine();
        System.out.println("Enter the Students Rollnuumber :");
        rollnumber = sc.nextInt();    

        System.out.println("Marks obtained in English :");
        english = sc.nextInt();
        System.out.println("Marks obtained in maths :");
        maths = sc.nextInt();
        System.out.println("Marks obtained in physics :");
        physics = sc.nextInt();
        System.out.println("Marks obtained in chemistry :");
        chemistry = sc.nextInt();
        System.out.println("Marks obtained in biology :");
        biology = sc.nextInt();

        total = english+maths+physics+chemistry+biology;
        percent = (total/5)%100;

        //Creating an object of Student Class with parameters passed
        Student studobj = new Student(name,rollnumber,english, maths, physics, chemistry, biology, total, percent);

        //calling method of student class
        studobj.displayInfo();

        

    }
}
