
public class FibonacciNo {
	public static int fibonnacci(int num) {
		if(num ==0 || num ==1) {
			return num;
		}
		int fn = fibonnacci(num -1) + fibonnacci(num -2);
		
		return fn;
	}

	public static void main(String[] args) {
		int num =6;
		System.out.println( fibonnacci(num));

	}

}
