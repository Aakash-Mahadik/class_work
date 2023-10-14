/*WAP to calculate area of rectangle, area of Square and area of circle using method overloading */
/*Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both. */

public class CalcArea {
    //this is taking two parameter so this is for rectangle area 
    public int Area(int l, int b){
        return l*b;
    }
    //this is taking one parameter so this for squre area
    public int Area(int side){
        return side*side;
    }
    //this is taking one parameter but of differnt type. this for circle area
    public double Area(float r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        CalcArea c = new CalcArea();
        //calling method for rectangle area
        System.out.println("area of rectangle is: "+c.Area(10,5));
        //calling method for square area
        System.out.println("area of square is: "+c.Area(5));
        //calling method for circle area
        System.out.println("area of circle is: "+c.Area(3.5f));

    }
}
