
class Rectangle1{
    double length;
    double breadth;

    Rectangle1(){
        //these are initial values that we have set we can change it by giving another value
        this.length=11.5;
        this.breadth = 8.2;
    }

    public void rect_area(){
        System.out.println("The area of rectaangle is: "+(length*breadth));
    }
}
public class Rectangle_Const {
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1();
        //rect.length=40;//error
        rect.rect_area();
    }
}
