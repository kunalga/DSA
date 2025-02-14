
public class CountSetBit {
	public static int countsetbit(int num) {
		int count =0;
		while(num>0) {
			if((num & 1)!=0 ) {
				count++;
			}
			num = num>>1;
			
		}
		
		return count; 
	}

	public static void main(String[] args) {
		int num =172;
		System.out.println(countsetbit(num));
		
		

	}

}
