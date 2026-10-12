class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
    return false;
}
        HashMap<Character,Integer>m=new HashMap<>();
        char[]arr=s1.toCharArray();
        for(char i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
       
            HashMap<Character,Integer>h=new HashMap<>();
             for(int i=0;i<s1.length();i++){
            char ss= s2.charAt(i);
             h.put(ss,h.getOrDefault(ss,0)+1);
        }
        int i=0;
        while(i<=s2.length()-s1.length()){
        if(m.equals(h)){
            return true;
        }
        else if(i == s2.length() - s1.length()) {
               break;
            }
             else{
            char out = s2.charAt(i);

         if (h.get(out) == 1) {
             h.remove(out);
          } else {
                   h.put(out, h.get(out) - 1);
                  }   
            }
            char in = s2.charAt(i + s1.length());

           h.put(in, h.getOrDefault(in, 0) + 1);
           i++;
        }
            
return false;
    }
}