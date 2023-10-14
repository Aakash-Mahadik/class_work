class Person{
    int unique_id,age;
    String city,gender;
    void study(){
        //studying logic here...
        System.out.println("Person is Studying...");
    }
    void sleep(){
        //sleeping logic here..
        System.out.println("Person is Sleeping....");
    }
    void play(){
        //playing logic here.....
        System.out.println("Person is Playing Guitar.");
    }
    void displayInfo(){
        //displying information taken..
        System.out.println("My unique_id is: "+unique_id);
        System.out.println("My age is "+age);
        System.out.println("I am a "+gender);
        System.out.println("I am living in "+city);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.unique_id=10234;
        obj.age = 21;
        obj.city ="Mumbai";
        obj.gender="Male";

        obj.study();
        obj.sleep();
        obj.play();
        obj.displayInfo();
    }
}
