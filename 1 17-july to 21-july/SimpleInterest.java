//WAP for Simple Interest
import java.util.Scanner;
class SimpleInterest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float SI,Principle,ROI,Time;
		System.out.println("--To get Simple Interest--");
		System.out.println("Enter the Prinple ammount");
		Principle = sc.nextFloat();
   		System.out.println("Enter the ROI");
		ROI = sc.nextFloat();
		System.out.println("Enter the time period");
		Time = sc.nextFloat();
		SI = (Principle*ROI*Time)/100;
		System.out.println("Simple Interest is: "+SI);
		System.out.println("Ammount need to returned after "+Time+" year will be "+(Principle+SI));
	}
}
		