class Solution {
    public String reverseVowels(String s) {
        char temp=0;
        String vowels = "AaEeIiOoUu";
       char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
        while(i<j && vowels.indexOf(arr[i]) == -1) i++;
        while(i<j && vowels.indexOf(arr[j] )== -1) j--;
         temp= arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;j--;
        }

return new String(arr);
    }
}