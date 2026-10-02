class Solution {
    public void sortColors(int[] nums) {
        int w=0;
        int r=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
        switch(nums[i]){
        case 0:
           w++;
           break;
        case 1:
           r++;
           break;
         case 2:
           b++;
           break;
        }
    }
    int i=0;
    while(w>0){
        nums[i]=0;
        i++;
        w--;
    }
    while(r>0){
        nums[i]=1;
        i++;
        r--;
    }
    while(b>0){
        nums[i]=2;
        i++;
        b--;
    }

}
}