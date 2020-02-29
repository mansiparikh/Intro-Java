
public class RecursionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("Enter word to check: ");
		String word = IO.readString();
		
		boolean answer;
		
		answer = allVowels(word);
		System.out.print(answer);
	}

	public static boolean allVowels(String s) {
		if (s.length() == 1) {
			if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' 
					|| s.charAt(0) == 'o' || s.charAt(0) == 'u') {
				return true;
			} else {
				return false;
			}
		} 
		if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' 
				|| s.charAt(0) == 'o' || s.charAt(0) == 'u') {
			return allVowels(s.substring(1));
		} else {
			return false;
		}
		
	}
				

}
