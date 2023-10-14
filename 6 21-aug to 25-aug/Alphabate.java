import java.util.Scanner;

public class Alphabate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 , char2;
        System.out.println("Enter Character");
        char1 = scanner.next().charAt(0);
        if(Character.isUpperCase(char1)){
            char2 = Character.toLowerCase(char1);
            System.out.println("the lowercase of "+char1+" is : "+char2);
            System.out.println("the Ascii value of "+char1+"is : "+(int)char1);
        }else{
            char2 = Character.toUpperCase(char1);
            System.out.println("the Uppercase of "+char1+" is : "+char2);
            System.out.println("the Ascii value of "+char1+"is : "+(int)char1);
        }
        scanner.close();
    }
}
