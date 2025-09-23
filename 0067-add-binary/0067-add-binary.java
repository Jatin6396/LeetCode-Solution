class Solution {
    public String addBinary(String a, String b) {
        int sum=0;
        for(int i=a.length()-1;i>=0;i--){
            sum+=(a.charAt(i)-'0')*Math.pow(2,a.length()-1-i);
        }

        for(int i=b.length()-1;i>=0;i--){
            sum+=(b.charAt(i)-'0')*Math.pow(2,b.length()-1-i);
        }
        if(sum==0) return "0";
        
        StringBuilder sb = new StringBuilder();
     while (sum > 0) {
    sb.append(sum % 2);
    sum /= 2;
}
return sb.reverse().toString();
    }
}