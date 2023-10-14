import java.util.Scanner;

class CarInfo{
    private String brand_name,model_name;
    private int top_speed;
    
    //setter for brand
    public void setBrand_Name(String brand_name){
        this.brand_name=brand_name;
    }
    //getter for brand
    public String getBrand_Name(){
        return this.brand_name;
    }
    //setter for model
    public void setModel_Name(String model_name){
        this.model_name=model_name;
    }
    //getter for model
    public String getModel_Name(){
        return this.model_name;
    }
    //setter for speed
    public void setTopSpeed(int top_speed){
        this.top_speed=top_speed;
    }
    //getter for brand
    public int getTopSpeed(){
        return this.top_speed;
    }
    public void displayInfo(){
        System.out.println("---Displaying Car Details---"); 
        System.out.println("Brand name is: "+brand_name);
        System.out.println("Model name is: "+model_name);
        System.out.println("Car top speed is: "+top_speed);
        System.out.println();
    }
    

}

public class CarDetails{
    public static void main(String[] args) {
        CarInfo car = new CarInfo();
        Scanner sc = new Scanner(System.in);

        System.out.println("---Enter Car Details---");       
        System.out.println("Enter the Brand Name");
        car.setBrand_Name(sc.nextLine());
        System.out.println("Enter Model name:");
        car.setModel_Name(sc.nextLine());
        System.out.println("Enter Top Speed of your Car in km/h: ");
        car.setTopSpeed(sc.nextInt());
        sc.nextLine();
        System.out.println();
        car.displayInfo();

        //for another input
        System.out.println("---Enter Car Details---");       
        System.out.println("Enter the Brand Name");
        car.setBrand_Name(sc.nextLine());
        System.out.println("Enter Model name:");
        car.setModel_Name(sc.nextLine());
        System.out.println("Enter Top Speed of your Car in km/h: ");
        car.setTopSpeed(sc.nextInt());
        System.out.println();
        car.displayInfo();
        sc.close();
                
    }
}

// WAP to get car details from the  user.Here properties to display are  brand,modelname,topspeed  and write corresponding getters and setters

// class Car
//   {
//     private String name,brand;
//     private int speed;
    
//      public String getBrand()
//         {
//           return this.brand;
//         }
//        public void setBrand(String brand)
//         {
//           this.brand=brand;
//         }


//      public String getName()
//         {
//           return this.name;
//         }
//        public void setName(String name)
//         {
//           this.name=name;
//         }


//      public int getSpeed()
//         {
//           return this.speed;
//         }
//        public void setSpeed(int speed)
//         {
//           this.speed=speed;
//         }
//   }
//  public class CarDetails
//       {
//          public static void main (String args[])
//           {
//             Car c= new Car();
         
//             c.setBrand("Mercedes");
//             System.out.println(c.getBrand());
//             c.setName("E-class");
//             System.out.println(c.getName());
//             c.setSpeed(200);
//             System.out.println(c.getSpeed());
        
//             c.setBrand("Audi");
//             System.out.println(c.getBrand());
//             c.setName("Q5");
//             System.out.println(c.getName());
//             c.setSpeed(300);
//             System.out.println(c.getSpeed());
//       }
// }