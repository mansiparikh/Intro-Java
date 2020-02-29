
public class MultTable2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		do {
			System.out.print("Enter number of rows, greater than zero: ");
			rows = IO.readInt();
		} while (rows <= 0);

		int columns;
		do {
			System.out.print("Enter number of columns, greater than zero: ");
			columns = IO.readInt();
		} while (columns <= 0);
		
		// set up the 2D array
		int[][] tables = new int[rows][columns];
		
		/*
		for (int r=1; r <= rows; r++) {
			for (int c=1; c <= columns; c++) {
				tables[r-1][c-1] = r*c;
			}
		}
		*/
		
		for (int r=0; r < rows; r++) { // tables.length is # rows
			for (int c=0; c < tables[0].length; c++) { //tables[0]/length is # columns
				tables[r][c] = (r+1)*(c+1);
			}
		}
	
		// print array
		for (int r = 0; r < rows; r++) {
		System.out.print("|");
		for (int c=0; c < columns; c++) {
			System.out.print(tables[r][c] + " ");
		}
		System.out.println("|");
	}
	}
}
