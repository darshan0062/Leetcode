class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int ans=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums){
           if(h.containsKey(i)){
            count=(h.get(i));
            h.put(i,count+1);

           } else{
            h.put(i,1);

           }
        }
    for(int k: nums){
        if(h.get(k)==1){
            ans=k;
        }
    }
    
    
     return ans;
       }
      
    }
