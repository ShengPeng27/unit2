import java.util.Arrays;
import java.util.Scanner;
public class Diving {	
	private final static int JUDGES=7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float degree=inputValidDegreeOfDifficulty();
		float[] score= inputAllScores();	
		System.out.print("The final socre of this diver is ");
		System.out.println(calculateScore(degree,score));
		
	
	}
	public static float inputValidScore(){
		System.out.println("Please enter the scores from 7 judges.");
		//prompt user input valid scores
		Scanner keyboard=new Scanner(System.in);
		float n1=keyboard.nextFloat();
		if(n1<0 || n1>10){
			System.out.println("Please enter the valid score.");
			System.out.println("The score should be from 0 to 10.");
			return  0.0f;
			//the score should be from 0 to 10
		}
		else{
			return n1;		
		}
	}
	public static float[] inputAllScores(){		 
		 float[] score = new float[JUDGES];
		 //input the valid scores into array
		 int i=0;
		 for (i=0;i<JUDGES;i++){
			 score[i]=inputValidScore();			 
		 }
		return score;
	}
	
	public static float inputValidDegreeOfDifficulty(){
		//prompt the user input the degree of difficulty
		System.out.println("Please enter the degree of difficulty");
		Scanner keyboard=new Scanner(System.in);
		float degree=keyboard.nextFloat();
		return degree;		
	}
	public static float calculateScore(float degree, float[] score){
		Arrays.sort(score);	
		//sort the array, we need to throw out the maximum and minimum score
		//so we just throw out the first score and last score
		float finalScore = 0.6f*degree*(score[1]+score[2]+score[3]+score[4]+score[5]);
		return finalScore;
	}
	
}
