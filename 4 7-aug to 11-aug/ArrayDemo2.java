import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //array declaration
        int [] arr1 = new int[5];
        int [] arr2 = new int[5];
        int [] arr3 = new int[5];

        System.out.println("enter values in first array");
        for(int i =0;i<5;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter values in secound array");
        for(int i =0;i<5;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i =0;i<5;i++){
            arr3[i] = arr1[i]+arr2[i];
        }
        System.out.println("Addition of numbers: ");
        for(int i=0; i<5;i++){
            System.out.print(arr3[i]+" ");            
        }
        sc.close();

    }
}
