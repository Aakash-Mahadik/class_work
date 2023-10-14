import java.util.Scanner;

public class AddOop {
    // method to add two numbers using object of the same class
    int num1,num2;
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Addtion is : "+(num1+num2));
    }
    public static void main(String[] args) {
        AddOop obj = new AddOop();
        obj.add();
    }
}
