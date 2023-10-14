import java.util.Scanner;

class Base{
    Scanner sc = new Scanner(System.in);
    int num1,num2;
    void takeInput(){
        System.out.println("Enter the first number ");
        num1 = sc.nextInt();
        System.out.println("Enter the secound number ");
        num2=sc.nextInt();
    }
}

class Derived extends Base{
    int ans;
    void add(){
        ans=num1+num2;
    }
    void displayAns(){
        //add();             //we can write add function here as well
        System.out.println("The addition is: "+ans);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.takeInput();
        d.add();
        d.displayAns();
    }
}
