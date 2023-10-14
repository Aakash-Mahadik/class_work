//Write a java program to capitalize each word in string.

//importing scanner class
import java.util.Scanner;

public class CapString {
    static void toCapitalize(String input) {
        //string array which will store user input string as string array
        String[] strArr;

        //variable to store each capitalized word of string
        String res;

        //this will store the user string input in array and delimeter as space 
        strArr = input.split(" ");

        //new array which will store each capitalized word 

        String[] capStrArr = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            //in this fist we take string use substring start index is 0 and end 1 and uppercase the first character
            //then we take string again and use substring start index is 1
            //then simply concatinating it and storing in res and in capStrArr array
            res = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1).toLowerCase();
            capStrArr[i] = res;
        }

        System.out.println("\nyour capitalized string is: ");
        //printing array 
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(capStrArr[i] + " ");
        }

    }

    public static void main(String[] args) {
        //scanner class object creation
        Scanner sc = new Scanner(System.in);

        //variable declaration
        String userInput;

        //taking user input
        System.out.println("Enter a String to capitalize it");
        userInput = sc.nextLine();

        //using toCapitalize method to capitalize each word in string.
        toCapitalize(userInput);
        sc.close();
    }
}
