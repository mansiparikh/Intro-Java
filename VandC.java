
public class VandC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a string: ");
		String s = IO.readString();
		
		int vnum=0, cnum=0; // accumulating variables
		
		for (int i=0; i < s.length(); i++) {
			char ch = s.charAt(i); // extract character from string by using index
			if (!Character.isLetter(ch)) { // sees if the character is a letter (I think)
				continue; 
			}
			ch = Character.toLowerCase(ch); // convert all to lowercase
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vnum++;
			} else {
				cnum++;
			}
		}
		System.out.println(vnum + " vowels, " + cnum + " consonants"); 
	}
}
