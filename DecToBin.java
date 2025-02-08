import java.util.*;

public class DecToBin{
	public static void main(String []args) {
		
		//Print Sum of N natural Numbers 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bin = 0;
		int place =1;
		while(n >0) {
			int lastBin = n%2;
			bin += lastBin *  place ;
			n =n/2;
			place = place*10;
			
		}
		System.out.print(bin);
	}
}