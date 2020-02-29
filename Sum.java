public class Sum {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("Enter first number: ");
		int firstNum = IO.readInt();
		System.out.print("Enter second number: ");
		int secondNum = IO.readInt();
		int sum = firstNum + secondNum; 
				
		System.out.print("Sum: ");
		System.out.println(sum);
	}
}