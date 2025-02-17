
public class SearchKeyElement {
	public static int searchIndex(int[] arr ,int key,int inx) {
		if(inx == arr.length -1) {
			return -1;
			
		}
		if(key == arr[inx]) {
			return inx;
			
		}
		 int en =searchIndex(arr , key,inx+1);
		 return en;
		 
	}

	public static void main(String[] args) {
		int[] arr = {12,53,69,79,31,65};
		 System.out.println(searchIndex(arr ,79,0));

	}

}
