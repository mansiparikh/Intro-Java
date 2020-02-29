public class F2C_V4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter fahrenheit value: ");
		double fahrenheit = IO.readDouble();
		
		// check if fahrenheit is >= -459.67
		if (fahrenheit < -459.67) {
			System.out.println("fahrenheit value must be >= -459.67");
			
		} else {
		
			// the following statements are executed ONLY IF
			// the if condition above is false

			double celsius = (fahrenheit-32)*5/9;
			//System.out.println("Celsius value="+celsius);

			// FOR ASSIGNMENTS YOU MUST USE IO.output whatever to print output
			IO.outputDoubleAnswer(celsius);
		
		}
	}

}
