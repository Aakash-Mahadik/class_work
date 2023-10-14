/*Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle. */

import java.util.Scanner;

abstract class Shape{
    public abstract void getArea();
}
class Rectangle extends Shape{
    int length,breadth;
    Rectangle(int l,int b){
        this.length=l;
        this.breadth =b;
    }
    public void getArea(){
        System.out.println("Area of rectangle is: "+(length*breadth));
    }
    
}
class Circle extends Shape{
    float radius;
    Circle(float r){
        this.radius=r;
    }
    public void getArea(){
        System.out.println("Area of Circle is: "+(Math.PI*radius*radius));
    }

}

public class ShapeMain1{
    public static void main(String[] args) {
        int l,b;
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for rectangle: ");
        l =sc.nextInt();
        System.out.print("Enter breadth for rectangle: ");
        b =sc.nextInt();
        Rectangle rect = new Rectangle(l, b);
        rect.getArea();

        System.out.print("\nEnter radius for circle: ");
        r =sc.nextFloat();
        Circle cir =new Circle (r);
        cir.getArea();
        sc.close();
    }
}
