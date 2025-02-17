
public class LastIndxSearch {
	public static int lastKeyInx(int[] arr,int inx ,int key) {
		if(inx == -1) {
			return -1;
			
		}
		if(key == arr[inx]) {
			return inx;
		}
		return lastKeyInx(arr,inx-1 ,key);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,53,24,245,29,9};
		System.out.print(lastKeyInx(arr,arr.length-1 ,9));
	}

}
