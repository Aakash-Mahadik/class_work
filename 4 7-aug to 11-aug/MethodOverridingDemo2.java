/*WAP to get details  of vehicle i.e. Bike and Car.Override engine() method to describe both bike and car
create Vehicle as base class and BIke ,Car as derived class */
class Vehicle{
    public void engine(){
        System.out.println("Every vehicle have engine. without engine vehicle wont run");
    }
}
class Bike extends Vehicle{
    @Override
    public void engine(){
        super.engine();
        System.out.println("This is bike engine");
    }
}

class Car extends Vehicle{
    @Override
    public void engine(){
        super.engine();
        System.out.println("This is car engine");
    }
}

public class MethodOverridingDemo2 {
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car();
        b.engine();
        c.engine();
    }
}
