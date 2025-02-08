
public class TrapingRainWater {

	public static void main(String[] args) {
		int [] arr = {4,2,0,6,3,2,5};
		int [] leftMax = new int [arr.length];
		int totalWater =0;
		leftMax[0] = arr[0];
		for(int i=1;i<leftMax.length;i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i]);
		}
		int[] rightMax = new int [arr.length];
		rightMax[arr.length-1]= arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1],arr[i]);
		}
		for(int j=0;j<arr.length;j++) {
			int minLevel = Math.min(leftMax[j], rightMax[j]);
			totalWater += (minLevel - arr[j])* 1; 
		}
		System.out.print(totalWater);
		
	}

}
