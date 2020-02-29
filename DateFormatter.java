
public class DateFormatter {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read a date in yyyy/mm/dd format
		// print in <month name> <date>, <yrear> format
		String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		System.out.print("Enter date in yyyy/mm/dd format: ");
		String date = IO.readString();
		int firstSlash = date.indexOf('/'); // scan starting at 0
		int secondSlash = date.indexOf('/',firstSlash+1); // scan starting after the first slash
		
		String yyyy = date.substring(0,firstSlash);
		String mm = date.substring(firstSlash+1,secondSlash);
		String dd = date.substring(secondSlash+1); // don't have to set end of string limit (already knows)
	
		// convert month to an int value
		int month = Integer.parseInt(mm); // will convert string with a number and only a number into a number
		
		System.out.println(monthNames[month-1] + " " + dd + ", " + yyyy);
		
	}
}
