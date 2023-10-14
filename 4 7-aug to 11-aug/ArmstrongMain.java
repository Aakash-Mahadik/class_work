
/*WAP to check Whether the number is Armstrong number or not */

//importing scanner class
import java.util.Scanner;

class Armstrong{
    //variable declaration
    int num,i,j,res,rem,remd,power;

    //scanner class object creation
    Scanner sc = new Scanner(System.in);

    //constructor
    Armstrong(){
        this.res=0;
        this.rem=0;
        this.remd=0;
        this.power=0;
    }

    //method for taking user input
    public void userInput(){
        System.out.println("Enter a number:");
        this.num = sc.nextInt();
    }

    //method for calculating power
    public int power(){
        i = this.num;
        while(i!=0){
            power++;
            i=i/10;
        }
        return power;
    }

    //method to check if the given number is an Armstrong Number or not 
    public void isArmstrongNumber(){
        
        i=this.num;

		//this is for calculation
		while(i!=0){
			rem=i%10;
			remd = rem;
			System.out.print(rem);
			for(int j=1; j<power;j++){
				rem = rem * remd;
			}
			System.out.println(" power "+power+" is: "+rem);
			res+=rem;
			i=i/10;
		}
		System.out.println("Addition of all above number is: "+res);

		//for printing armstrong or not 
		if(num==res){
			System.out.println("Number is Armstrong number");
		}else{
			System.out.println("Number is not a Armstrong number");
		}
    }
}

public class ArmstrongMain {
    public static void main(String[] args) {
        
        //object creation of Armstrong class
        Armstrong obj = new Armstrong();

        //method calling
        obj.userInput();
        obj.power();
        obj.isArmstrongNumber();
    }
}
