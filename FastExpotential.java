
public class FastExpotential {
	public static int fastExp(int num,int expo) {
		int ans =1;
		while(expo>0) {
			if((expo & 1) !=0) {
				ans = ans *num;
			}
			num = num*num;
			expo =expo>>1;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int num =3;
		int expo = 3;
		System.out.println(fastExp(num,expo));
		
		

	}

}
