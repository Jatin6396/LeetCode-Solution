class Solution {
    public String minWindow(String s, String t) {
        int total=t.length();
        HashMap<Character,Integer> m=new HashMap<>();

        for(int i=0;i<t.length();i++){
            m.put(t.charAt(i),m.getOrDefault(t.charAt(i),0)+1);
        }

        //hasmap ma data srore lkaradiya


        int end=0,start=0;
        String str="";
        int ans=Integer.MAX_VALUE;
        int index=-1;

        while(end<s.length()){
            char ch=s.charAt(end);
            m.put(ch,m.getOrDefault(ch,0)-1);
            if(m.get(ch)>=0) total--;
            while(total==0 && start<=end){
                if(ans>end-start+1){
                    ans=end-start+1;
                    index=start;
                }

                char startChar = s.charAt(start);
                m.put(startChar, m.getOrDefault(startChar, 0) + 1);
                if (m.get(startChar) > 0) total++;
                start++;
            }
            end++;
           
        } 
        if(index==-1) return "";

        

        return s.substring(index,index+ans);
        

        
    }
}