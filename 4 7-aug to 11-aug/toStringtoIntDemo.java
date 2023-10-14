public class toStringtoIntDemo {
    public static void main(String[] args) {
        int a = 10;
        String number = "45";
        String floatnumber = "50.25";

        //we can convert int or any number like float, long to string in differnt way
        //first way
        //String intConvertedtoString = Integer.toString(a);
        //secound way same output will be given
        String intConvertedtoString = String.valueOf(a);

        System.out.println(100+a);//addtion is happing
        System.out.println(100+intConvertedtoString);//concatination is happing

        //we can convert string to int or any number like float, long 
        //make use of Integer.parseInt(string value), Float.parsefloat(string value)
        int stringConvertedtoint = Integer.parseInt(number);
        float stringConvertedtofloat = Float.parseFloat(floatnumber);

        System.out.println(100+stringConvertedtoint);//addtion is happing
        System.out.println(100+number);//concatination is happing
        System.out.println(100+stringConvertedtofloat);//addtion is happing
        System.out.println(100+floatnumber);//concatination is happing

    }
}
