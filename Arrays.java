
public class Arrays {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// declaring an array does NOT mean you get
		// space for the array cells
		// you ONLY get space for the variable A which
		// will hold a reference to the actual array cells.
		// initially this reference is zero, which
		// means it does NOT refer to anything
		int[] A;
		
		// to get space for the array cells, we need to 
		// ask for it using the keyword "new"
		A = new int[10]; // specify number of cells, or "length" of array
		
		// you can get a number of cells at any time like this
		System.out.println("length of A=" + A.length);
		
		/*
		System.out.println("Enter array length: ");
		int n = IO.readInt();
		double[] doubles = new double [n]; 
		System.out.println("length of doubles=" + doubles.length);
		
		for (int i=0; i < A.length; i++) {
			System.out.println("Enter next int value for A: ");
			A[i] = IO.readInt();	
		}

		// print array
		System.out.print("[");
		for (int i=0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("]");
		 */
		
		//int[] B;
		// System.out.println("B[0]=" + B[0]); //THIS WILL NOT WORK BECAUSE B IS NOT INITALIZED WITH ACTUAL ARRAY SPACE USING NEW
		
		//THIS IS A SPECIAL CASE WHERE YOU DON'T USE NEW TO GET CELLS
		//RIGHT HAND SIDE GETS CELL SPACE AND INITIALIZES VALUES IN ALL THE CELLS
		int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.print("Enter month number (1...12): ");
		int num = IO.readInt();
		//if (num >= 1 && num <= monthNames.length) {
			System.out.println("Month " + monthNames[num-1] + " has " + daysInMonths[num-1] + " days");
		//} else {
			//System.out.println(num + " out of bounds!");		
		//}
}
	}

