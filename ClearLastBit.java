
public class ClearLastBit {
	public static int clearBit(int num, int idx) {
		int bitMask = (~0)<<idx;
		
		
		return (bitMask & num);
		
	}

	public static void main(String[] args) {
		int num = 23;
		int idx =3;
		System.out.println(clearBit(num,idx));
		
		

	}

}
