
public class Cities {
	
	/* alphabetical order of cities in list:
	 * cities is initially an empty string "" of length 0
	 * input will be city name, updated with a semicolon at the  end
	 * next input will have to be compared to the city(ies) that are already in the list
	 * ex: 1. input: NY, updated cities: "NY;" --> 2. input Chicago, updated cities: "Chicago;NY;"
	 * 3. input: Trenton, updated cities: "Chicago;NY;Trenton" where Trenton would have to be compared to Chicago and NY
	 * 4. input: Pittsburgh, which will have to be compared to all other cities and slipped in appropriate slot so updated cities: "Chicago;NY;Pittsburgh;Trenton;"
	 * for every new input, scan the cities string and then pick the next city in the string to compare with the input; then figure out result of comparison
	 */
	
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
	
	// adds city to cities string, and returns the updated cities string
	public static String addCity(String cities, String city) {
		int start = 0; 
		int pos = cities.indexOf(';',start);
		while (pos != -1) {
			String nextCity = cities.substring(start,pos); // pos always at semicolon
			// compare city against nextCity
			// c is 1 if same (case insensitive), < 0 if city comes before nextCity,
			// and > 0 if city comes after nextCity
			int c = city.compareToIgnoreCase(nextCity); // results in an int: if outcome is 0, equal; if < 0, s1 before s2; if > 0, s1 after s2; can even use compareToIgnoreCase
			if (c == 0) {
				return cities;
			}
			if (c < 0) {
				String prefix = cities.substring(0,start); // gives up to last semicolon
				String suffix = cities.substring(start);
				cities = prefix + city + ';' + suffix;
				return cities;
			}
			// falling through to here means c > 0
			// push start up to the first character in next city, which is pos+1
			start = pos + 1;
			pos = cities.indexOf(';',start);
		}
		return cities + city + ';';
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities=""; // empty string
		String city;
		
		city = getCity();
		while (!"quit".equalsIgnoreCase(city)) { // equals- a method in the string object that compares both and tells if equal or not
			cities = addCity(cities, city);
			System.out.println(cities);
			city = getCity();
		}
	
	}
	
}