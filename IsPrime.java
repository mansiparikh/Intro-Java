
public class IsPrime { // order of the methods don't matter; here there are three (main, isPrime, getInput)

	/*  input: integer >= 2
		output: whether input is a prime number of not
					(prime if not divisible by anything except 1 and itself)
			divide by 2 (check to see if remainder)
				if remainder, keep going
				if not, stop and say not prime
					if remainder, keep going and divide by more numbers (only half of it) */
	/**
	 * @param args
	 */
	public static void main(String[] args) { // because it is "void" no return in the method
		//TODO Auto-generated method stub
		int n = getInput();
		
		isPrime(n);
		
		System.out.println(n + " is a prime number");
	}

	public static void isPrime(int n) {
		for (int d=2; d <= n/2; d++) { // where d is the divisor; if n is odd, it will truncate decimal (int division)
			if (n % d == 0 ) { // % is remainder, line means d divides into n without remainder
				System.out.println(n + " is not a prime number");
				System.exit(0); // stops the program
			}
		}
	}

	public static int getInput() { // inside () is "Inputs" to method; need () or not a method
		int n;
		do {
			System.out.print("Enter positive integer >= 2: ");
			n = IO.readInt();
		} while (n < 2);
		return n; // returns to int, the return value type
	}
}
