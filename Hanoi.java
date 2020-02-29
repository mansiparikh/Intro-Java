/**
 * This program implements the towers of Hanoi game.
 *
 */
public class Hanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch;
		do {
			printTowers();
			System.out.print("Enter number of disks: ");
			int n = IO.readInt();
			hanoi(n, 'A', 'B', 'C');
			System.out.print("(c)ontinue or (q)uit?: ");
			ch = Character.toLowerCase(IO.readChar());
		} while (ch != 'q');
	}

	public static void hanoi(int n, char src, char dest, char temp) {
		if (n == 1) {
			System.out.println("Move from " + src + " to " + dest);
			return;
		}
		hanoi(n-1, src, temp, dest);
		System.out.println("Move from " + src + " to " + dest);
		hanoi(n-1, temp, dest, src);
	}
	
	public static void printTowers() {
		System.out.println();
		for (int i=0; i < 5; i++) {
			System.out.println("\t | \t | \t |");
		}
		System.out.println("\t---\t---\t---");
		System.out.println("\t A \t B \t C\n\n");
	}
}
