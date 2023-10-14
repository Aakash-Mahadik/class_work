import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("\nEnter String 2:");
        String str2 = sc.nextLine();
        
        System.out.println("\nfrom equals");
        if(str1.equals(str2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        
        System.out.println("\nfrom  equalsIgnoreCase");
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        
        System.out.println("\nfrom  compare to");
        int i = str1.compareTo(str2);
        if(i==0){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        //System.out.println(i);
        
        System.out.println("\nEnter String 3:");
        String str3 = sc.nextLine();
        
        System.out.println("\nlength of String is: "+str3.length());
        System.out.println("\nTo LowerCase : "+str3.toLowerCase());
        System.out.println("\nTo UpperCase : "+str3.toUpperCase());
        
        System.out.println("\nsubstring begin from index 2: " + str3.substring(2));
        System.out.println("\nsubstring begin from index 2 till end index 3 it will exclude the end : " + str3.substring(2,3));
        
        System.out.println("\nif string have char'a' it will replace with char 'x': "+str3.replace("a","x"));
        
        System.out.println("\nEnter String 4 with spcaes :");
        String str4 = sc.nextLine();

        //System.out.println("\nit will return string without white spaces: "+str4.trim());

        
        sc.close();
    }
}
