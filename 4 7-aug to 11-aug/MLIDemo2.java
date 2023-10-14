/*Create a class father,Son and Baby .All three classes have a method move .write specific comment inside that like for father-I can walk with the help of stick. 
and for Son I can run fast
and for baby I can Nicely crawl */

class Father{
    public void Move(){
        System.out.println("this is from father class");
        System.out.println("I can walk with the help of stick. ");
    }
}

class Son extends Father{
    public void Move(){
        super.Move();
        System.out.println("this from son class");
        System.out.println("I can run fast");
    }
}

class Baby extends Son{
    public void Move(){
        super.Move();
        System.out.println("this is from baby class");
        System.out.println("I can Nicely crawl");
    }
}
public class MLIDemo2 {
    public static void main(String[] args) {
        Baby obj = new Baby();
        obj.Move();
    }
}
