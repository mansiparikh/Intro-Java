
public class TimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(3,false); // 3 pm
		System.out.println("t1 = " + t1);
		Time t2 = new Time(1,30,false); // 1:30 pm
		System.out.println("t2 = " + t2);
		if (t2.before(t1)) {
			System.out.println("t2 is before t1");
		} else {
			System.out.println("t1 is before t2");
		}
		Time t3 = new Time(3,30,false); // 3:30 PM
		System.out.println("t3 = " + t3);
		if (t3.overlaps(t1)) {
			System.out.println("t3 overlaps t1");
		} else {
			System.out.println("t3 does not overlap t1");
		}
	}

}
