public class F2C_whiletrue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		double fahrenheit;
		while (true) {
			
			System.out.print("Enter fahrenheit value: ");
			fahrenheit = IO.readDouble();
			if (fahrenheit >= -459.67) {
				break;
			}
			System.out.println("fahrenheit value must be >= -459.67");
			
		}
		
		// the following statements are executed ONLY IF
		// the if condition above is false
		
		double celsius = (fahrenheit-32)*5/9;
		//System.out.println("Celsius value="+celsius);
		
		// FOR ASSIGNMENTS YOU MUST USE IO.output whatever to print output
		IO.outputDoubleAnswer(celsius);
		
		
	}

}
