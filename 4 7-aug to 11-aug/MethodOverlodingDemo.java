public class MethodOverlodingDemo {
    int add(int num1, int num2){
        return num1+num2;
    }
    int add(int num1, int num2,int num3){
        return num1+num2+num3;
    }
    int add(int num1, int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) {
        MethodOverlodingDemo obj = new MethodOverlodingDemo();
        //first add method
        System.out.println("addition is: "+obj.add(5,5));
        //call secound add method
        System.out.println("addition is: "+obj.add(5,5,5));
        //call third add metod
        System.out.println("addition is: "+obj.add(5,5,5,5));
    }
}
