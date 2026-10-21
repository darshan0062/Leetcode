class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      HashMap<Integer,Integer>h=new HashMap<>();
      int max=0;
      int sum=max;
      int left=0;
        for(int i=0;i<nums.length;i++){
            while(h.containsKey(nums[i])){//if dup found remove that element till that dup is found and move left pointer so that we can move forward till we find that dup and minus from sum
                h.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
            h.put(nums[i],1);
            sum+=nums[i];
            max=Math.max(max,sum);//calculate max
        }
        return max;
    }
}