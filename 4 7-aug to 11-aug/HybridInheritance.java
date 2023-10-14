/*Create a program in java to implement multilevel inheritance and hierarchical inheritance.
Take classes like: Doctor, Surgeon and Nurse */

class Doctor{
    public void speciality(){
        System.out.println("i am a doctor");
    }
}
class Surgeon extends Doctor{
    public void speciality(){
        super.speciality();
        System.out.println("i am a surgeon");
    }
}
class Cardiologist extends Surgeon{
    public void speciality(){
        super.speciality();
        System.out.println("i am a special surgeon, Cardiologist");
    }
}
class Nurse extends Doctor{
    public void speciality(){
        super.speciality();
        System.out.println("i am a nurse");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Nurse n = new Nurse();
        Cardiologist c = new Cardiologist();
        c.speciality();
        n.speciality();
        
    }
}
