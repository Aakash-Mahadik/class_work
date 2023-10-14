import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push
        stack.push("My");
        stack.push("Name");
        stack.push("Is");
        stack.push("Aakash");

        System.out.println(stack);
        // [Aakash, Is, Name, My]

        // pop
        System.out.println("removed element is: "+stack.pop());
        // removed element is Aakash
        System.out.println(stack);

        //is empty
        System.out.println(stack.isEmpty());

        //peek it will show last element
        System.out.println(stack.peek());

        //add element at specific index
        stack.add(3, "Aakash");
        System.out.println(stack);
    }
}
