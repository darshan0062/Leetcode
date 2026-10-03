class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]ans=new int[nums.length];
        int k=0;
        int i=0;
        while(k<nums.length && i<n){
        // for(int i =0;i<n;i++){
          ans[k]=nums[i];k++;
          ans[k]=nums[i+n];k++;
          i++;
          
        // }
        }
        return ans;
    }
}