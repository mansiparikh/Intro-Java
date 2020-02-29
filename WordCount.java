
public class WordCount {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print("Enter sentence(s): ");
	String xyz = IO.readString().trim();
	String empty = " ";
	xyz = xyz + empty;

	System.out.print("Enter minimum length of word: ");
	int minLength = IO.readInt();
	
	String word = "";
	int pos;
	int pos2;
	int wordC = 0;
	int length = 0;
		
	while (!xyz.equals(" ")) {
	pos = 0;
	pos2 = xyz.indexOf(' ');
	word = xyz.substring(pos, pos2);
	xyz = xyz.substring(pos2).trim() + empty;
	length = countLetters(word);
	if (length >= minLength) {
		wordC++;
	}
	}
	
	IO.outputIntAnswer(wordC);
	
	}
	
	public static int countLetters(String word) {	
	int letterCount = 0;
	for (int i = 0; i < word.length(); i++) {
		if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' || word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
			letterCount++;
	}
	}
	return letterCount;
	}


	
	
}
