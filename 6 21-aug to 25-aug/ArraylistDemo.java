import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("c");
        list.add("c++");
        list.add("python");
        System.out.println(list);
        list.set(2,"c#"); //this will add modify that element
        System.out.println(list);
        list.remove("python");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java1");
        list1.add("c1");
        list1.add("c++1");
        list1.add("python1");
        list1.add(1, "JavaScript1");  //this will add element at particular index

        list1.addAll( 2,list);
        System.out.println(list1);
    }
}
