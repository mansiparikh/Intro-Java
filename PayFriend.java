public class PayFriend {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//TODO Auto-generated method stub
		
		System.out.print("Enter payment amount: ");
		int payment = IO.readInt();
		
		double fee;
		
		if (payment <= 0) {
			IO.reportBadInput();
		} else {
			if (payment <= 100) {
				fee = 5;
				IO.outputDoubleAnswer(fee);
			} else if (payment > 100 && payment <= 200) {
				fee = 6;
				IO.outputDoubleAnswer(fee);
			} else if (payment > 200 && payment < 1000) {
				fee = payment*.03;
				IO.outputDoubleAnswer(fee);
			} else if (payment >= 1000 && payment <= 1500) {
				fee = 15;
				IO.outputDoubleAnswer(fee);
			} else if (payment > 1500 && payment < 10000) {
				fee = payment*.01;
				IO.outputDoubleAnswer(fee);
			} else if (payment >= 10000 && payment <= 15000) {
				fee = 100.00 + ((payment-10000)*(.02));
				IO.outputDoubleAnswer(fee);
			} else {
				fee = 200.00 + ((payment-15000)*(.03));
				IO.outputDoubleAnswer(fee);
				}
			}
		
	}
}
