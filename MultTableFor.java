
public class MultTableFor {

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
		
		for (int r=1; r <= rows; r++) {
			for (int c=1; c <= columns; c++) {
				System.out.print(r*c + "  ");
			}
			System.out.println();
		}
		
	}

}
