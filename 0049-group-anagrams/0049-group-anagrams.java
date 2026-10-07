class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map =new HashMap<>();
         for( String word:strs){
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String ans = new String(arr);
        if (!map.containsKey(ans)){
            map.put(ans,new ArrayList<>());
        }
        map.get(ans).add(word);
         }
         return new ArrayList<>(map.values());
        

    }
}