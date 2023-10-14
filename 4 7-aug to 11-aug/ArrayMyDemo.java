import java.util.Arrays;

public class ArrayMyDemo {
    public static void main(String[] args) {
        //Array declaration type

        //1 declare and give size
        int[] arr = new int[5];
        //after give values
        arr[0]=45;
        arr[1]=40;

        //2 declare and after give size
        int[] arr1;
        arr1 = new int[5];
        //after give values
        arr1[0]=45;
        arr1[1]=40;

        //3 declare and give vlaues 
        int[]arr2 = {4,3,8,78,45};

        //*extra*/ toString returns the string representation. Returns a string representation of the contents of the //specified array.
        System.out.println("The array is: "+Arrays.toString(arr2));

        
    }
}
