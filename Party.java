public class Party {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//TODO Auto-generated method stub	
	
	// assuming the user enters only positive integers
		
	System.out.print("How many people are attending the party? ");
	int numberAttendees = IO.readInt();
	
	System.out.print("On average, how many slices will each person eat? ");
	int slicesCanEat = IO.readInt();
	
	System.out.print("On average, how many cans of soda will each person drink? ");
	int sodaCanDrink = IO.readInt();
	
	System.out.print("What is the cost of one pizza pie? ");
	double pizzaCost = IO.readDouble();
	
	System.out.print("How many slices are there in a pizza pie? ");
	int pizzaSlices = IO.readInt();
	
	System.out.print("What is the cost of a case of soda? ");
	double sodaCost = IO.readDouble();
	
	System.out.print("How many cans of soda are there in a case? ");
	int sodaCans = IO.readInt();
	
	// calculations
	int totalPizzaSlices = numberAttendees*slicesCanEat;
	int totalSodaCans = numberAttendees*sodaCanDrink;
	double totalPizzaPies = Math.ceil((double)totalPizzaSlices/pizzaSlices);
	double totalSodaCases = Math.ceil((double)totalSodaCans/sodaCans);
	double totalCost = (totalSodaCases*sodaCost) + (totalPizzaPies*pizzaCost);
	IO.outputDoubleAnswer(totalCost);
	
	}
}
