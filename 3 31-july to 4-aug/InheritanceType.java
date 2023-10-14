class A{
    void displayA(){
        System.out.println("Displaying from Class A");
    }
}
class B extends A{
    void displayB(){
        System.out.println("Displaying from Class B");
    }
}

public class InheritanceType {
    public static void main(String[] args) {
        B b = new B();
        b.displayA();
        b.displayB();
    }
}
