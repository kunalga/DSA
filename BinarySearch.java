import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary Search 
		int[] arr = {1,12,43,44,221,135,923};
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Key : ");
		int key = sc.nextInt();
		
		int end = arr.length;
		int start = 0;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]==key) {
				System.out.print("Key is Found "+ mid);
				break;

				
			}
			else if(arr[mid]>key){
				end = mid -1;
				
			}else {
				start = mid +1;
			}
		}
		

	}

}
