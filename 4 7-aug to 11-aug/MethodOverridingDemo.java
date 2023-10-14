//class Animal
class Animal{
    void eat(){
        System.out.println("I can eat");
    }
}

//class Dog inheriting class Animal
class Dog extends Animal{
    //here we have over ride the eat method
    @Override
    void eat(){
        super.eat();
        System.out.println("I am eating");
    }
    //new method of subclass
    void bark(){
        System.out.println("i can bark");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        //create an object of subclass which is Dog
        Dog labrador = new Dog();
        //calling methods of subclass
        labrador.eat();
        labrador.bark();
    }
}
