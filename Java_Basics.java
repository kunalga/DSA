import java.util.*;
public class Java_Basics{
	public static void main(String []args) {
		
		//Print Sum of N natural Numbers 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
		System.out.print(sum);
	}
}