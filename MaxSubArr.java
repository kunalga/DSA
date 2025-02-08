
public class MaxSubArr {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		int sum =0;
		int maxSum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				System.out.print("[ ");
				for(int k=i;k<=j;k++) {
					sum +=arr[k];
					
					System.out.print(arr[k] +",");
					}
				maxSum = Math.max(maxSum,sum);
				System.out.print("] ");
				sum =0;

				}
			System.out.println( "Max Sum :"+ maxSum);
			System.out.println();
			}
		
		System.out.println(maxSum);
		}

	


	}


