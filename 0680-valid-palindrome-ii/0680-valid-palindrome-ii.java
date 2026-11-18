class Solution {
    public boolean validPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
          return ispalindrome( s,left + 1, right) || ispalindrome( s, left, right - 1);
       }
       right--;
       left++; 
       }
       return true;
}

 boolean ispalindrome(String s,int left,int right){
        while(left<right){
          if(s.charAt(left)!=s.charAt(right)){
            return false;
          }
          right--;
          left++;
        
       
       }
        return true;
 }
}