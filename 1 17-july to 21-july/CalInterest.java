//Amar" is HDFC bank customer his Balance is 25000. After  some time He trasfered 11000 amount to his friend "Surya".Print the current balance and find interest value on that amount with interest value 2%  and 12months?

class CalInterest{
	public static void main(String[]args){
	
	//variable declaration
	int Bal,TransferAmm,ROI,Time,CurrBal,InterestVal;
	
	Bal=25000;
	TransferAmm=11000;
	ROI=2;
	Time=12;   //time period is in mounts convert it in year

	//Initial Balace
	System.out.println("Initial Balace was: "+Bal);
	System.out.println("Transfered Ammount: "+TransferAmm);

	//current balance
	CurrBal=Bal-TransferAmm;
	InterestVal=(TransferAmm*(ROI)*(Time/12))/100;
	System.out.println("CurrBal is: "+CurrBal);
	System.out.println("InterestVal for ammount of "+TransferAmm+"  at ROI of "+ROI+"%  is: "+InterestVal);
	}
}
	
	