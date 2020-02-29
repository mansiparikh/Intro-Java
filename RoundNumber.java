
public class RoundNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print("Enter number to be rounded: ");	
	double round = IO.readDouble();
	
	System.out.print("Enter number of spaces to round: ");	
	int spaces = IO.readInt();
	
	double result;
	
	result = roundNum(round, spaces);
	System.out.print(result);
	
	}
	
	public static double roundNum(double x, int n) {
		double r;
		if (n == 0) {
			return x;
		} else {
			x = x*10;
			r = x % 10;
			if (r >= 5) {
				x = 
			} else {
				
			}
			n--;
			return roundNum(x, n);
		}
		
	}
	
}
