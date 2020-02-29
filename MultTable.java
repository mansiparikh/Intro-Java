
public class MultTable {

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
		
		int r=1;   // row tracker
		//int c=1;  INCORRECT - should be initialized inside, so it's reset every time a new row starts up
		while (r <= rows) {  // 1, 2, 3, ..., rows
			// column loop
			int c=1;
			while (c <= columns) {
				System.out.print(r*c + "  ");
				c++;
			}
			System.out.println();   // moves cursor to next line of output
			r++;
		}
		
	}

}
