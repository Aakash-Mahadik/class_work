//WAP a program to reverse a given String without using reverse() method.

//importing scanner class
import java.util.Scanner;

public class ReverseString {
    static void revString(String input){

        //variable declaration
        String rev_string = "";
        char ch;

        //logic to reverse string
        for(int i=0;i<input.length();i++){
            ch = input.charAt(i);
            rev_string = ch + rev_string;
        }
        
        System.out.println("Reverse of the entered string is: "+rev_string );
    }
    public static void main(String[] args) {

        //scanner class object creation
        Scanner sc = new Scanner(System.in);

        //variable declaration
        String userInput;

        //taking user input
        System.out.println("Enter a String to reverse it");
        userInput = sc.nextLine();

        //using revString method to reverse string.
        revString(userInput);
        sc.close();
    }
}
