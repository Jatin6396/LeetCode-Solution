class Solution {
    public int calPoints(String[] op) {
        ArrayList<Integer> ls=new ArrayList<>();


        for(String s:op){
            if(s.equals("C")) ls.remove(ls.size()-1);
            else if(s.equals("D")) ls.add(2*ls.get(ls.size()-1));
            else if(s.equals("+")) {
                ls.add(ls.get(ls.size()-1)+ls.get(ls.size()-2));

            }
            else{
                ls.add(Integer.parseInt(s));
            }
        }

        int sum=0;

        for(int i:ls) sum+=i;
        return sum;
    }
}