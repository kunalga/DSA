
public class RecursionQ3 {
	public static int sumOfNum(int num) {
		if(num == 1) {
			return num;
		}
		int nu =sumOfNum(num-1);
		int sum = nu +num;
		
		
		return sum;
	}

	public static void main(String[] args) {
		int num =5;
		System.out.print(sumOfNum(num));
		
	}

}
