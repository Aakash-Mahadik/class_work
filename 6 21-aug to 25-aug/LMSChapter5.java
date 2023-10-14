import java.util.Scanner;

class LMS5 {

    //it is accessiable in any method or function in this class
    int globalVariable=2;
    //this is static variable 
    static int staticVariable=1;

    public void something() {
        //it is accessiable only for this method out side of method it is not accessiable
        int localVariable=0;
        System.out.println(localVariable);
        System.out.println(staticVariable);
        System.out.println(globalVariable);
    }

    // public void something1(){
    //     System.out.println(localVariable);
    //     System.out.println(staticVariable);
    //     System.out.println(globalVariable);
    // }

}


public class LMSChapter5 {
    public static void main(String[] args) {
        LMS5 chapter = new LMS5();
        chapter.something();

        //type castimg

        //narrowing casting
        // double number = 123456.2244d;
        // float number1 = (float)number;
        // long number2 = (long)number;
        // int number3 = (int)number;
        // short number4 = (short)number;
        // byte number5 = (byte)number;

        // System.out.println(number+"\n"+number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5);

        //type castimg

        //widening casting
        // byte number0 = 127;
        // short  number01 = number0;
        // int  number02 = number0;
        // long number03 = number0;
        // float number04 = number0;
        // double number05 = number0;

        // System.out.println(number0+"\n"+number01+"\n"+number02+"\n"+number03+"\n"+number04+"\n"+number05);

        //WAP to accept salary from user and typecast it into double after adding bonus (11 % of salary)into it
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your salary and get 11% bonus");
        // int salary = sc.nextInt();
        // double bonusSal = salary + (salary/100)*11;
        // System.out.println("Your bounse salary is: "+bonusSal);
        // sc.close();

    }
}
