class Pattern1{
    public static void main(String[] args) {
        
        //pattern1
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern2
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern3
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern4
        //printing upper pattern        
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		//printing lower pattern
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

        //pattern5

        for(int i=5; i>=1 ;i--){
            //for spacing 
            int space= i-1;
            for(int j=space; j>=1;j--){
                System.out.print("  ");
            }
            for(int k=5-space;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        //butterfly pattern
        //upper pattern
        int rows=5;
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
        //lower pattern
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
        System.out.println();

        //Holo pattern

        for(int i=1; i<=5 ;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==5||j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}