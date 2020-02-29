
public class Compress {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print("Enter string: ");
	String str = IO.readString();
	
	String strComp = "";
	int letterCount = 1;
	for (int i = 0; i < str.length()-1; i++) {
		if (str.charAt(i) == str.charAt(i+1)) {
		letterCount++;
		}
		else if (letterCount == 1) {
		strComp = strComp + str.charAt(i);
		} else {
		strComp = strComp + Integer.toString(letterCount) + str.charAt(i);
		letterCount = 1;
		}
	}
	if (letterCount == 1) {
	strComp = strComp + str.charAt(str.length()-1);
	} else {
	strComp = strComp + Integer.toString(letterCount) + str.charAt(str.length()-1);	
	}

	IO.outputStringAnswer(strComp);
	
	}
}
