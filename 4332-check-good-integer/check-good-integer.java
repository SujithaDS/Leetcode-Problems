class Solution {
    public boolean checkGoodInteger(int n) {
        int digsum=0;
        int sqsum =0;
        while(n>0){
            int dig = n%10;
            digsum += dig;
            sqsum += dig*dig;
            n /=10;
        }
        int res = sqsum - digsum;
        if(res >= 50){
            return true;
        }
        return false;
    }
}