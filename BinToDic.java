import java.util.*;
public class BinToDic {

	public static void main(String[] args) {
		//Binary To Dic
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Binary Number : ");
		int Dic =0;
		int binNum = sc.nextInt();
		int k =0;
		while(binNum >0) {
			int lastDig = binNum%10;
			Dic = (int) (Dic + lastDig * Math.pow(2,k));
			binNum = binNum/10;
			k++;
		}
		System.out.print("Dicmel Number : "+ Dic);


	}

}
