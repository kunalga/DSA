
public class SumDigo {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sumNo =0;
		int n =arr.length;
		
		for(int i=0;i<arr.length;i++) {
			sumNo += arr[i][i];
			if(n-i-1 !=i) {
				sumNo += arr[i][n-i-1];			
				
			}
		}
		System.out.println(sumNo);

	}

}
