// WAP to accept customer details as name ,flatno,parking (yes/no),if yes then allocate parking with flat number and display all customers details

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingProblem {
    String name,choice;
    int flatno,flatno1;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> parkedlist = new ArrayList<>(10);
    ParkingProblem(){
        parkedlist.add(401);
        parkedlist.add(502);
    }
    void takeInput(){
        System.out.println("Enter customer name ");
        name = sc.nextLine();
        System.out.println("Enter the flatno: ");
        flatno = sc.nextInt();
        System.out.println("Do you want parking? Yes/No");
        sc.nextLine();
        choice = sc.nextLine();
    }
    void parkingDecision(){
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("----Its a paid parking do you want countinue? Yes/No----");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Yes")){
                System.out.println("parking lot is for 300k");
                System.out.println(name +" have taken the parking for flat no "+flatno);
                parking();
            }else{
                System.out.println("Thanks for your Information");
            }
        }else{
            System.out.println("Thanks for your Information");
        }
    }
    void parking(){
        System.out.println("--while parking--");
        System.out.println("Enter the flatno: ");
        flatno1 = sc.nextInt();
        if(parkedlist.contains(flatno1)){
            System.out.println("you can have only one parking\nsomeone have parked at your place");
        }else{
            System.out.println("you can parked at position with parking no "+flatno);
            parkedlist.add(flatno1);
        }
        System.out.println("Enter the flatno: ");
        flatno1 = sc.nextInt();
        if(parkedlist.contains(flatno1)){
            System.out.println("you can have only one parking\nsomeone have parked at your place");
        }else{
            System.out.println("you can parked at position with parking no "+flatno);
            parkedlist.add(flatno1);
        }
    }
    public static void main(String[] args) {
        ParkingProblem pp = new ParkingProblem();
        pp.takeInput();
        pp.parkingDecision();
    }
}
