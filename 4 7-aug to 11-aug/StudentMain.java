/*Create a class Student having rool_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result */

//importing scanner class
import java.util.Scanner;

class Student{
    //creating object of scanner class
    Scanner sc = new Scanner(System.in); 

    //Initializing variables
    String Name;
    int rollnumber;
    double english,maths,physics,chemistry,biology,total,percent;
    
    //method for taking personal details inputs 
    public void takeInput()
    {
        System.out.println("Enter the Students Name :");
        Name = sc.nextLine();
        System.out.println("Enter the Students Rollnuumber :");
        rollnumber = sc.nextInt();    
    }  
}

class Marksdetails extends Student{
    //method for taking marks as inputs
    public void takeMarksInput()
    {
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
    }   
    
    //method for displaying result
     public void display()
    {
        //calculating percentage and total marks 
        total = english+maths+physics+chemistry+biology;
        percent = (total/5)%100;

        System.out.println("+----------result-------------+");
        System.out.println("Name : "+Name );
        System.out.println("Roll Number : "+rollnumber);
        
        System.out.println("+------------+----------------+");
        System.out.println("|Subject     |   Marks        |");
        System.out.println("+------------+----------------+");
        System.out.println("|English     |   "+english+"         |  ");
        System.out.println("+------------+----------------+");
        System.out.println("|Maths       |   "+maths+"         |  ");
        System.out.println("+------------+----------------+");
        System.out.println("|Physics     |   "+physics+"         |  ");
        System.out.println("+------------+----------------+");
        System.out.println("|Chemistry   |   "+chemistry+"         |  ");
        System.out.println("+------------+----------------+");
        System.out.println("|Biology     |   "+biology+"         |  ");
        System.out.println("+------------+----------------+");
        System.out.println("|Total Marks |   "+total+"/"+500+"    |  ");
        System.out.println("+------------+----------------+");
        System.out.println("|Percentage  |   "+ percent + "%"+"        |  ");
        System.out.println("+------------+----------------+");
        
        //for displaying weather pass or failed
        if(english<35||maths<35||physics<35||chemistry<35||biology<35){
            System.out.println("|Result      |   Failed       |  ");
        }else{
            System.out.println("|Result      |   Passed       |  ");  
        }
        System.out.println("+------------+----------------+");

    }
}
public class StudentMain {
    public static void main(String[] args) {
        //object creation of Marksdetails class
        Marksdetails obj = new Marksdetails();

        //calling methods
        obj.takeInput();
        obj.takeMarksInput();
        obj.display();
    }
}