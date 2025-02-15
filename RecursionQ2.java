
public class RecursionQ2 {
	public static int printNo(int n) {
		if(n ==1) {
			System.out.println(n);
			
			return n;
		}
	     printNo(n-1);
		System.out.println(n);
		return n;
	}

	public static void main(String[] args) {
		// Print number 1 to N
		printNo(5);
		

	}

}
