
public class Palindrome {
	public static boolean isPalindrom(String s1) {
		boolean isPalin = true;
		int start =0;
		int en = s1.length()-1;
		while(start<=en) {
			if(s1.charAt(start) != s1.charAt(en)) {
				System.out.println("Not a Palindrom");
				isPalin =false;
				return isPalin;
			}
			start++;
			en--;
		}
		
		
		
		return isPalin;
	}

	public static void main(String[] args) {
		String s1 = "NITIN";
		System.out.print(isPalindrom(s1));
		
		

		
		

	}

}
