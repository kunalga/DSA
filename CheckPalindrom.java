import java.util.*;
public class CheckPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input :");

		int num = sc.nextInt();
		int userInput = num;
		int dig =0;
		while(num >0) {
			int lastDig = num%10;
			dig = dig *10 + lastDig;
			num = num/10;
		}
		System.out.print(dig);
		
		if(dig == userInput) {
			System.out.print(" Palindrom ");
	
		}else {
			System.out.print(" Not Palindrom ");

			
		}

	}

}
