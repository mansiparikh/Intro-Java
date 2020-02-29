
public class Methods {

	public static int globalVariable = 10;
	
	// no input parameters, no return values
	public static void m1() {
		System.out.println("Printing globalVariable from m1, value = " +
							globalVariable);
		globalVariable += 25;
	}
	
	// the following two methods overload the name "add"
	
	// this overloaded add sums two ints
	public static int add(int x, int y) {
		System.out.println("you are inside int add");
		return x+y;
	}
	
	// this overloaded add sums to floats
	public static float add(float x, float y) {
		System.out.println("you are inside float add");
		return x+y;
	}
	
	// this is not overloading
	// names of parameters are irrelevant
	// compiler considers this to be same as previous float version, ERROR
	/*
	public static float add(float y, float x) {
		
	}
	*/
	
	public static void stuff(int x, float y) {
		System.out.println("inside stuff(int, float)");
	}
	
	public static void stuff(float a, int b) {
		System.out.println("inside stuff(float, int)");
	}
	
	public static void local(int x) {
		x += 10;
		System.out.println("local x after addition = " + x);
	}
	
	/* not overloaded, parameter names are not relevant
	public void dumb(int x, int y) {
		
	}
	
	public void dumb(int a, int b) {
		
	}
	*/
	
	/* not overloaded, return types are not relevant
	public int dumb2(int x) { }
	
	public float dumb2(int x) { }
	*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call m1 sending nothing to it, and getting nothing back
		m1();

		System.out.println("globalVariable value = " + globalVariable);
		
		System.out.println("1+2=" + add(1,2));
		
		System.out.println("1+2.3=" + add(1f,2.3f));
		
		stuff(1f,3);
		
		stuff(3,1f);
		
		int x = 15;
		local(x);
		System.out.println("main x after local returns ="+x); // WHAT IS X?
		
	}

}
