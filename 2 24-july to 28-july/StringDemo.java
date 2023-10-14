import java.util.*;

class StringDemo{
		 
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		String str1="Hello",str2,str3;
		System.out.println("Enter your name: ");
		str2 = sc.nextLine();
		
		System.out.println(str1+" "+str2);

		if(str1.equals(str2)){
		 	System.out.println("Equlas");
		}else{
			System.out.println("Not Equlas");
		}

		str3 = "Aakash";
		if(str3.equals(str2)){
		 	System.out.println("Equlas");
		}else{
			System.out.println("Not Equlas");
		}
					

	}
}