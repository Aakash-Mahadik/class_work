package infopack;
import java.util.Scanner;

public class AccessDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Access Details");
        System.out.println("What is your name: ");
        String userName=sc.nextLine();
        System.out.println("What is your age: ");
        int userAge=sc.nextInt();
        System.out.println(userName+" "+userAge);
        sc.close();
    }
}
