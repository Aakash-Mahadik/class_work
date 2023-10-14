import java.util.Scanner;

class Calc{
    int num1,num2,ans;
    public void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1=sc.nextInt();
        System.out.print("Enter secound number: ");
        num2 = sc.nextInt();
    }
    public void addNum(){
        ans = num1+num2;
        System.out.println("Addition of numbers is: "+ans);
    }
    public void subNum(){
        ans = num1-num2;
        System.out.println("Subtraction of numbers is: "+ans);
    }
    public void mulNum(){
        ans = num1*num2;
        System.out.println("Multiplication of numbers is: "+ans);
    }
    public void divNum(){
        ans = num1/num2;
        System.out.println("Division of numbers is: "+ans);
    }
}


public class SimpleCalc{
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.takeInput();
        obj.addNum();
	obj.subNum();
	obj.mulNum();
	obj.divNum();
    }
}