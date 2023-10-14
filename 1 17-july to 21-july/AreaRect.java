//WAP to calculate the area of rectangle
import java.util.Scanner;
class AreaRect{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int length,breadth,res;
		System.out.println("---To get Area of Rectangle---");
		System.out.println("Enter the Length");
		length = sc.nextInt();
		System.out.println("Enter the breadth");
		breadth = sc.nextInt();
		res = length * breadth;
   		System.out.print("Area of Rectangle is: "+res);
	}
}
			

		