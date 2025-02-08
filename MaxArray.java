
public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {-2,-3,4,-1,-2,1,5,-3};
		int currMax =0;
		int maxSum = 0;
		for(int i=0;i<arr.length;i++) {
			
			currMax += arr[i];
			maxSum = Math.max(maxSum, currMax);
			if(currMax <0) {
				currMax =0;
			}

		}
		System.out.print(maxSum);
	}

}
