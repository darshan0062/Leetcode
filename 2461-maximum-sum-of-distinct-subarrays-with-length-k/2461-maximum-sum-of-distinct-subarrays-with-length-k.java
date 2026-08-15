class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long max =sum;
        HashMap<Integer,Integer> h=new HashMap<>();
 for(int i = 0;i<k;i++){
    sum=sum+nums[i];
    if(h.containsKey(nums[i])){
        h.put(nums[i],h.get(nums[i])+1);
    }else{
        h.put(nums[i],1);
    }
    if(h.size()==k){
        
        max=sum;
    }
 }
    for(int i=k;i<nums.length;i++){
      int count = h.get(nums[i-k]);
      h.put(nums[i-k],count-1);
      if(h.get(nums[i-k])==0){
        h.remove(nums[i-k]);
      }
      if(h.containsKey(nums[i])){
        count=h.get(nums[i]);
        h.put(nums[i],count+1);
        }else{
            h.put(nums[i],1);
        }

        sum = sum-nums[i-k] +  nums[i];

    if(h.size()==k){
   
       max=Math.max(max,sum);
    }
    }
    return max;
    }

 }
      