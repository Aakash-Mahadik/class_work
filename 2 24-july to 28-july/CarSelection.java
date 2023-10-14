import java.util.*;

class CarSelection{

	public static void main(String[]args){

		//scanner class object creation
		Scanner sc = new Scanner(System.in);
		
		//variable decleration
		String name, color, brand;

		System.out.println("--Enter your details--");
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter the brand name");
		brand = sc.nextLine();
		System.out.println("Enter the color which want");
		color = sc.nextLine();

		//aplying condition
		System.out.println("using if else");
		if(color.equals("Black") || color.equals("White") || color.equals("Red") || color.equals("Blue")){
			System.out.println("Hello mr."+name+" Congradulation you buy the brand new "+brand+" car of "+color+" color!!");
		}else{
			System.out.println("Sorry sir, but we don't have "+brand+" car of "+color+" color");
		}

		System.out.println("using swtich");
		switch(color)
		{
			case "Blue":
					System.out.println(name +", Congratulations!!! you purchased your dream car of Blue color "+brand);
					break;
			
			case "Black":
					System.out.println(name +", Congratulations!!! you purchased your dream car of Black color "+brand);
					break;
					
			case "White":
					System.out.println(name +", Congratulations!!! you purchased your dream car of White color "+brand);
					break;
			
			case "Red":
					System.out.println(name +", Congratulations!!! you purchased your dream car of Red color "+brand);
					break;
					
			default:
					System.out.println("SORRY!!! "+color+ "car is NOT available");
					break;
		}
	}
}