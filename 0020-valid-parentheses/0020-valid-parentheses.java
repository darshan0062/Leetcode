class Solution {
    public boolean isValid(String s) {
        Stack<Character> t=new Stack<>();
        for( int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='('|| ch=='['){
            t.push(ch);
            }
        
            else {
                if(t.isEmpty()){
             return false;
                }
            
        
       else if (ch == ')' && t.peek() != '('){
            return false;
        }
        else if (ch == '}' && t.peek() != '{'){
            return false;
        }
         else if (ch == ']' && t.peek() != '['){
            return false;
         }
        
        else {
            t.pop();
        }
        }
        }
    
    return t.isEmpty();
        }
}
