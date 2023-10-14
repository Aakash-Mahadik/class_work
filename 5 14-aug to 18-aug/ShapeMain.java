/*Create a superclass called "Shape" with properties like "numSides" and "color". Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. Write a Java program to display the details of a triangle, a square, and a circle. */


import java.util.Scanner;
class Shape{
    public int numSides;
    public String color;
    public Shape(int numSides,String color){
        this.numSides = numSides;
        this.color=color;
    }
    public void displayDetails(){
        System.out.println("Number of sides: "+this.numSides);
        System.out.println("Color: "+this.color);
    }

}
class Triangle extends Shape{
    Scanner sc = new Scanner(System.in);
    int side1,side2,side3,base,height;
    //Constructor for triangle class
    Triangle (int numSides , String color){
        super(numSides, color);
    }
    public void displayDetails(){
        System.out.println("\nShape : Triangle");
        super.displayDetails();
    }
    public void takeInput(){
        System.out.println("\nEnter the information for Triangle");
        System.out.print("Enter Side 1: ");
        this.side1 =sc.nextInt();
        System.out.print("Enter Side 2 : ");
        this.side2 =sc.nextInt();
        System.out.print("Enter Side 3 : ");
        this.side3 =sc.nextInt();
        System.out.print("Enter Base: ");
        base =sc.nextInt();
        System.out.print("Enter Height: ");
        height =sc.nextInt();
    }
    public void getArea(){
        System.out.println("Area of triangle is: "+(height*base)/2);
    }
    public void getPerimeter(){
        System.out.println("Perimeter of tringle is: "+(side1+side2+side3));
    }
}
class Square extends Shape{
    Scanner sc = new Scanner(System.in);
    int side;
    Square (int numSides , String color){
        super(numSides, color);
    }
    public void displayDetails(){
        System.out.println("\nShape : Square");
        super.displayDetails();
    }
    public void takeInput(){
        System.out.println("\nEnter the information for Square");
        System.out.print("Enter Side : ");
        this.side =sc.nextInt();
        
    }
    public void getArea(){
        System.out.println("Area of Square is: "+(side*side));
    }
    public void getPerimeter(){
        System.out.println("Perimeter of Square is: "+(4*side));
    }
}
class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    float radius;

    Circle (int numSides , String color){
        super(numSides, color);
    }
    public void displayDetails(){
        System.out.println("\nShape : Circle");
        super.displayDetails();
    }
    public void takeInput(){
        System.out.println("\nEnter the information for Circle");
        System.out.print("Enter radius: ");
        this.radius =sc.nextFloat();
        sc.close();
    }
    public void getArea(){
        System.out.println("Area of Circle is: "+(Math.PI*radius*radius));
    }
    public void getPerimeter(){
        System.out.println("Perimeter of Circle is: "+(2*Math.PI*radius));
    }
}


public class ShapeMain {
    public static void main(String[] args) {
        Triangle triobj = new Triangle(3,"red");
        triobj.displayDetails();
        triobj.takeInput();
        triobj.getArea();
        triobj.getPerimeter();
        Square sqrobj=new Square(4,"green");
        sqrobj.displayDetails();
        sqrobj.takeInput();
        sqrobj.getArea();
        sqrobj.getPerimeter();
        Circle circobj=new Circle(0,"pink");
        circobj.displayDetails();
        circobj.takeInput();
        circobj.getArea();
        circobj.getPerimeter();


    }
}
