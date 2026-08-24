class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet <Integer> s = new HashSet<>();
        if(k==0){
            return false;
        }
        k=Math.min(nums.length-1,k);
        for(int i=0;i<k;i++){
          if(s.contains(nums[i])){
            
              return true;
          }else{
               s.add(nums[i]);
          }
 
        }
        for(int i=k;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
        }else{
            
            s.remove(nums[i-k]);
            s.add(nums[i]);
            }
        

        }
        return false;
    }
}