
public class AdditivePersistenceWithMethods {

	/**
	 * @param args
	 */
	
	/*
	intput: positive integer
	output; additive persistence, digital root
	9876 % 10 = 6 --> store somewhere
	9876/10 = 987
	---
	ROUND 1 of additive persistence
	987 % 10 = 7 
	987/10 = 98
	--
	98%10 = 8
	98/10 = 9 <-- stop because down to one digit 
	--
	6+7+8+9 --> running sum (6 --> 13 --> 21 --> 30)
	----
	ROUND 2 of additive persistence to get digital root
	30%10 = 0
	30/10 = 3 --> stop
	*/

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int n = getInput();
		compute(n); 
	
	}

	public static void compute(int n) {// void because printing the result 
	int originalN = n; 
	int ap=0;
	while (n >= 10) { //outer loop
		n= sumDigits(n);
		ap++;
		}
		System.out.println(originalN + ": additive persistence=" + ap + ", digital root=" + n);	
	}
	
	public static int sumDigits(int n) { // void because not returning anything to method
		int sum=0;
		while (n >= 10) { 	// or n>9, summing the digits
			int d = n % 10; 
			sum += d; // same as sum = sum + d
			n /= 10; // same as n = n/10
		}
		sum += n;
		return sum;
	}
	
	public static int getInput() {
		int n;
		do {
			System.out.print("Enter positive integer: ");
			n = IO.readInt();
		} while (n <= 0);
		return n;
	}
}
