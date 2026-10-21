class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      HashMap<Integer,Integer>h=new HashMap<>();
      int max=0;
      int sum=max;
      int left=0;
        for(int i=0;i<nums.length;i++){
            while(h.containsKey(nums[i])){
                h.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
            h.put(nums[i],1);
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}