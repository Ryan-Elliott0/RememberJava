import java.util.ArrayList;

public class GradeBook {

	private ArrayList<Integer> testScores;
	private String testName;
	
	public GradeBook() {
	}
	
	public GradeBook(ArrayList<Integer> ts, String tn) {
		setTestScores(ts);
		setTestName(tn);				
	}

	public ArrayList<Integer> getTestScores() {
		return testScores;
	}

	public void setTestScores(ArrayList<Integer> testScores) {
		this.testScores = testScores;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public String setLetterGrades() {
		ArrayList<String> letterGrade = new ArrayList<String>();
		int testVal = 0;
		
		for (int i = 0; i < testScores.size(); i++)
		{
			testVal = testScores.get(i);
			if (testVal >= 90)
			{
				letterGrade.add("A");
			}
			else if (testVal >= 80)
			{
				letterGrade.add("B");
			}
			else if (testVal >= 70)
			{
				letterGrade.add("C");
			}
			else if (testVal >= 60)
			{
				letterGrade.add("D");
			}
			else if (testVal < 60)
			{
				letterGrade.add("F");
			}		
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Score ------- Grade" + "\n");
		for (int i = 0; i < testScores.size(); i++) {
			sb.append(testScores.get(i) + " ---------- " + letterGrade.get(i) + "\n");
		}
		
		String sbf = sb.toString();
		
		return sbf;
	}	
}
