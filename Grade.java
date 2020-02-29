public class Grade {

	/**
	 *  @param args
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.print("Enter integer score 0..100: ");
		int score = IO.readInt();
		
		if (score < 0 || score > 100) {// '||' is for OR
			System.out.println("Score must be between 0 and 100");
		} else { //do the grade computation in the else part
			if (score >= 90 && score <= 100) { //'&&' for AND
				IO.outputStringAnswer("A");
			} else if (score >= 80 & score < 90) {
				IO.outputStringAnswer("B+");
			} else if (score >= 70 & score < 80) {
				IO.outputStringAnswer("B");
			} else if (score >= 60 & score < 70) {
				IO.outputStringAnswer("C+");
			} else if (score >= 50 & score < 60) {
				IO.outputStringAnswer("C");
			} else {
				IO.outputStringAnswer("F");
				//probably want three test cases per grade range (boundaries and middle) and then beyond range
				//maybe one for non-integer value
			}
		}
	}
}