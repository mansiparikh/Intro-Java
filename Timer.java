
public class Timer {

	
	public static int seqSrch(int[] arr, int target) {
		for (int i=0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter array length: ");
		int n = IO.readInt();
		int[] intarr = new int[n];
		for (int i=0; i < n-1; i++) {
			intarr[i] =(int)(Math.random() * n);
		}
		
		// get current clock time
		long before = System.currentTimeMillis();
		// call sequential search for worst case - last item in array
		int index = seqSrch(intarr, intarr[intarr.length-1]);
		// time after
		long after = System.currentTimeMillis();
		int diff = (int)(after-before);
		System.out.println("Sequential search: " + diff + " milliseconds");
		
		// partial sums bad
		// get current clock time 
		before = System.currentTimeMillis();
		// execute
		Sorter.selectionSort(intarr);
		// time after
		after = System.currentTimeMillis();
		diff = (int)(after-before);
		System.out.println("Selection sort: " + diff + " milliseconds");
				
				
	}

}
