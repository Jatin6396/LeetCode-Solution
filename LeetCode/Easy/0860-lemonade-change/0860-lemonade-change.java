class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                five--;
                ten++;
            }
            else{
                
                ten--;
                five--;
            }
        }
        
        if(five<0 || ten<0) return false;
        return true;
    }
}