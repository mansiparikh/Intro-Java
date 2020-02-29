
public class LowerTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.print("Enter number of rows/columns for square matrix, greater than zero: ");
			n = IO.readInt();
		} while (n <= 0);

		
		
		// set up the 2D array
		int[][] matrix = new int[n][n];
		//i initialize array with -1
		for (int r=0; r < n; r++) { // tables.length is # rows
			for (int c=0; c <= r; c++) { //tables[0]/length is # columns
				matrix[r][c] = -1;
			}
		}
		
		for (int r=0; r < n; r++) { // tables.length is # rows
			for (int c=0; c <= r; c++) { //tables[0]/length is # columns
				matrix[r][c] = r+c;
			}
		}
	
		// print array
		for (int r = 0; r < n; r++) {
		System.out.print("|");
		for (int c=0; c < n; c++) {
			System.out.print(matrix[r][c] + " ");
		}
		System.out.println("|");
	}
	}
}
