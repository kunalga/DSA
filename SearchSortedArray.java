
public class SearchSortedArray {

	public static void main(String[] args) {
		// 2 D array Search in Sorted Array 
		int [][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		int row =0;
		int n=3;
		int key =29;
		
		int coll = arr[0].length-1;
		while(row<= n & coll >=0 ) {
			if(arr[row][coll]==key) {
				System.out.println("Index of :"+ row +","+coll);
				break;
			}
			else if(arr[row][coll]>key) {
				coll--;
			}else {
				row++;
			}
			
		}

	}

}
