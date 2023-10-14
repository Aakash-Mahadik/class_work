class Stack1{
    private int [] arr;
    private int top;
    private int capacity;

    Stack1(int size){
        this.capacity =size ;
        this.arr = new int [size];
        this.top=-1;
    }

    public boolean isEmpty(){
        return this.top==-1;
    }

    public boolean isFull(){
        return this.capacity==top+1;
    }

    public void add(int element){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            arr[++top] = element;
        }
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        return arr[top--] ;

    }
    public void print(){
        if(top==-1){
            System.out.print("Empty stack");
        }else{
            for (int i=0;i<=this.top;++i) {
               System.out.println("At index "+i+" element is : "+this.arr[i]);
            }
        }
    }

}

public class StackD {
    public static void main(String[] args) {
        Stack1 s = new Stack1(5);
        //checking for empty
        System.out.println(s.isEmpty());
        s.add(5);
        System.out.println(s.isEmpty());
        //checking for full
        System.out.println(s.isFull());
        // s.add(10);
        // s.add(20);
        // s.add(30);
        // s.add(40);
        System.out.println(s.remove());
        System.out.println(s.remove());
        s.print();
    }
}
