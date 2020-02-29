
// RECURSIVE version is in Recursion.java
public class BinarySearch {

	private static boolean 
	binarySearch(int[] A, int target) {
		int lo=0, hi=A.length-1;
		while (lo <= hi) {
			int mid=(lo+hi)/2;
			if (target == A[mid]) { return true; }
			if (target < A[mid]) {  // search in left half
				hi=mid-1; 
			} else {  
				lo=mid+1;
			}
		}
		return false;
	}
	
	private static boolean 
	binarySearch(String[] A, String target) {
		int lo=0, hi=A.length-1;
		while (lo <= hi) {
			int mid=(lo+hi)/2;
			int c = target.compareTo(A[mid]);
			if (c == 0) { return true; }
			if (c < 0) {  // search in left half
				hi=mid-1; 
			} else {  
				lo=mid+1;
			}
		}
		return false;
	}
	
	public static void printArray(int[] list) {
        System.out.print("[");
        System.out.print(list[0]);
        for (int i=1; i < list.length; i++) {
                System.out.print("," + list[i]);
        }
        System.out.println("]");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter sorted list of integers, comma separated");
        String line = IO.readString();
        String[] items = line.split(",");
        int[] arr = new int[items.length];
        for (int i=0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(items[i]);
        }
        System.out.print("Array :");
        printArray(arr);
        
        System.out.print("(s)earch or (q)uit?: ");
        char ch = Character.toLowerCase(IO.readChar());
        while (ch != 'q') {
                System.out.print("Enter target integer: ");
                int target = IO.readInt();
                if (binarySearch(arr, target)) {
                        System.out.println("found");
                } else {
                        System.out.println("not found");
                }
                System.out.print("(s)earch or (q)uit?: ");
                ch = Character.toLowerCase(IO.readChar());
        }

	}

}
