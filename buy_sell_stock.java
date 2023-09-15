public class buy_sell_stock {
    public static int buy_sell_stock(int prices[])
    {
        //we have to take opposite conditions for buy price and profit 
        //as buy price shuould be min so initialize it with max value=999
        int buy_price=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy_price<prices[i])
            {
                int profit=prices[i]-buy_price;    //profit=cp-sp
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buy_price = prices[i];//when prise is less then buy stocks and sell when its price goes high(basic concept of stock marketing)
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) { 
        int prices[]={7,10,5,3,6,4};
        System.out.println(buy_sell_stock(prices));
    }
}
