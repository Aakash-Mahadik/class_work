
/*WAP to swap two numbers without using third variable */

//importing scanner class
import java.util.Scanner;

class SwapNum{
    //variable declaration
    int num1,num2;
    //scanner class object creation
    Scanner sc = new Scanner(System.in);

    //method for taking user input
    public void acceptInput(){
        System.out.println("Enter the first number");
        this.num1=sc.nextInt();
        System.out.println("Enter second Number");
        this.num2=sc.nextInt();
        System.out.println("--Before Swapping--");
        System.out.println("num1 is " + num1 +" and num2 is " + num2);
        //call to method swap()
        swap(this.num1,this.num2);

    }

    //method for swapping number and showing swapped numbers
    public void swap(int num1, int num2){
        //swap without extra variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("--After Swapping--");
        System.out.println("num1 is " + num1 +" and num2 is " + num2);
    }
}
public class SwapNumMain {
    
    public static void main(String[] args) {
        
        //object creaction of SwappNum class
        SwapNum obj = new SwapNum();
        //calling method
        obj.acceptInput();
    }
}
