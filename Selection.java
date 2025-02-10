
public class Selection {

	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2};
		for(int i=0;i<arr.length;i++) {
			int mini =i;
			for(int j =i;j<arr.length;j++) {
				if(arr[mini] > arr[j]) {
					mini = j;
				}
				int temp = arr[mini];
				arr[mini] = arr[i];
				arr[i] = temp;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
