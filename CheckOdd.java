import java.util.Scanner;

public class CheckOdd {
	public static void oddOneOut(int num) {
		if((num&1)==1) {
			System.out.print("Odd");
		}else {
			System.out.print("Even");
			
		}
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		oddOneOut(num);
		

	}

}
