class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int num;
        HashMap<Integer,Integer>h=new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            num=nums[i];
            if(h.containsKey(num) && i-h.get(num)<=k){
                return true;
            }else{
                h.put(num,i);
            }
        }
        return false;
    }
}