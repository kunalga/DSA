
public class PowerFuncation {
	public static boolean powerFunction(int num) {
		int bitMask = num-1;
		if((bitMask & num) ==0) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// Power Function
		int num = 4;
		System.out.println(powerFunction(num));

	}

}
