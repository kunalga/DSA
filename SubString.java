
public class SubString {
	public static void subStringIn(String str,int inx,String ans) {
		if(inx ==str.length()) {
			System.out.print( ans +" ,");
			return;
		}
		//Chose Yes 
		subStringIn(str,inx+1,ans+str.charAt(inx));
		//Chose No
		subStringIn( str, inx+1, ans);
		
	}
	public static void main(String[] args) {
		String str ="abc";
		String ans ="";
		subStringIn( str,0, ans);
	}

}
