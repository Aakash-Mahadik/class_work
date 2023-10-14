
class StaticMoreInfoDemo{
    //non static variable
    String Myname = "Sagar";
    //static variable
    static int Myage=20;

     //non static method
    public void infoMyName(){
        System.out.println("My Name is " + this.Myname);
    }
    //static method
    //we can not use the non static variable into the static method
    public static void infoMyAge(){
        //we can call variable in same class without class name as well
        System.out.println("I am "+Myage+" years old "+ StaticMoreInfo.age); // here i am calling variable of another class which is down there
    }

}
public class StaticMoreInfo {
    //non static variable
    String name = "Aakash";
    //static variable
    static int age=21;

    //non static method
    public void infoName(){
        System.out.println("My Name is " + this.name);
    }
    //static method
    //we can not use the non static variable into the static methhod
    public static void infoAge(){
        //we can call variable in same class without class name as well
        System.out.println("I am "+age+" years old "+ StaticMoreInfo.age); 
    }

    public static void main(String[] args) {
        //we can call static method of same class without class name as well
        infoAge();
        //static variable value can change but there is no meaning to change it. so basically we make it final
        //here i am changing static variable value
        age=22;
        //i am calling static method with class name here
        StaticMoreInfo.infoAge();
        //but to call non static method we need to create object and then call methods
        StaticMoreInfo obj = new StaticMoreInfo();//creating an instance
        obj.infoName();


        //here we are calling static method from another class so we need give class name first
        StaticMoreInfoDemo.infoMyAge();
        //infoMyage            //this will give error

        //static variable value can change but there is no meaning to change it. so basically we make it final
        //here i am changing value for understanding
        StaticMoreInfoDemo.Myage = 20;
        StaticMoreInfoDemo.infoMyAge();
         //but to call non static method we need to create object and then call methods
        StaticMoreInfoDemo demoObj =new StaticMoreInfoDemo ();//creating a instance
        demoObj.infoMyName();

    }
}
