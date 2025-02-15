
public class SumRecurssion {
	public static int sumOfN(int num) {
		if(num == 1) {
			return num;
			
		}
		int no = sumOfN( num-1);
		int sum = num + no;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfN(10));

	}

}
