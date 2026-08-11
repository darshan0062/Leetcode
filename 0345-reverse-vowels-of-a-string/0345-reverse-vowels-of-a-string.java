class Solution {
    public String reverseVowels(String s) {
        char temp;
        char[]ss=s.toCharArray();
       int i=0;
       int j=s.length()-1;
   
       while(i<j){
        if(!isVowel(ss[i])){
            i++;
        }
        else if(!isVowel(ss[j])){
            j--;
        }
        else{
            temp=ss[i];
            ss[i]=ss[j];
            ss[j]=temp;
            j--;
            i++;
        }
    
    }
    return new String(ss);
}
      boolean isVowel(char ss) {
        return ss == 'a' || ss == 'e' || ss == 'i' || ss == 'o' || ss == 'u'
            || ss == 'A' || ss == 'E' || ss == 'I' || ss == 'O' || ss == 'U';
    }
}