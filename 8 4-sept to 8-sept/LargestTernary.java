// Program to find the largest number among three numbers using ternary operator:

import java.util.Scanner;

public class LargestTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //two numbers
        // System.out.print("num 1: ");
        // int num1 = sc.nextInt();
        // System.out.print("num 2: ");
        // int num2 = sc.nextInt();

        // int max = (num1>num2?num1:num2);
        // System.out.println("largest is: "+max);
        
        //three numbers
        System.out.print("num 1: ");
        int num1 = sc.nextInt();
        System.out.print("num 2: ");
        int num2 = sc.nextInt();
        System.out.print("num 3: ");
        int num3 = sc.nextInt();


        int max = (num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));
        System.out.println("largest is: "+max);

        sc.close();

    }
}
