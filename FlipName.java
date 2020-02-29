
public class FlipName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input first name space last name: ");
		String s = IO.readString();
		
		// look for black space, assuming only one, in string
		int pos = s.indexOf(' '); // ' ' is the blank space character, ' ' is character, " " is string
		System.out.println("Blank space found at " + pos);
		// extract first and last name
		String firstName = s.substring(0, pos); // 0 to pos-1
		String lastName = s.substring(pos+1); // pos+1 to the end of the string
		
		// print last name, first name
		System.out.println(lastName + ", " + firstName);
	}

}
