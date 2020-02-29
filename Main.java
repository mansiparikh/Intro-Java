public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String operator = IO.readString();
		
		if (operator.equals("add")) {
		int first = IO.readInt();
		int second = IO.readInt();
		System.out.println(first+second); 
		} else if (operator.equals("subtract")) {
		int third = IO.readInt();
		int fourth = IO.readInt();
		System.out.println(third-fourth); 
		} else if (operator.equals("multiply")) {
		int fifth = IO.readInt();
		int sixth = IO.readInt();
		System.out.println(fifth*sixth); 
		} else if (operator.equals("exp")) {
		int seventh = IO.readInt();
		int eighth = IO.readInt();
		int result;
			if (eighth == 0) {
			System.out.println("1");
			} else if (eighth == 1) {
			System.out.println(seventh);
			} else {
			result = seventh*seventh;
			for (int i = 2; i < eighth; i++) {
			result =+ result*seventh;
			}
			System.out.print(result);
			}	
		} else if (operator.equals("end")) {
			System.exit(0);
		}
	*/	
		
	String s = IO.readString();
	s = s.toLowerCase();	
	
	if (s.equals("end")) {
		System.exit(0); }
	
	int vowels = 0;
	int consonants = 0;
	char c;
	
	for (int i = 0; i < s.length(); i++) {
		c = s.charAt(i);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			vowels++;
		} else {
			consonants++;
		}
	}
		
	if (vowels == s.length()) {
		System.out.print("weird word");
	} else if (consonants == s.length()) {
		System.out.print("weirder word");
	} else {
		System.out.print(vowels);
	}
	
	
	}
}
