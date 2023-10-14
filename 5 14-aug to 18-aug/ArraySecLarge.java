/*WAP to find Second largest number in an array */

import java.util.Scanner;

class ArraySecLarge{
    public static void main(String[] args) {
        int [] arr = new int[5];
        // arr[0]=50;
        // arr[1]=15;
        // arr[2]=19;
        // arr[3]=21;
        // arr[4]=20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        //optimal solution
        // int large = Integer.MIN_VALUE;
        // int Seclarge = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(large<arr[i]){
        //         Seclarge = large;
        //         large = arr[i];
        //     }//this else is for if large number greater than current but seclarge might be smaller than that current
        //     else if(large>arr[i] && Seclarge<arr[i]){
        //         Seclarge = arr[i];                
        //     }
        // }
        // System.out.println("The largest number is: "+large);
        // System.out.println("The second largest number is: "+Seclarge);
        
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("The largest number is: "+arr[arr.length-1]);
        System.out.println("The second largest number is: "+arr[arr.length-2]);
        

        sc.close();
    }
}