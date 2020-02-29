public class F2C_IO {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter fahrenheit value: ");
		double fahrenheit = IO.readDouble();
		
		double celsius = (fahrenheit-32)*5/9;
		//System.out.println("Celsius value="+celsius);
		
		// FOR ASSIGNMENTS YOU MUST USE IO.output whatever to print output
		IO.outputDoubleAnswer(celsius);
			
	}
}
