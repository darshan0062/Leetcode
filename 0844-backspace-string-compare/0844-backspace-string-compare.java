class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> z=new Stack<>();
          Stack<Character> x=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
           if(a!='#'){
            
            z.push(a);

           }else{
            if (!z.isEmpty()) {
         z.pop();
         }
            

           }
        }
        for(int i=0;i<t.length();i++){
            char b=t.charAt(i);
           if(b!='#'){
            x.push(b);

           }else{
              if (!x.isEmpty()) {
         x.pop();
         }
            

           }
        }
       return z.equals(x); 
    }
}