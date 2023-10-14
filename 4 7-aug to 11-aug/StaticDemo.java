class Demo{

    //non-static method
    public void add(int num1,int num2){
        System.out.println("Addition is: "+(num1+num2));
    }

    //static method
    static int multiply(int num1,int num2){
        return (num1*num2);
    }

}

public class StaticDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.add(5, 10);
        System.out.println("Multiplication is: "+Demo.multiply(5, 5));        
    }
}
