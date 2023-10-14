interface Shape{
    //interface contain abstract method only. even though you write abstract or not it will be abstract only
    //you can declare variable but this variable will become public, static, final
    int para1 = 15;
    abstract void area();
    void parameter();
}
interface Color{
    void mycolor();
}
class Circle implements Shape{ 
    @Override
    public void area(){
        System.out.println("i will give area Circle");
    }
    public void parameter(){
        System.out.println("i will give parameter Circle");
    }
}
class Rectangale extends Circle implements Shape,Color{ //you can implement multiple interfaces and one class can be extended
    @Override
    public void area(){
        super.area();
        System.out.println("i will give area Rectangale");
    }
    public void parameter(){
        super.parameter();
        System.out.println("i will give parameter Rectangale");
    }
    @Override
    public void mycolor() {
        // TODO Auto-generated method stub
        System.out.println("My color is blue");
    }
    
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape c = new Circle();
        //c.para1 = 10;  //error this cannot be changed because it is final
        //System.out.println(c.para1);
        c.area();
        c.parameter();
        Rectangale r = new Rectangale();
        r.mycolor();
        r.area();
        System.out.println("END PROGRAM");
    }
}

