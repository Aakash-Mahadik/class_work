public class TryCatchblock {
    public static void main(String[] args) {
        int [] arr= new int[5];
        int a,b,c;
        a=10;
        b=0;
        try {
            arr[5]=50;
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("END");

        //random practice
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         if(i==1||j==1||i==4||j==4){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
