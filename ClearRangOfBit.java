
public class ClearRangOfBit {
	public static int clearRangofbit(int num, int idx ,int end) {
		int a = (~0)<<(end+1);
		int b = (1<<idx)-1;
		int bitMask = a | b;
		
		
		
		return bitMask & num;
	}

	public static void main(String[] args) {
		int num =1229;
		int idx =2;
		int end =7;
		System.out.println( clearRangofbit(num,  idx ,end));

	}

}
