import java.util.Scanner;

class Base{
    Scanner sc = new Scanner(System.in);
    int num1,num2,res;
    void takeInput(){
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter secound number");
        num2=sc.nextInt();
    }
}

class D1 extends Base {
    void result(){
        res = num1+num2;
    }
}

class D2 extends D1 {
    void displayAns(){
        System.out.println("Answer is: "+res);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        D2 obj = new D2();
        obj.takeInput();
        obj.result();
        obj.displayAns();
    }
}