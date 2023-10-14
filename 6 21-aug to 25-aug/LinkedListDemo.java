import java.util.*;
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("My");
        llist.add("Name");
        llist.add("Is");
        llist.add("Aakash");

        Iterator<String> itr = llist.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());            
        }
        
        System.out.println(llist.isEmpty());
        System.out.println(llist.peek());
        System.out.println(llist.peekLast());
        System.out.println(llist.getFirst());
        System.out.println(llist.contains("Aakash"));
        System.out.println(llist.contains("aakash"));
    }
}
