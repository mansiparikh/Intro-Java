public class PigLatin {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter English word to translate into Pig Latin: ");
		String word = IO.readString();
		
		word = word.toLowerCase();
	
		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || 
			word.charAt(0) == 'i' || word.charAt(0) == 'o' ||
			word.charAt(0) == 'u') { 
			word = word + "way";
		} else {
			word = word.substring(1) + word.charAt(0) + "ay";
		}
		
		IO.outputStringAnswer(word);
		
	}
}
