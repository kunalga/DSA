public class GetIthBit {
    public static int getIthBit(int num, int inx) {
        int bitMask = 1 << inx;
        if ((bitMask & num) != 0) { 
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Get Ith Bit
        int num = 7;  
        System.out.println(getIthBit(num, 0)); 
    }
}
