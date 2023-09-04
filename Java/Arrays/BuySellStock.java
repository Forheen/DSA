public class BuySellStock{
    public static int max_profit1(int stock[]){
        int profit= Integer.MIN_VALUE;
        for(int i=0; i<stock.length;i++){
            for(int j=i+1; j<stock.length;j++){
                int curr_profit = stock[j]- stock[i];
                profit=Math.max(curr_profit, profit);
            }
        }
        return profit;
    }
     public static int max_profit(int stock[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<stock.length;i++){
           if(buyPrice < stock[i]){
                    int profit = stock[i]-buyPrice;
                    maxProfit=Math.max(profit, maxProfit);
           }else{
            buyPrice=stock[i];
           }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int max_profit[]={7,5,3,6,1,8};

        System.out.println("Maximum Profit is "+ max_profit1(max_profit));
    }
}