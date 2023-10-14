/*WAP to accept array elements(input of 10 numbers) from user.and apply binary search to search parrticular element from that list */

import java.util.Scanner;

public class BinarySearch1{
    static void sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int ele,start,middle,end;

        System.out.println("Enter unique numbers in Array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("--Array--");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr);
        System.out.println("\n--Sorted Array--");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the number to be searched : ");
        ele =sc.nextInt();

        //Binary Search
        start=0;
        end=arr.length-1;

        while(start<=end){
            middle=(start+end)/2;
            if(ele==arr[middle]){
                System.out.println(ele+" present at index: "+middle);
                break;
            }else if(start==end){
                System.out.println(ele+" is not present in Array");
            }

            if(ele>arr[middle]){
                start = middle+1;
            }else{
                end = middle - 1 ;
            }

            sc.close();
        }


    }
}
