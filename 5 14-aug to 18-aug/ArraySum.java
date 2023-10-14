import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int [] arr = new int[7];
        int sum=0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Addition of Array value is: "+sum);
        avg = sum/7.0f;
        System.out.println("Avarage is: "+avg);
        sc.close();

    }
}
