import java.util.ArrayList;

// Definition of calendar object. A calendar keeps a chronological list of events/appointments,
// and allows adds, deletes, and modifications of events
public class Calendar {
	private String username;
	private ArrayList<Event> events;   
	
	public Calendar(String username) {   
		this.username = username;
		events = new ArrayList<Event>();
	}
	
	public String getUsername() {
		return username;
	}
	
	public int getSize() {
		return events.size();
	}
	
	// adds a new event in chronological order
	// if this conflicts with an existing event, a warning message is 
	// printed, and the user has the option to go ahead with the add or cancel it
	// method returns true if the event was added, false if not
	public boolean addEvent(Event event) {
		// loop as long as events in list are before the new event
		int i=0;
		while (i < events.size()) {
			if (events.get(i).before(event)) {
				i++;
			} else {
				break;
			}
		}
		if (i == events.size()) { // add new event to end 
			events.add(event);
			return true;
		}
		
		// check if there is a conflict
		if (!events.get(i).conflictsWith(event)) {
			// add at i 
			events.add(i, event);
			return true;
		}
		
		// conflict, resolve it
		return resolveConflict(i,event);
	}
	
	private boolean resolveConflict(int i, Event event) {
		System.out.println(event + " conflicts with one or more existing events");
		System.out.print("Do you want to (a)dd or (c)ancel? ");
		char ch = Character.toLowerCase(IO.readChar());
		while (ch != 'a' && ch != 'c') {
			System.out.print("You must type 'a' or 'c': ");
			ch = Character.toLowerCase(IO.readChar());
		}
		if (ch == 'c') {  // return without adding
			return false;
		} 
		// plug this event in the correct chronological place, checking minutes and seconds
		int eventSeconds = event.getTime().getMin()*60 + event.getTime().getSec();	
		while (i < events.size()) {
			Time tm = events.get(i).getTime();
			int iSeconds = tm.getMin()*60 + tm.getSec();
			if (eventSeconds <= iSeconds) {  // insert at i after moving stuff over
				events.add(i,event);
				return true;
			}
			i++;
		}
		// reached the end, add to end
		events.add(event);
		return true;
	}	

	// deletes the given event
	// if event does not exist, returns false, otherwise true
	public boolean deleteEvent(Event event) {
		int i = events.indexOf(event);
		if (i == -1) {
			return false;
		}
		events.remove(event);
		return true;
	}
	
	// deletes all events for given date
	public void deleteAllEvents(Date date) {
		int i=0;
		while (i < events.size()) {
			if (events.get(i).getDate().equals(date)) {
				break;
			}
			i++;
		}
		if (i == events.size()) {  // no matches
			return;
		}
		// remove this and all subsequent matches with same date
		while ((i+1) < events.size()) {
			if (events.get(i+1).getDate().equals(date)) {
				events.remove(i+1);
			} else {
				break;
			}
		}
	}
	
	// changes original event to new event
	// if original event is not found, returns false, otherwise true
	public boolean modifyEvent(Event originalEvent, Event newEvent) {
		for (int i=0; i < events.size(); i++) {
			if (events.get(i).equals(originalEvent)) {
				events.set(i,newEvent);
				return true;
			}
		}
		return false;
	}
	
	// returns all events in calendar
	public String toString() {
		if (events.isEmpty()) {  // no events
			return "\n";
		}
		
		// loop through all events in calendar and build string
		StringBuilder sb = new StringBuilder();
		for (Event evt: events) {   // for each loop
			sb.append(evt);
			sb.append("\n");		
		}
		return sb + "";
	}
	
	// returns all events for a day, one per line
	public String eventsForDay(Date date) {
		int i=0;
		while (i < events.size()) {
			if (events.get(i).getDate().equals(date)) {
				break;
			}
			i++;
		}
		if (i == events.size()) {  // no matches
			return "\n";
		}
		
		// loop through this and all subsequent matches with same date
		StringBuilder sb = new StringBuilder();
		while (i < events.size()) {
			if (events.get(i).getDate().equals(date)) {
				sb.append(events.get(i));
				sb.append("\n");	
				i++;
			} else {
				break;
			}
		}
		return sb.toString();  // or sb + ""
	}
}
