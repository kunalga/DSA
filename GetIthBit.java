public class GetIthBit {
    public static int getIthBit(int num, int inx) {
        int bitMask = 1 << inx;
        if ((bitMask & num) != 0) { 
            return 1;
        }
        return 0;
    }
    public static int clearBit(int num ,int inx) {
    	int bitMask = 1<<inx;
    	return (~(bitMask)&num);
    	
    }
    public static int setIthBit(int num,int inx) {
    	int bitMask = 1<<inx;
    	
    	return (bitMask | num );
    }
    public static int updateBit(int num ,int inx,int bit) {
    	int bitClear = clearBit(num,inx);
    	
    	int bitMask = bit<<inx; 
    	return bitMask | bitClear;
    }

    public static void main(String[] args) {
        int num = 5;  
        System.out.println(getIthBit(num, 0)); 
        System.out.println(clearBit(num,0));
        System.out.println(setIthBit(num,1));
        System.out.println(updateBit(num ,4,1));
        
        
        
        
    }
}
