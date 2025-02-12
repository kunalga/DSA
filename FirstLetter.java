
public class FirstLetter {

	public static void main(String[] args) {
		// aaabbcccd
		String s1 ="aaabbccd";
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<s1.length();i++) {
			int count =1;
			while(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)) {
				count++;
				i++;
				
			}
			sb.append(s1.charAt(i));
			if(count>1) {
				sb.append(count);
				
			}
		}
		System.out.println(sb);

	}

}
