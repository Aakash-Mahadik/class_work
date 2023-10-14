import java.util.StringTokenizer;

public class StringTokenDemo {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My Name is Aakash", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer("My,name,is,Aakash", ",");
        System.out.println("\nnext token is : " + st2.nextToken());

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        /* StringTokenizer object */
        StringTokenizer st3 = new StringTokenizer("Hello Everyone Have a nice day", " ");
        /* Prints the number of tokens present in the String */
        System.out.println("\nTotal number of Tokens: " + st3.countTokens());
    }
}
