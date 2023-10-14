public class WrapperClass {
    public static void main(String[] args) {
        //boxing
        int num = 5;
        Integer integerNum1=new Integer(num);//auto boxing
        Integer integerNum11 = 5;
        System.out.println((integerNum1));

        //unboxing
        Integer integernum2 = new Integer(30);
        int num2 = integernum2.intValue();
        System.out.println(integernum2.intValue());
        System.out.println(num2);
    }
}
