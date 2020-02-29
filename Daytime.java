public class Daytime {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			// ask for and read in sunrise hour and minute
			System.out.print("Was sunrise in the morning (AM) - yes/no?: ");
			boolean sunriseAM = IO.readBoolean();
			
			int sunriseHour;
			
			/* CAN WRITE THE CONDITION WITH == true
			if (sunriseAM == true) {
			*/	
			/*BUT THE FOLLOWING CONDITION WITHOUT == true does the same thing */
			if (sunriseAM) { 
				System.out.print("Enter sunrise hour (0..11): ");
				/** THIS NEXT LINE MEANS sunriseHour is declared INSIDE
				 * the CURLY BRACES for the if - and will NOT be visible
				 * outside the braces. So we can't do it this way, instead
				 * we need to declare sunriseHour before the curly braces
				 */
				//int sunriseHour = IO.readInt();
				sunriseHour = IO.readInt();
				if (sunriseHour < 0 || sunriseHour > 11) {
					System.out.println("Hour should be between 0 and 11");
					System.exit(1);   // exit the program
				}
			} else { //this else is for sunriseAM not true
				System.out.print("Enter sunrise hour (0..12): ");
				sunriseHour = IO.readInt();
				
				if (sunriseHour < 0 || sunriseHour > 12) {
					System.out.println("Hour should be between 0 and 12");
					System.exit(1);   // exit the program
				}
			}
			
			System.out.print("Enter sunrise minute (0..59): ");
			int sunriseMinute = IO.readInt();
			if (sunriseMinute < 0 || sunriseMinute > 59) {
				System.out.println("Minutes should be between 0 and 59");
				System.exit(1);   // exit the program
			}
			
			int sunsetHour;
			
			// ask for and read in sunset hour and minute
			System.out.print("Was sunset in the afternoon (PM) - yes/no?: ");
			boolean sunsetPM = IO.readBoolean();
			if (sunsetPM) { 
				System.out.print("Enter sunset hour (0..12): ");
				sunsetHour = IO.readInt();
				if (sunsetHour < 0 || sunsetHour > 11) {
					System.out.println("Hour should be between 0 and 12");
					System.exit(1);   // exit the program
				}
			} else {
				System.out.print("Enter sunset hour (0..11): ");
				sunsetHour = IO.readInt();
				if (sunsetHour < 0 || sunsetHour > 11) {
					System.out.println("Hour should be between 0 and 11");
					System.exit(1);   // exit the program
				}
			}
			
			System.out.print("Enter sunset minute (0..59): ");
			int sunsetMinute = IO.readInt();
			if (sunsetMinute < 0 || sunsetMinute > 59) {
				System.out.println("Minutes should be between 0 and 59");
				System.exit(1);   // exit the program
			}
			
			// add 12 to sunrise hour if in the afternoon, but not 12 pm
			// if (sunriseAM != true && sunriseHour != 12
			if (!sunriseAM && sunriseHour != 12) {
				sunriseHour += 12;
			}
			
			// convert sunrise to minutes from midnight
			int sunriseTime = sunriseHour*60 + sunriseMinute;
			
			if (sunsetPM && sunsetHour != 12) {  // NOTE THE SYNTAX FOR not equal to
				sunsetHour = sunsetHour + 12;
			}
			
			// convert sunset to minutes from midnight
			int sunsetTime = sunsetHour*60 + sunsetMinute;
			
			// subtract to get duration
			int daytime = sunsetTime - sunriseTime;
			
			// what if sunrise time is AFTER sunset time? Not acceptable
			if (daytime <= 0) {
				System.out.println("Error, sunset time should be AFTER sunrise time");
				System.exit(1);
			}
			
			// convert back to hours and minutes
			
			/*
			int daytimeHours = daytime / 60;   // truncates fractional part, if any,
											   // since both numerator and denominator are integers
			int daytimeMinutes = daytime % 60;  // % stands for "modulus", i.e. remainder
			*/
			
			/*
			double duration = daytime*1.0/60;  // mult by 1.0 to make numerator a double
			int daytimeHours = (int)duration; // "CAST" to int to slice out the fractional part
			int daytimeMinutes = daytime - daytimeHours*60;
			*/
			
			int daytimeHours = daytime/60; // integer division, truncates place after decimal
			int daytimeMinutes = daytime%60; // % is for remainder, also called the modulus operator
			
			IO.outputStringAnswer(daytimeHours + "," + daytimeMinutes);  
			
			//NOTES: && is AND, || is OR, ! is NOT, == is equal to, = is an assignment, != is not equal to
			
			
			// CHANGE COMPILER TO 1.6 NOT 1.7 BECAUSE HAVE OLDER JAVA (or something)
		}

	}

