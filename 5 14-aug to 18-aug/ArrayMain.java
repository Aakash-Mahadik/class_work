/*Create package MyArray to accept 10 values from user
import created package to find particular element from the array using binary search algorithm */

//This program is for main method from we are calling BSearch method of BinarySearch class which in MyArray package

//importing BinarySearch class from MyArray package and scanner class 
import java.util.Scanner;
import MyArray.BinarySearch;

public class ArrayMain {
    public static void main(String[] args) {

        //creating object of Scanner class for taking input 
        Scanner sc = new Scanner(System.in);

        //variable declaration
        int ele;
        //array creation
        int [] arr = new int[10];

        //taking user input
        System.out.println("Enter 10 unique numbers in Array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //printing array
        System.out.println("--Array--");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //creating object of BinarySearch class
        BinarySearch bs =new  BinarySearch ();
        
        //calling method from BinarySearch class
        bs.sort(arr);
        
        //printing sorted array
        System.out.println("\n--Sorted Array--");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //taking input for the number which want to be search
        System.out.println("\nEnter the number to be searched : ");
        ele =sc.nextInt();

        //Calling method from BinarySearch class
        bs.BSearch(arr, ele);

        sc.close();
    }
}
