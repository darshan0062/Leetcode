class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h= new HashMap<>();
         for(int i:nums){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            } else{
                h.put(i,1);
            }
            
         }
         int[]ans= new int[k];
         int i=0;
        while(i<k){
           int max=Collections.max(h.values());
            for(int j:h.keySet()){
                if(h.get(j)==max){
                    ans[i]=j;
                    h.remove(j);
                    break;
                }
            }
            i++;
         }
          return ans;
    }
}