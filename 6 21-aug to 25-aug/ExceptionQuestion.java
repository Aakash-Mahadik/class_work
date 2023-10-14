/*Write  a Java program that reads a string input from the user. Convert the string to an integer using the Integer.parseInt() method. Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. Display a message indicating that the input is not a valid integer. */

import java.util.Scanner;

public class ExceptionQuestion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter String number");
            String input = sc.nextLine();
            
            int num = Integer.parseInt(input);
            System.out.println("your input  is: "+num);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("input is not a valid integer.");
        }
        System.out.println("Program End");
        sc.close();
    }
}
