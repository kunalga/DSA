
public class SumDiagonal {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sumNum =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					sumNum += arr[i][j];
				}
				if(i+j==arr.length-1 & j!=i) {
					sumNum += arr[i][j];
					
				}
			}
			
		}
		System.out.println(sumNum);

	}

}
