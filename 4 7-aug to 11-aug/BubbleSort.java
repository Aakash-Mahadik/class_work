import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //int arr1 [] = {45,85,74,2,1};
        Scanner scn =new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter numbers: ");
        for (int i=0;i<5;i++){
            arr[i]=scn.nextInt();
        }
        int temp;
        System.out.println("before sorting");
        for(int i=0; i<5;i++){
            System.out.print(arr[i]+" ");            
        }
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for(int i=0; i<5;i++){
             System.out.print(arr[i]+" ");            
        }
        scn.close();
    }
}
