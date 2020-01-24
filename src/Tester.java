import java.util.Scanner;
import java.util.ArrayList; 

public class Tester {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numScores = 0;
		ArrayList<Integer> testScores = new ArrayList<Integer>();
		
		System.out.println("How many scores would you like to enter? ");
		numScores = in.nextInt();
		
		for (int i = 0; i < numScores; i++)
		{
			System.out.println("Enter a score: ");
			testScores.add(in.nextInt());	
		}	
		
		GradeBook gb1 = new GradeBook(testScores, "Cool Test");
		
		System.out.println(gb1.setLetterGrades());
		
		in.close();
	}
}
