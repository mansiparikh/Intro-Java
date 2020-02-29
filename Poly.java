public class Poly {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("Enter first root: ");
		int rootOne = IO.readInt();
		System.out.print("Enter second root: ");
		int rootTwo = IO.readInt();
		System.out.print("Enter third root: ");
		int rootThree = IO.readInt();
		
		int firstCoeff = 1;
		int secondCoeff = -1*(rootOne+rootTwo+rootThree);
		int thirdCoeff = (rootOne*rootTwo+rootTwo*rootThree+rootOne*rootThree);
		int Constant = -1*(rootOne*rootTwo*rootThree);
		
		System.out.print("The polynomial is: ");
		System.out.println(firstCoeff+"x^3 + ("+secondCoeff+")x^2 + ("+thirdCoeff+")x + ("+Constant+")");
	}
}