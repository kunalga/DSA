
public class Factorial {
	public static int facNo(int num) {
		if(num ==0) {
			return 1;
		}
		int fac = facNo(num-1) *num; 
		
		return fac;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(facNo(5));

	}

}
