import java.util.*;
public class Count {

	public static void main(String[] args) {
		// Count Function in Java 
		int count =0;
		Scanner s1 = new Scanner(System.in);
		
		int number = s1.nextInt();
		while(number>0) {
			int lastDig = number%10;
			count++;
			number=number/10;		
			
		}
		System.out.print(count);
	}

}
