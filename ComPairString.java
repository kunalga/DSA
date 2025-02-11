
public class ComPairString {

	public static void main(String[] args) {
		// CompareTo
		String[] str = {"Mango","Apple","Banana"};
		String largStr = str[0];
		for(int i=1;i<str.length;i++) {
			if(largStr.compareTo(str[i])<0) {
				largStr = str[i];
				
			}
		}
		System.out.println(largStr);
		

	}

}
