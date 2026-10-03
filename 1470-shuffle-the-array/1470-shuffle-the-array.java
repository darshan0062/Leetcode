class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i + n];

        }

        return ans;
    }
}

// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] ans = new int[nums.length];
//         int k = 0;
//         int i = 0;
//         while (k < nums.length && i < n) {

//             ans[k] = nums[i];
//             k++;
//             ans[k] = nums[i + n];
//             k++;
//             i++;

//         }
//         return ans;
//     }
// }