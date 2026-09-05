class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
           if(min>prices[i])
           {
            min=prices[i];
           }
        
         int curr=prices[i]-min;
         if(curr>maxprofit)
         {
            maxprofit=curr;
         }
        }
        return maxprofit;
        
    }
}