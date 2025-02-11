
public class LargsestLen {
	public static int largsestString(String[] str){
		
		int len = str[0].length();
		for(int i=1;i<str.length;i++) {
			if(len < str[i].length()) {
				len = str[i].length();
			}
		}
		return len;
		
	}

	public static void main(String[] args) {
		String[] str = {"apple","Mango","apple pie" };
		System.out.print(largsestString(str));
		
		

	}

}
