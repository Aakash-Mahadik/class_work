/*Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods. Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle */

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle is stopping...");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}
