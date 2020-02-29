// some recursive problems
public class Recursion {
	
	public static boolean sequentialSearch(int[] A, int target) {
		// call private recursive method
		return sequentialSearch(A, target, 0);
	}
	
	private static boolean sequentialSearch(int[] A, int target, int start) {
		if (target == A[start]) { return true; } // termination
		if (start == A.length-1) { return false; } // termination
		return sequentialSearch(A, target, start+1);
	}
	
	public static boolean binarySearch(int[] A, int target) {
		// call private recursive method
		return binarySearch(A, target, 0, A.length-1);
	}
	
	// recursive binary search, called from public method above
	private static boolean binarySearch(int[] A, int target, int lo, int hi) {
		if (lo > hi) { return false; } // termination
		int mid=(lo+hi)/2;
		if (target == A[mid]) { return true; } // termination
		if (target < A[mid]) {  // recurse on left half
			return binarySearch(A, target, lo, mid-1); 
		} else {  // recurse on right half
			return binarySearch(A, target, mid+1, hi); 
		}
	}
	
	// n is assumed to be >= 1
	public static int fact(int n) {
		if (n == 1) {   // termination condition (also known as base case) 
			return 1;
		} else {
			return n*fact(n-1);
		}
	}
	
	// n is assumed to be >= 0
	public static int fib(int n) {
		if (n == 0 || n == 1) {   // base cases
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static void bigK(int n) {
		if (n == 1) {  // termination condition
			System.out.println("k");
			return;
		}
		
		// print top k line
		System.out.print("k");
		for (int i=1; i < n; i++) {
			System.out.print(" ");
		}
		System.out.println("k");
		
		bigK(n-1);   // friend does inner k
		
		// print bottom k line
		System.out.print("k");
		for (int i=1; i < n; i++) {
			System.out.print(" ");
		}
		System.out.println("k");
		
	}
	
	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1) { return true; }   // termination
		if (s.charAt(0) != s.charAt(s.length()-1)) { return false; } // termination
		return isPalindrome(s.substring(1,s.length()-1));
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("(f)act, f(i)b, Big(k), or (q)uit? ");
		char ch = Character.toLowerCase(IO.readChar());
		while (ch != 'q') {
			if (ch == 'f') {
				System.out.print("Enter n (1 or more): ");
				int n = IO.readInt();
				System.out.println(fact(n));
			} else if (ch == 'i') {
				System.out.print("Enter n (0 or more): ");
				int n = IO.readInt();
				System.out.println(fib(n));
			} else if (ch == 'k') {
				System.out.print("Enter size (1 or more): ");
				int n = IO.readInt();
				bigK(n);
			} else {
			System.out.print("(f)act, f(i)b, Big(k), or (q)uit? ");
			ch = Character.toLowerCase(IO.readChar());
			}
		}
	}
}
