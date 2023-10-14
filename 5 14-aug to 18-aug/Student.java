/*Write a Package MCA which has one class Student. Accept student
	detail through parameterized constructor. Write display () 
	method to display details. Create a main class which will
	use package and calculate total marks and percentage. */

//This program is for Student class which have display details method where details is taken from parameterized constructor

//package creation
package MCA;

public class Student{
    //variable declaration
    double english, maths, physics, chemistry, biology, total, percent;
    String name;
    int rollnumber;

    //constructor
    public Student(String name,int rollnumber,double english,double maths,double physics,double chemistry,double biology,double total,double percent){
        this.name=name;
        this.rollnumber = rollnumber;
        this.english = english;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.total=total;
        this.percent=percent;
    }

    //method for display details
    public void displayInfo(){
        System.out.println("+----------RESULT-------------+");
        System.out.println("Name : "+name );
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

