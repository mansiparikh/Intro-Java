public class F2C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* VERSION 1
		double fahrenheit;   // declare fahrenheit of type double
		double celsius; 
		
		fahrenheit=65;    // assign 65 to fahrenheit
		celsius = (fahrenheit-32)*5/9;
		System.out.println("Celsius value="+celsius);
		*/
		
		/* VERSION 2
		double fahrenheit = 65;   // declare + initialize
		double celsius = (fahrenheit-32)*(5/9;
		System.out.println("Celsius value="+celsius);
		*/
		
		/* VERSION 3
		float fahrenheit = 65;   // declare + initialize
		//float celsius = (fahrenheit-32)*5/9;
		// float celsius = (fahrenheit-32)*(5/9);  -> THIS WILL GIVE 0!
		float celsius = (fahrenheit-32)*(5f/9);
		System.out.println("Celsius value="+celsius);
		*/
		
		/* VERSION 4
		float fahrenheit = 65;
		// in the following statement, a floating point value
		// on right hand side is assigned to a double var on LHS
		// this is fine because doubles can carry larger values than float
		double celsius = (fahrenheit-32)*(5f/9);
		System.out.println("Celsius value="+celsius);
		*/
		
		double fahrenheit = 65;
		// here we are CASTING a double value on RHS to float var on LHS
		// with a (float) syntax
		float celsius = (float)(fahrenheit-32)*(5f/9);
		System.out.println("Celsius value="+celsius);
		
	}

}
