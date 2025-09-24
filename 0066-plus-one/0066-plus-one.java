class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
        for(int x:digits){
            sum*=10;
            sum=(sum+x);
        }
        sum++;
        
        ArrayList<Integer> ls=new ArrayList<>();

        while(sum>0){
            ls.add(sum%10);
            sum/=10;
        }

        int[] arr=new int[ls.size()];
        Collections.reverse(ls);
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }

        return arr;

   
    }
}