class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h =new HashMap<>();
        // int i=0;
        for(int x:nums){
            if(h.containsKey(x)){
                return true ;
            }
            else{
                h.put(x,0);
            }
            // i++;
        }
        return false ;
    }
}