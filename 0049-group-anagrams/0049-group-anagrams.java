class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> h=new HashMap<>();
        for(String i:strs){
            char[] arr=i.toCharArray();
            Arrays.sort(arr);
            String s= new String(arr);
            if(!h.containsKey(s)){
                h.put(s,new ArrayList());
                h.get(s).add(i);
            }else{
                h.get(s).add(i);
            }
        }
      return new ArrayList<>(h.values());
    }
}