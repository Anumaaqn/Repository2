package grades;

import java.util.HashMap;

/** 
 * A GradeManager will create a command-line prompt that will let someone add grades
 * and display grades in histogram format.
 * 
 */

public class GradeManager {
	
	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade,Integer> allGrades;

	/**
	 * Creates a new GradeManager.
	 */
	public GradeManager() {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade,Integer>();
		
		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, 0);
		}
	}
		
	/**
	 * Adds grade to this GradeManager.
	 * @param grade - grade to add to this grad manager
	 */
	public void addGrade(String grade) throws InvalidGradeException {
		if (grade.equals("a")) {
			// TODO: YOUR CODE HERE
		} else if (grade.equals("b")) {
			// TODO: YOUR CODE HERE
		} else if (grade.equals("c")) {
			// TODO: YOUR CODE HERE
		} 		
		// TODO: Add more cases in here
		
		// If grade doesn't match a valid grade, throw an InvalidGradeException
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		// TODO: YOUR CODE HERE
		throw new RuntimeException("GradeManger.printHistogram() not yet implemented!");
	}
	
	/**
	 * Returns a string representation of the histogram of the grades.
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append( gl+":");
			for (int i = 0; i < this.allGrades.get(gl); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Simple loop that accepts 3 commands from System.in:
	 *    add <some grade> : for example, "add a" or "add b"
	 *                       adds the given grade to the GradeManager
	 *    print            : prints out all the grades in this GradeManager
	 *                       in a histogram format
	 *    exit             : exits the program
	 * @param args
	 */
	public static void main(String[]  args) {
		GradeManager gm = new GradeManager();
			
			BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Starting the grade manager");
			
			while (true) {
					String input = cin.readLine();
				if (input.startsWith("add")) {
						// TODO: YOUR CODE HERE
				} else if (input.equals("print")) {
	//					// TODO: YOUR CODE HERE
					gm.getHistString(); gm.
				}  else if (input.equals("exit")) {
						break;
				}
				
		}
	 }

}