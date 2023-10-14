import java.util.Scanner;

class PersonInfo{
    String name;
    int age;
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your age");
        age =sc.nextInt();
    }
    public void display(){
        System.out.println("Hello "+name+" now you are "+age+" years old!!");
    }

    public static void main(String[] args) {
        PersonInfo obj = new PersonInfo();
        obj.accept();
        obj.display();
    }
}