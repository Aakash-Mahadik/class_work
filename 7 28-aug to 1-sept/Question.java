// Write a program that prompts the user to enter a series of integers. The program should calculate the sum of all the even numbers entered, skipping any negative numbers. Use the continue statement to skip negative numbers.

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the series of numbers (sepreted by space)");
        String numbers = sc.nextLine();

        String[] strarr = numbers.split(" ");
        int [] numarr = new int[strarr.length];

        for(int i = 0;i<strarr.length;i++){
            numarr[i] = Integer.parseInt(strarr[i]);
        }
        
        int sum=0;
        for(int i = 0;i<numarr.length;i++){
            if(numarr[i]<0){
                continue;
            }
            if(numarr[i]%2==0){
                sum+=numarr[i];
            }
            // if(numarr[i]>0&&numarr[i]%2==0){
            //     sum+=numarr[i];
            // }
        }
        System.out.println("sum of all the even number from serires of integer you provide is: "+sum);
        sc.close();

    }
}
