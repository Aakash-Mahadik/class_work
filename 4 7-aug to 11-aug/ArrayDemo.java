import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //array decaration
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter numbers: ");
        for(int i=0; i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("you have entered this numbers:");
        for(int i=0; i<5;i++){
            System.out.print(arr[i]+" ");            
        }
        sc.close();
    }
}
