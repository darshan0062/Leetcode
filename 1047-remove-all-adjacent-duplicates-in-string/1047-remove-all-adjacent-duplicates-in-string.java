class Solution {
    public String removeDuplicates(String s) {
       Stack<Character>h= new Stack<>();
       for(int i=0;i<s.length();i++){
        char a= s.charAt(i);
            if(!h.isEmpty()&& a==h.peek()){
            h.pop();
        }
        else{
            
            h.push(a);
        }
        }
       
      StringBuilder sb = new StringBuilder();

for (char ch : h) {
    sb.append(ch);
}

return sb.toString();

    }
}