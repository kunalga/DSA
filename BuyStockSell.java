
public class BuyStockSell {

	public static void main(String[] args) {
		// Buy And Sell Stock
		int[] arr = {7,1,5,3,6,4};
		int profit =0;
		int maxProfit =0;
		int buyPrice = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(buyPrice <arr[i]) {
				profit = arr[i] -buyPrice;
				maxProfit = Math.max(maxProfit, profit);
				
				
				
			}else {
				buyPrice = arr[i];
			}
		}
		System.out.print(maxProfit);
	}
	

}
