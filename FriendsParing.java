
public class FriendsParing {
	public static int friendsParing(int n) {
		if(n==1 || n==2) {
			return n;
		}
		int fnm1 =friendsParing(n-1);
		int fnm2 = friendsParing(n-2);
		int pairWays = (n-1)*fnm2;
		int toWays = fnm1+pairWays;
		return toWays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(friendsParing(3));
	}

}
