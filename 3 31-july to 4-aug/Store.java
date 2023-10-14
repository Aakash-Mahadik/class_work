import java.util.Scanner;

/**
 * Store
 */

class Customer {
    private String customer_name, product_name;
    private int product_quantity, total_amount=0;

    // setters
    public void setCustomerName(String name) {
        this.customer_name = name;
    }

    public void setProductName(String name) {
        this.product_name = name;
    }

    public void setProductQuantity(int quantity) {
        this.product_quantity = quantity;
    }

    // getters
    public String getCustomerName() {
        return this.customer_name;
    }

    public String getProductName() {
        return this.product_name;
    }

    public int getProductQuantity() {
        return this.product_quantity;
    }

    public int getTotalAmount() {
        return this.total_amount;
    }

    void ShowMainu(){
        System.out.println("---Welcome to our store!---");
        System.out.println("KitKat at Rs.40 each");
        System.out.println("Mangoes at Rs.25 each");
        System.out.println("Oranges at Rs.36 each");
    }
    void DisplyTotal(){
        switch(product_name){
            case "KitKat":
                total_amount=40*product_quantity;
                break;
            case "Mangoes":
                total_amount=25*product_quantity;
                break;
            case "Oranges":
                total_amount=36*product_quantity;
                break;
            default :
                System.out.println("Wrong Input");
                break;
        }
        System.out.println(customer_name+" for your "+product_quantity+" "+product_name+ " Total ammount is: "+total_amount);
    }

}

public class Store {

    public static void main(String[] args) {
        Customer obj = new Customer();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Name of the Customer");
        obj.setCustomerName(scn.nextLine());

        obj.ShowMainu();

        System.out.println("Enter the product name");
        obj.setProductName(scn.nextLine());

        System.out.println("Enter Quantity");
        obj.setProductQuantity(scn.nextInt());

        obj.DisplyTotal();      
        
        System.out.println("Thank you for shopping with us.");


    }
}