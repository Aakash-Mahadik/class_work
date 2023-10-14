/*
 Encapculation is basically combining the data member and data methods 
 Create a class Person with two private data members name and age .Perform Encapsulation on these fields
 */

class EncapculationClass {
    private String name;
    private int age;

    // setter for name
    public void setName(String name) {
        this.name = name;
    }
    // getter for name
    public String getName() {
        return this.name;
    }

    //setter for age
    public void setAge(int age) {
        this.age = age;
    }
    //getter for age
    public int getAge() {
        return age;
    }

    

    // public void setAge(int x){ //this can be done but naming convention matter
    // age=x;
    // }

}

public class EncapculationDemo {
    public static void main(String[] args) {
        EncapculationClass ec = new EncapculationClass();
        ec.setName("Aakash");
        System.out.println(ec.getName());
        ec.setAge(21);
        System.out.println(ec.getAge());
        // int [] arr={5,15,1,2,20};
        // int temp;
        // for(int i = 0;i<arr.length;i++){
        //     for(int j=1;j<arr.length;j++){
        //         if (arr[j]<arr[j-1]){
        //             temp=arr[j-1];
        //             arr[j-1]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // } //sorting

    }
}
