
public class PrifixArray {

	public static void main(String[] args) {
		//Prefix Sum Array 
		int[] arr = {1,-2,6,-1,3};
		int currSum =0;
		int maxSum =0;
		int [] prifix = new int[arr.length];
		//Step -1 First Create Prefix Array 
		prifix[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			prifix[i] = prifix[i-1]+arr[i];
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(i ==0) {
					currSum = prifix[j];
				}else {
					currSum = prifix[j] - prifix[i-1];
					}
				maxSum = Math.max(maxSum, currSum);
				
			}
			
			
		}
		System.out.println(maxSum);
		
	}

}
