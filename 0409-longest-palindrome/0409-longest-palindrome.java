class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        char[]ss=s.toCharArray();
        for(char i:ss){
            int count =0;
            if(h.containsKey(i)){
               count=h.get(i);
               h.put(i,count+1);
            }else{
                h.put(i,1);
            }

        }
        boolean odd=false;
        int length=0;
        for(char i:h.keySet()){
        if(h.get(i)%2==0){
            length=length+h.get(i);
        }else{
            length=length+h.get(i)-1;
            odd=true;
        }
        }
        if(odd==true){
            length++;
        }
           return length;
    }
}