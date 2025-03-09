
public class BackTrack {
	public static void changeArr(int arr[],int inx ,int val) {
		if(inx ==arr.length) {
			return;
		}
		//Kaam 
		arr[inx] = val;
		System.out.print(arr[inx] + " ");
		changeArr(arr,inx+1,val+1);
		arr[inx]=arr[inx]-2;
		if(inx == arr.length-1) {
			System.out.println();
			
		}
		System.out.print(arr[inx] + " ");
		
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		changeArr(arr,0,1);

	}

}
