public class FinalyDemo{
    public static void main(String[] args) {
        
        try{
            int a = 10;
            int b =0;
            int ans =a/b;
            System.out.println(ans);
         //if we handle exception correctly then remaining program will run with finally block
         //if do not handle exception correctly then remaining program will not run but finally block will run first
        }catch(ArithmeticException e){
            System.out.println("error");
        }finally{
            System.out.println("This is finally block");
        }

        System.out.println("END");
    }
}