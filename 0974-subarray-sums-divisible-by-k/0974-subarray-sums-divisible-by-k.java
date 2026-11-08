class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h= new HashMap<>();
        h.put(0,1);
        int sum=0;
        int count =0;
        for(int i:nums){
            sum+=i;
           int rem = ((sum % k) + k) % k;
           if(h.containsKey(rem)){
            count+=h.get(rem);
            h.put(rem,h.get(rem)+1);
           }else{
            h.put(rem,1);
           }
        }
        return count;
    }
}