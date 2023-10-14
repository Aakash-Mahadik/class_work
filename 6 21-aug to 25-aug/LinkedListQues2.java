import java.util.LinkedList;

public class LinkedListQues2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        //direct
        ll.add("JAVA");
        ll.add("C");
        //index
        ll.addFirst("PYTHON");
        ll.addLast("C++");
        ll.add(1, "JAVASCRIPT");
        System.out.println(ll);
        
        //modification
        ll.set(3, "C#");
        System.out.println(ll);
        System.out.println("Element at index 2 is: "+ll.get(2));

        //remove
        System.out.println("remove element from index 3 is: "+ll.remove(3));
        System.out.println(ll);
        
        


    }
}
