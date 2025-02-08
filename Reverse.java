import java.util.Scanner;
public class Reverse{
	public static void main(String []args) {
		System.out.print("Enter Your Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse =0;
		while(num>0) {
			int lastDig = num%10;
			reverse = reverse *10 + lastDig;
			num = num/10;
			
		}
		System.out.print("reverse : " + reverse);
	}
}