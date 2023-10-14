public class IAC implements MyInterFace {
    @Override
    public void printName() {
        // TODO Auto-generated method stub
        System.out.println("MyInterface printName");
    }
    public static void main(String[] args) {
        IAC obj = new IAC();
        obj.printName();
        obj.printName2();
    }
}

interface MyInterFace{
    public void printName();
    default void printName2(){
          System.out.println("MyInterface printName2");
    }    
}