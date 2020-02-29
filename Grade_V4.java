
public class Grade_V4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter integer score 0..100: ");
		int score = IO.readInt();
		
		if (score < 0 || score > 100) { // '||' is for OR
			System.out.println("Score must be between 0 and 100");
			return;
		}
		
		// do the grade computation, WITHOUT using elses 
		if (score < 50) { 
			IO.outputStringAnswer("F");
			return;
		}
		if (score < 60) {
			IO.outputStringAnswer("C");
			return;
		}
		if (score < 70) {
			IO.outputStringAnswer("C+");
			return;
		} 
		if (score < 80) {
			IO.outputStringAnswer("B");
			return;
		} 
		if (score < 90) {
			IO.outputStringAnswer("B+");
			return;
		}
		IO.outputStringAnswer("A");
		
	}

}
