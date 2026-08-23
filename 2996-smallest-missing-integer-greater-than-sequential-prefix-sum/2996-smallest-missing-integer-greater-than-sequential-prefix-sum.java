class Solution {
    public int missingInteger(int[] nums) {
        
       int i =0;
       int sum = nums[0];
     
       for(int j = 1;j<nums.length;j++){
        if(nums[i]==nums[j]-1){
            sum+=nums[j];
            i++;
        }
        else{
          break;
          }

       }
        

        for(int k=0;k<nums.length;k++){
            if(sum==nums[k]){
               sum =sum+1;
               k = -1;
            }
        
            }
            return sum;
        }
       }
    
