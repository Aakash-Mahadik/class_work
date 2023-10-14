/*
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*/


public class Pattern7 {

    public static void main(String[] args) {

	int rows=5;
	//upper part
        for(int i=1; i<=rows;i++){
            //for 1st star
            for(int j=1; j<=i;j++){
                System.out.print("* ");               
            }
            //for spacing
            int space = 2*(rows-i);
            for(int k = 1; k<=space;k++){
                System.out.print("  ");
            }
            //last star
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }

	//lower part
        for(int i=rows-1; i>=1;i--){
            //for 1st star
            for(int j=1; j<=i;j++){
                System.out.print("* ");               
            }
            //for spacing
            int space = 2*(rows-i);
            for(int k = 1; k<=space;k++){
                System.out.print("  ");
            }
            //last star
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
		
    }

}
