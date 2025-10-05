class Solution {

    public static int helper(int amount,int[] coins,int i){
        if(amount==0) return 1;
        if(amount<0 || i>=coins.length) return 0;

        return helper(amount-coins[i],coins,i) +helper(amount,coins,i+1);
    }
    public int change(int amount, int[] coins) {
      return  helper(amount,coins,0);
    }
}