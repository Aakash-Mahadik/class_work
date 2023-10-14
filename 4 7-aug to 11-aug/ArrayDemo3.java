import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter numbers: ");
        for (int i=0;i<5;i++){
            arr[i]=scn.nextInt();
        }
        //for loop to print the array elements
        System.out.println("you have entered this numbers:");
        for(int i=0; i<5;i++){
            System.out.print(arr[i]+" ");            
        }
        
        System.out.println();
        
        //THIS IS BRUTE FORCE METHOD
        // int temp;
        // for(int i=0;i<5;i++){
            //     for(int j=1;j<5-i;j++){
                //         if(arr[j-1]>arr[j]){
        //             temp = arr[j-1];
        //             arr[j-1] = arr[j];
        //             arr[j] =temp ;
        //         }
        //     }
        // }
        // System.out.println("Sorted Array is: ");
        // for(int i=0; i<5;i++){
            //     System.out.print(arr[i]+" ");            
            // }
            //System.out.println();
            // System.out.println("smallest number is: "+ arr[0]);
            
            int min = arr[0];
            int max = arr[0];
            for(int i=1; i<5;i++){
                if(arr[i]<min){
                    min =  arr [i];
                }
                if(arr[i]>max){
                    max =   arr[i];
                }            
            }
            System.out.println("smallest number is: "+ min);
            System.out.println("largest number is :"+ max );
            scn.close();
    }
}
