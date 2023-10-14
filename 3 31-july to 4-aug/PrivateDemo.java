/*
 COMPILER ERROR: Cannot access a member of a private class
 COMPILER ERROR: Cannot access a name
 */

class PrivateClass{
    private int age;
    private String name;
}

public class PrivateDemo {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
        //pc.age=20;//COMPILER ERROR: Cannot access a member of a private class
        //System.out.println("Age is "+pc.name);//COMPILER ERROR: Cannot access a

    }
}
