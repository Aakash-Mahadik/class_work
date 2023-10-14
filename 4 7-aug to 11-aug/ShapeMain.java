/*create a class Shape with fields length,breadth,radius and other two classes rectangle and Circle extending from that Shape class.Apply other methods to calculate area of rectangle and circle */

class Shape{
    double length,breadth,radius;
    Shape(){
        this.length=5.2;
        this.breadth=6.07;
        this.radius=3.1;
    }
}
class Rectangle extends Shape{
    public void rectArea(){
        System.out.println("The area of rectangle is: "+(length*breadth));
    }
    public double rectPerimeter(){
        return 2*(length+breadth);
    }
}

class Circle extends Shape{
    public void circleArea() {
        System.out.println("The area of circle is: "+(Math.PI*radius*radius));
    }
    public double circlePerimeter(){
        return 2*Math.PI*radius;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.rectArea();
        System.out.println("The perimeter is :"+rect.rectPerimeter());
        Circle c = new Circle();
        c.circleArea();
         System.out.println("The perimeter is :"+c.circlePerimeter());
    }
}
