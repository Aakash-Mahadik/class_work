//tryQye
public class tryQye{
public static void main (String args[]) {

try{

Object obj= new String ("Hello");

System.out.print(obj + " ");

Integer in= (Integer) obj;

System.out.println(in);

}catch(ClassCastException ce){

ce.printStackTrace();

}

catch(Exception e) {

System.out.print("Hi");

}

}

}