//WAP to take input as a score of two team from user and based on socre make decision who won the match
 
import java.util.Scanner;

class MatchDecision{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		//variable declaration
		int team1score,team2score;
		System.out.println("Enter the score of team1");
		team1score = sc.nextInt();
		System.out.println("Enter the score of team2");
		team2score = sc.nextInt();
		if(team1score>team2score){
			System.out.println("Team1 won the match");
		}else{
			System.out.println("Team2 won the match");
		}
		sc.close();
	}
}