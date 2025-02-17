
public class IsSorted {
	public static boolean isSorted(int [] arr,int num) {
		if(num == arr.length -1) {
			return true;
		}
		if(arr[num]>arr[num+1]) {
			return false;
		}
		return isSorted(arr,num+1);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		System.out.println( isSorted(arr,0));

	}

}
