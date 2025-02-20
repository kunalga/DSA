
public class RemoveDuplicate {
	public static void removeDuplicates(String str,int inx ,StringBuilder newString ,boolean map[]) {
		if(inx == str.length()) {
			System.out.print(newString);
			return;
		}
		char currChar = str.charAt(inx);
		if(map[currChar-'a']==true){
			removeDuplicates(str,inx+1 ,newString ,map);
			
		}else {
			map[currChar-'a'] =true;
			removeDuplicates(str,inx+1 ,newString.append(currChar) ,map);
		}
		
		
	}

	public static void main(String[] args) {
		
		
		String str = "appnnacollege";
		
		removeDuplicates(str,0 ,new StringBuilder(""),new boolean[26]);
		

	}

}
