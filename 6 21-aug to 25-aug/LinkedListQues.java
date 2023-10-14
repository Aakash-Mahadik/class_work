
import java.util.*;

public class LinkedListQues {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers ");
        for(int i=0;i<5;i++){
            ll.add(sc.nextInt());
        }

        Iterator<Integer> itr = ll.iterator();
        float avg=0;
        while (itr.hasNext()) {
            avg += itr.next();
        }

        System.out.println("Average is: "+avg/ll.size());

        sc.close();

    }
}
