
public class FractionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new Fraction object, uses no-argument ("no-arg") constructor
		// Fraction f = new Fraction();
		
		// create a new fraction object for 1/3
		Fraction f1 = new Fraction(1,3);
		System.out.println("f1 = " + f1.toString());
		
	
		// Fraction fbad = new Fraction(5,0);
		Fraction f2 = new Fraction(5);
		System.out.println("f2 = " + f2); // f2.toString() is automatically called
		
		// f2.denominator = 0; // THIS SHOULD NOT BE ALLOWED! MAKE FIELDS PRIVATE IN CLASS
	
		f1.add(f2);  // does 1/3 + 5, and updates f1 to the result
		System.out.println(f1);
		
		Fraction f3 = f1.addTwo(f2);
		System.out.println(f1 + "+" + f2 + "=" + f3);
		
		// declaring an object variable does NOT mean there IS an object
		// String s;
		// this is like saying String s = null;
		// String s = null;
		// int i = s.length(); - WILL GIVE A NULL POINTER EXCEPTION
		
		
	}

}
