
public class Patterns {

	public static void main(String[] args) {
		/**
		 * 
		 */

		/**
		 * @authorKunal 
		 * Program for pattern
		 * 1111
		 * 2222
		 * 3333
		 * 4444
		 */
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		int n =10;
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if(i == 0 || i==n || j==n/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		
		
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if(j == 0 || j==n || j==i) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if((j ==0 &&  i!=n) ||(j!=0 &&  i==n && j!=n ) || (j==n && i!=n)) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		//R
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if(j==0||(i==0&&j<=(n-1)/2)||(j==(n-1)/2&&i<=(n-1)/2)||i-j==(n-1)/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if((j ==0 &&  i!=n) ||(j!=0 &&  i==n && j!=n ) || (j==n && i!=n) || (i==0 && j!=n && j!=0 )) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=n;j++) {
				if(j == 0 || j==n || j==i) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		
		
		
		


	}

}
