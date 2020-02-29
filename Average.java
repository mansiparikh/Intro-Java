
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter termination value: ");
		int terminator = IO.readInt();
		
		System.out.print("Enter value: ");
		int value = IO.readInt();
		
		int sum = 0;
		int count = 0;
		
		while (value != terminator) {
			// sum = sum + value;
			sum += value;   // same as sum = sum + value
			// count = count+1;
			count++;   // same as count = count + 1
			
			System.out.print("Enter value: ");
			value = IO.readInt();
		}

		if (count != 0) {
			double average = sum*1.0 / count;
			IO.outputDoubleAnswer(average);
		} else {
			System.out.println("No inputs entered, average not computed");
		}
	}

}
