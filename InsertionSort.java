
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {14,9,15,12,6,8,13};
		for(int i=1;i<arr.length;i++) {
			int cur =i;
			while(cur>0 && arr[cur-1]>arr[cur]) {
				int temp = arr[cur];
				arr[cur] = arr[cur-1];
				arr[cur-1] = temp;
				cur--;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}

	}

}
