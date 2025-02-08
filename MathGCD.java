import java.util.Scanner;

public class MathGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Number 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Input Number 2: ");
        int num2 = sc.nextInt();
        
        sc.close(); // Close Scanner to avoid resource leak
        
        int hcf = 1; // Variable to store the Highest Common Factor
        
        // Finding the HCF using iteration
        System.out.print("HCF : ");
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
            	System.out.print(i+ " ");
                
            }
        }
        
        // Printing the HCF
        
    }
}
