public class PrimesWithArrayReturn {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ask user for n
		// and generate the first n primes
		// e.g. if n=10, we will generate the first 10 primes
		int n = getInput();
		
		// compute first n primes and store in primes array
		int[] primes = computePrimes(n);
		
		// print array
			printArray(primes);
	}

	public static int[] computePrimes(int n) {
		// set up the array to hold the primes
		int[] primes = new int[n];
		
		int p=1, count=0;
		boolean isPrime; // use a flag
		while (count < n) {
			p++;
			isPrime = true; // reset
			for (int d=2; d <= p/2; d++) {
				if (p % d == 0) { // d divides into n without the remainder
					// not a prime
					isPrime = false;
					break; // out of the loop, not the if
				}
			}	
			if (isPrime) { // same as saying if (isPrime == true)
			// p is a prime
			primes[count] = p;
			count++;
			}
		}
		return primes;
	}

	public static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	public static int getInput() {
		int n;
		do {
			System.out.print("Enter positive integer >= 1: ");
			n = IO.readInt();
		} while (n < 1);
		return n;
	}	
}
