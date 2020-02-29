public class TwoSmallest {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		System.out.print("Enter a termination value: ");
		double terminator = IO.readDouble();
		
		System.out.print("Enter value: ");
		double value = IO.readDouble(); 
		
		if (value == terminator) {
			IO.reportBadInput(); 
			System.exit(0); }
		
		double smaller = value;
		
		System.out.print("Enter value: ");
		value = IO.readDouble(); 
		
		if (value == terminator) {
			IO.reportBadInput(); 
			System.exit(0); }
		
		double small = value;
		
		if (small < smaller) {
			double temp = smaller;
			smaller = small;
			small = temp;
		}
		
		while (value != terminator) {
				System.out.print("Enter value: ");
				value = IO.readDouble(); 
					if (value == terminator) {
						IO.outputDoubleAnswer(smaller);
						IO.outputDoubleAnswer(small);
					} else if (value < smaller && smaller <= small) {
						small = smaller;
						smaller = value;
					} else if (value < small ) {
						small = value; }
					}
	
	}
}

