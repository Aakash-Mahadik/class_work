/*Create package MyArray to accept 10 values from user
import created package to find particular element from the array using binary search algorithm */

//This program is for sorting the array and for performing binarysearch by taking arr and element to be search

//package creation
package MyArray;

public class BinarySearch {

    //method for sorting array
    public void sort(int arr[]){
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

    //Method for finding a number in an sorted array
    public void BSearch(int arr [],int ele){
        
        //in case the array is not sorted
        sort(arr);

        //variable declaration
        int start,middle,end;
        end=arr.length-1;
        start=0;
        
        //Binary Search Algorithm
        while(start<=end){
            middle=(start+end)/2;
            if(ele==arr[middle]){
                System.out.println("\n"+ele+" present at index: "+middle);
                break;
            }else if(start==end && ele!=arr[middle]){
                System.out.println("\n"+ele+" is not present in Array");
            }

            if(ele>arr[middle]){
                start = middle+1;
            }else{
                end = middle - 1 ;
            }
        }

    }
}