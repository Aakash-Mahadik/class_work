/*Wap a program to print prime numbers from 1 to 100 */

public class PrimeNumberRange {
    public static void main(String[] args) {

        //simple print statement
        System.out.println("Prime numbers from 1 to 100:");

        //this for loop is going from 2 to 100 because 1 not a prime number
        for(int i=2;i<=100;i++){

            //we initialize count zero here because we want count zero for every number at starting
            int count=0;

            //for loop condition which go from number 2 to current number divide by 2 of outer for loop
            for(int j=2;j<=i/2;j++){

                //this if is to check divisibility of current number
                if(i%j==0){
                    count++;
                    //this break works when any number divide the current number
                    break;
                }
            }
            //if the count is equal with zero then it's a prime number and will be printed in
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
}
