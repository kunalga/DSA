
public class ReverseAnArr {

	public static void main(String[] args) {
		int[] arr = {12,141,45,254,63};
		//Reverse An Array 
		int si = 0;
		int en = arr.length-1;
		while(si<=en) {
			int temp = arr[si];
			arr[si] = arr[en];
			arr[en] = temp;
			si++;
			en--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
		

	}

}
