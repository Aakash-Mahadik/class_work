abstract class Calc{
    //abstract class can have both regular as well as abstract method
    //***but regular class can not contain abstract method
    int num1=3;
    int num2=4;  //variables can not be abstract
    void calc(){
        System.out.println("This is in calc class");
    }
    public abstract void addition();
}

class Add extends Calc{ 
    //when we inherite abstract class if that class have abstract method we need to override that method
    public void addition(){
        calc();
        System.out.println(num1+num2);
    }
    void add(){
        System.out.println("This is in Add class");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        //Calc c = new Calc(); abstract class can not be instantiated
        Add add = new Add();
        add.addition();
    }
}
