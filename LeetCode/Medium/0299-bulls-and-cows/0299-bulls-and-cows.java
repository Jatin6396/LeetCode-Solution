class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Integer,Integer> hs1=new HashMap<>();
        HashMap<Integer,Integer> hs2=new HashMap<>();

        for(int i=0;i<secret.length();i++){
            int num=secret.charAt(i)-'0';
            hs1.put(i,num);
        }
        for(int i=0;i<guess.length();i++){
            int num=guess.charAt(i)-'0';
            hs2.put(i,num);
        }


        int cow=0;
        int bull=0;
        for(Map.Entry<Integer,Integer> e:hs1.entrySet()){
            int key=e.getKey();
            int val=e.getValue();
            if(hs2.get(key)==val){bull++;
              hs2.remove(key);
            }
            else if(hs2.containsValue(val)){
                cow++;

            }
        }

        return bull+"A"+cow+"B";
        
    }
}