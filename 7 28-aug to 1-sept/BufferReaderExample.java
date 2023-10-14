import java.io.*;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
        String name=br.readLine();
        if(name.length()==0){
            System.out.println("name can't be empty");
        }else{
            System.out.println("welcome"+" "+name);
        }
    }
}
