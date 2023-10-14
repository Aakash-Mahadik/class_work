/**
 * ConstructoreDemo
 */

 class ConstructoreDemoTry{
    String name;
    int age;
    //Constructor
    public  ConstructoreDemoTry(String name, int age){
        this.name = name;
        this.age=age;
    }
 }
public class ConstructoreDemo {

    public static void main(String[] args) {
        ConstructoreDemoTry cdt = new ConstructoreDemoTry("Aakash", 21);
        System.out.println(cdt.name + " "+ cdt.age );
    }
}