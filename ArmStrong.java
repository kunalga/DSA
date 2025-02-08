import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		int inputNum = num;
		String strNum = String.valueOf(num);
		int size = strNum.length();
		int arm =0;
		while(num >0) {
			int lastDig = num%10;
			arm += Math.pow(lastDig, size);
			num = num/10;
			
		}
		if(arm == inputNum) {
			System.out.print("Armstrong Number  ");

			
		}else {
			System.out.print("Not Armstrong Number  ");

			
		}
	}

}
