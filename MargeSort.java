
public class MargeSort {
	
	public static void divideArr(int arr[],int low ,int high) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		 divideArr(arr,low ,mid); 
		 divideArr(arr, mid+1 , high);
		 marge(arr,low,mid, high);
		
	}
	public static void marge(int arr[],int low,int mid,int high) {
		int[] temp = new int[high-low+1]; 
		int left = low;
		int right = high;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,24,23,86,928,9,10};
		

	}

}
