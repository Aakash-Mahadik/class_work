/*Accept array of integer with size 10 .Take data from user .Ask user to search an element and find whether that element is present in the given arrray or not .If present then mention index number as well */

import java.util.Scanner;

public class Arrayserach {

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

        System.out.println("Enter number int Array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("--Array--");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the element to be searched : ");
        int ele =sc.nextInt();
        
        //linear search
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println(ele+ " found at index "+i);
                break;
            }
            if(i == arr.length-1 && arr[i]!=ele ){
                System.out.println(ele+" is not present");
            }
        }
        //System.out.println(ele+" is not present");
        
        Arrayserach.sort(arr);

        System.out.println("--Sorted Array--");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //binary search
        int start=0;
        int end  =(arr.length)-1 ;
        int middle;
        System.out.println("\nEnter the element to be searched : ");
        int ele1 =sc.nextInt();
        
        while(start<=end){
            middle=(start + end)/2;
            if(arr[middle]==ele1){
                System.out.println(ele1+" found at index "+middle);
    
            }else if(start==end){
                System.out.println(ele1+" is not present");
            }
            if(ele1>arr[middle]){
                start = middle+1;
            }else{
                end = middle-1;
            }

        }

        sc.close();

    }
}
