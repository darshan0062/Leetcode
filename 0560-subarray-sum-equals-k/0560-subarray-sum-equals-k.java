class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        h.put(0,1);
int sum=0;
        int count=0;
        for(int i:nums){
             sum =sum+i;
            if(h.containsKey(sum-k)){
                count =count +h.get(sum-k);
                h.put(sum,h.getOrDefault(sum,0)+1);
            }else{
                h.put(sum,h.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
}