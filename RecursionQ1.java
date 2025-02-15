
public class RecursionQ1 {
	public static int printNo(int n) {
		if(n ==1) {
			System.out.println(n);
			return n;
		}
		System.out.println(n);
		return printNo(n-1);
	}

	public static void main(String[] args) {
		// Print number N to 1
		printNo(5);
		

	}

}
