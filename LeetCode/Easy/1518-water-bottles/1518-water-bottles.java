class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        sum+=numBottles/numExchange;
        return numBottles<=numExchange?sum:sum+1;
    }
}