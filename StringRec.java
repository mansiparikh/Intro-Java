public class StringRec
{
	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	/*
	public static void main(String[] args) {
		System.out.print("Enter string to decompress: ");
		String original = IO.readString();
		String converted = decompress(original);
		System.out.print("The end result: " + converted);
	}
	*/
	
	public static String decompress(String compressedText) {
		
		if (compressedText.length() == 0) {
			return "";
		} else if (Character.isDigit(compressedText.charAt(0))) {
			char c = compressedText.charAt(0);
			c--; 	
			if (c != '1') {
			return compressedText.charAt(1) + decompress(c+compressedText.substring(1));
			} else {	
			return compressedText.charAt(1) + decompress(compressedText.substring(1));
			}
		} else {
			char c = compressedText.charAt(0);
			return c + decompress(compressedText.substring(1));
		}	
	}

}