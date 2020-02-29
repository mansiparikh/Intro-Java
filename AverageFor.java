
public class AverageFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of values: ");
		int numValues = IO.readInt();
		
		int sum=0;
		for (int i=0; i < numValues; i++) {
			System.out.print("Enter value: ");
			int value = IO.readInt();
			sum += value; 
		}
		
		if (numValues > 0) {
			double average = sum*1.0 / numValues;
			IO.outputDoubleAnswer(average);
		} else {
			System.out.println("No inputs entered, average not computed");
		}
	}

}
