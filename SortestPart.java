
public class SortestPart {
	public static void destinationPart(String dest) {
		int x = 0;
		int y=0;
		for(int i=0;i<dest.length();i++) {
			 char ch = Character.toUpperCase(dest.charAt(i));
			switch(ch) {
			case 'W': x--;
					 break;
			case 'N': y++;
					 break;
			case 'E': x++;
			         break;
	        case 'S': y--;
	                 break;
					 
			
			}
			
		}
		y *=y;
		x *=x;
		System.out.println(Math.sqrt(x+y));
	}

	public static void main(String[] args) {
		String destination = "WNEENESENNN";
		destinationPart(destination);

	}

}
