
public class LargestNo {

	public static void main(String[] args) {
		int[] arr = {12,42,45,32,55,66,29,10,16};
		int largeNo = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largeNo <arr[i]) {
				largeNo = arr[i];

			}
		}
	System.out.print(largeNo);
	}
	

}
