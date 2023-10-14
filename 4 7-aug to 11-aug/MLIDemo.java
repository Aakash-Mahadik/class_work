/*
 WAP to generate Marksheet of a student based on His personal details and Secured marks.Create PersonalInfo class for accepting student personal information and Create another class MarksInfo for Accepting students marks details and finally create Result class to display all above class information using multilevel Inheritance.
 */

import java.util.Scanner;

class PersonalInfo{
    private String name;
    private int roll_no;
    Scanner sc = new Scanner(System.in);
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setRoll_No(int no){
        this.roll_no = no;
    }
    //getter
    public String  getName(){
        return name;
    }
    public int getRoll_No(){
        return roll_no;
    }
    public void takePersonalInfo(){
        System.out.println("--Personal Details--");
        System.out.println("Enter your name: ");
        setName(sc.nextLine());
        System.out.println("Enter your rollno: ");
        setRoll_No((sc.nextInt()));

    }

}

class MarksInfo extends PersonalInfo{
    float math,science,english ;
    public void takeMarksInfo(){
        System.out.println("--Marks Info--");
        System.out.println("Enter the math marks");
        math = sc.nextFloat();
        System.out.println("Enter the science marks");
        science = sc.nextFloat();
        System.out.println("Enter the english marks");
        english = sc.nextFloat();
    }
}

class ResultDisply extends MarksInfo{
    float percentage;
    public void marksPercentage(){
        percentage = ((math+science+english)/300)*100;
    }
    public void displayResult(){
        System.out.println("---Result---");

        System.out.println("--Personal Details--");
        System.out.println("Student Name   : "+getName());
        System.out.println("Student Roll No: "+getRoll_No());
        
        System.out.println("--marks--");
        System.out.println("Maths marks  : "+math);
        System.out.println("Science marks: "+science);
        System.out.println("English marks: "+english);

        System.out.println("--Grade--");
        if(science<35||math<35||english<35){
            System.out.println("you failed");
        }else if(percentage>=80 ){
            System.out.println("Your grade is A+");
        }else if(percentage>=60){
            System.out.println("your grade is B+");
        }else if(percentage>=50){
        System.out.println("your grade is C+");
        }else if(percentage>=35){
            System.out.println("your grade is D");
        }

        System.out.println("--Remark--");
        if (science<35||math<35||english<35){
            System.out.println("you are lacking in studies. you need to study hard");
        }else if(percentage>80){
            System.out.println("you are going well");
        }else if(percentage>50){
            System.out.println("your marks are good. focus more");
        }else if(percentage>35){
            System.out.println("you need to focus more on study");
        }
        System.out.println("---END---");
    }
}


public class MLIDemo {
    public static void main(String[] args) {
        ResultDisply obj = new ResultDisply();
        obj.takePersonalInfo();
        obj.takeMarksInfo();
        obj.marksPercentage();
        obj.displayResult();        
    }
}
