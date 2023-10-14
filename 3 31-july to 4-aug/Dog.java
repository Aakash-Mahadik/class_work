public class Dog {

    String breed,color,name;
    int age;
    void displayInfo(){
        System.out.println(name+" is "+color+" color "+breed+" doggy");
        System.out.println(name+" is "+age+" yours old");
    }
    void barking(){
        System.out.println("Woof!");
    }
    void hungry(){
        if (age < 1){
            System.out.println("puppy is always hungry");
        }else{
            System.out.println("he is less hungry then befor");
        }
    }
    void sleeping(){
        if (age > 1){
            System.out.println("puppy is always active");
        }else{
            System.out.println("he is always sleepy");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.age =1;
        d.breed ="german shrefard";
        d.color="brown";
        d.name="rocky";
        d.displayInfo();
        d.barking();
        d.hungry();
        d.sleeping();

    }
}
