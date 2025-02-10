
public class CountSort {
	public static void main(String []args) {
		int[] arr = {1,4,1,3,2,4,7};
		int largest =0;
		for(int i=0;i<arr.length;i++) {
			if(largest <arr[i]) {
				largest = arr[i];
			}
		}
		int [] count = new int[largest +1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		int k=0;
		for(int i=0;i<arr.length+1;i++) {
			while(count[i]>0) {
				arr[k] = i;
				k++;
				count[i]--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
	}
}
