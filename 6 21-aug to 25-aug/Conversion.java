public class Conversion {
    public static void main(String[] args) {
        //converting int to string
        int num1 = 5;
        String number = String.valueOf(num1);
        System.out.println(number.getClass().getName());
        System.out.println(num1+number);//concatination
        System.out.println(number+number);//concatination

        //converting string to integer
        String number2 = "150";
        int num2 = Integer.parseInt(number2);
        System.out.println(number2+num2);//concatination
        System.out.println(num2+num2);//addition
    }
}
