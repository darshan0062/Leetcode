// class Solution {
//     public void rotate(int[] nums, int k) {
//         k=k%nums.length;
//       int[] temp = new int[k];
//       int j=0;
//        for (int i=nums.length-k;i<nums.length;i++){
//         temp[j]=nums[i];
//         j++;
//        }
//        int m=nums.length;
//        for(int i=nums.length-(k+1);i>=0;i--){
        
//              nums[m-1]=nums[i];
//              m--;
//        }
//        for(int i=0;i<=k-1;i++){
//         nums[i]=temp[i];
//        }

//     }
// }//1 hr

class Solution {
 public void rotate(int[] nums, int k) {
    k= k%nums.length;
    int r= 0;
    int l =nums.length-1;
    int temp =0;
    while(r<l){
    temp = nums[r];
    nums[r]=nums[l];
    nums[l]=temp;
    r++;
    l--;
    }
    int j=0;
    int s =k-1;
    while(j<s){
        temp=nums[j];
        nums[j]=nums[s];
        nums[s]=temp;
        j++;
        s--;
    }
    int n= nums.length-1;
    while(k<n){
         temp=nums[k];
        nums[k]=nums[n];
        nums[n]=temp;
        k++;
        n--;
    }

 
 }
 }
