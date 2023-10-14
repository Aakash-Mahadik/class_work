//WAP to search given student name is available in the list of student name using String array.

//importing scanner class
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {

        //scanner class object creation
        Scanner sc = new Scanner(System.in);

        //variable declaration
        String sname;

        //array declaration
        String [] studList = new String[10];
        //adding names int array
        studList[0]="Aakash";
        studList[1]="Ashish";
        studList[2]="Vaibhav";
        studList[3]="Sagar";
        studList[4]="Chetan";
        studList[5]="Devang";
        studList[6]="Smit";
        studList[7]="Chinmay";
        studList[8]="Sandesh";
        studList[9]="Prem";

        //taking user input
        System.out.println("Enter a name that you want to search in an list");
        sname = sc.nextLine();

        //logic to search given student name is available in the array or not
        for(int i=0;i<studList.length;i++){
            if(studList[i].equalsIgnoreCase(sname)){
                System.out.println(sname+" is present in list at index "+i);
                break;
            }else if(i==studList.length-1 && !studList[studList.length-1].equalsIgnoreCase(sname)){
                System.out.println(sname+" is not present in list ");
            }
        }

        sc.close();
    }
}
