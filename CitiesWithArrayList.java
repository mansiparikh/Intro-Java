import java.util.ArrayList;

public class CitiesWithArrayList {

		public static boolean isLegit(String city) { // check if cities are only letters and spaces
			for (int i=0; i < city.length(); i++) { // length() is like that because strings are objects
				char ch = city.charAt(i); 
				if (ch == ' ') {
					continue; // skips over the next if statement, jumps back to the for loop
				}
				if (!Character.isLetter(ch)) {
					return false;
				} 
			}
			return true; 
		}	
	
		public static String getCity() {
			System.out.print("Enter city name ('quit' to stop): ");
			String city = IO.readString();
			while (!isLegit(city)) {
				System.out.print("City name must have letters and spaces ONLY ('quit' to stop): ");
				city = IO.readString();	
			}
			return city;
		}
		
		public static void addCity(ArrayList<String> cities, String city) {
			// scan the array list cities and find the correct place
			// for city
			for (int i=0; i < cities.size(); i++) { // size measures number of full cells in array list, capacity would be available space
				String nextCity = cities.get(i); // get is like [] for an array, or charAt for a String
				int c = city.compareToIgnoreCase(nextCity);
				if (c == 0) {
					return;
				}
				if (c < 0) {
					cities.add(i, city); // insert city at spot i
					return;
				}
			}
			cities.add(city); // add to the end of the array list
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// String cities=""; // empty string
			// cities is an ArrayList of String objects
			ArrayList<String> cities = new ArrayList<String>();
			
			String city;
			
			city = getCity();
			while (!"quit".equalsIgnoreCase(city)) { // equals- a method in the string object that compares both and tells if equal or not
				addCity(cities, city);
				System.out.println(cities);
				city = getCity();
			}

	}

}
