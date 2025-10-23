class Solution {
    public String frequencySort(String s) {
        char[] cha=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:cha){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>>ls=new ArrayList<>(map.entrySet());
        ls.sort((a,b)->b.getValue()-a.getValue());
        StringBuffer res=new StringBuffer();

        for(Map.Entry<Character,Integer> i:ls){
            for(int j=0;j<i.getValue();j++){
                res.append(i.getKey());
            }
        }
        return res.toString();


    }
}