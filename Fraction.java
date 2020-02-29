
public class Fraction {

	// class fields
	private int numerator;
	private int denominator;
	// disallows access to field from different places, only can be accessed by methods in same class
	
	// IF THERE IS NO OTHER CONSTRUCTOR IN THE CLASS, then
	// compiler throws in a default constructor that takes
	// no arguments, and does nothing inside it
	// looks like this:
	// public Fraction() { }
	
	// general constructor, takes both numerator and denominator as arguments
	public Fraction(int numerator, int denominator) {
		// "this" is a keyword that refers to THIS object (the field variable)
		// on which this constructor is being executed
		this.numerator = numerator;
		if (denominator == 0) {
			denominator = 1;
		}
		this.denominator = denominator;	
	}
	
	// constructor for Fraction objects that have 1 for denominator
	public Fraction(int numerator) {
		/* VERSION 1
		this.numerator = numerator; 
		denominator = 1;
		*/
		/* VERSION 2 - calls the constructor that takes two int parameters */
		this(numerator, 1); // HERE THE KEYWORD this CALLS ANOTHER CONSTRUCTOR
	}

	// no-arg constructor, for the Fraction 1/1
	public Fraction() {
		this(1,1);  // assigns values to fields
	}
	
	// getter method for numerator
	public int getNumerator() {
		return numerator;
	}

	// getter method for denominator
	public int getDenominator() {
		return denominator;
	}
	
	/* THESE ARE SETTERS FOR FRACTION, if you choose to write them
	 * BUT WE WON'T, because we consider Fraction to be IMMUTABLE (like String)
	 */
	// setter method for numerator
	/*
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	// setter method for denominator
	public void setdenominator(int denominator) {
		this.denominator = denominator;
	}
	*/
	
	// this fraction is updated with the result of adding other to it
	public void add(Fraction other) {
		denominator *= other.denominator;
		numerator = numerator*other.denominator + denominator*other.numerator;
	}
	
	// this fraction is not updated
	// a new result fraction is created and returned instead
	public Fraction addTwo(Fraction other) {
		int denominator = this.denominator*other.denominator;
		int numerator = this.numerator*other.denominator + this.denominator*other.numerator;
		return new Fraction(numerator, denominator);
	}
	
	// standard method, returns string representation of object
	public String toString() {
		return numerator + "/" + denominator;
	}

	public boolean equals(Fraction other) {
		return numerator == other.numerator && denominator == other.denominator;
	}
}
