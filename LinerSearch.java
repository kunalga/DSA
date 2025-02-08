import java.util.Scanner;

public class LinerSearch {

	public static void main(String[] args) {
		//Liner Search Code 
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Key : ");
		int key = sc.nextInt();		
		int[] arr = {12,42,45,32,55,66,29,10,16};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.print("Key is Found "+ i);
				break;
			}
		}

	}

}
