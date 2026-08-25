class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxx=0;
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(h.containsKey(c)){
                h.remove(s.charAt(left));
                left++;
            }
            h.put(c,i);
           maxx= Math.max(maxx,i-left+1);
        }
        return maxx;
    }
}